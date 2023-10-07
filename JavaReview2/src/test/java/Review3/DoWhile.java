package Review3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);

        int sum=0;
        System.out.println("Please enter integer values");

        while(key.hasNextInt()) {

            int num = key.nextInt();

            sum += num;



        }
        System.out.println("Sum ="+sum);
    }
}
