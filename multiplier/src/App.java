
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Input number betwen 2147483647 and -2147483648\nto get multiplier table");

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if (val >= -2147483648 && val <=2147483647)
        {
            for (int i =1; i <= 9; i++) 
            {
                System.out.println(val + " x " + i + " = " + val * i);
            }
        }

    }
}
