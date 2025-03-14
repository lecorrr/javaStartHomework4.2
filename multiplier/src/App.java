
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Input number betwen 214748364 and -214748364\nto get multiplier table");

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if (val >= -214748364 && val <=214748364)
        {
            for (int i =1; i <= 10; i++) 
            {
                System.out.println(val + " x " + i + " = " + val * i);
            }
        }

    }
}
