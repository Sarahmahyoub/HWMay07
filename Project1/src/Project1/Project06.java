package Project1;

import java.util.Scanner;

public class Project06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime: ");
        int number = input.nextInt();


        boolean Prime = true;

        if (number <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    Prime = false;
                    break;

                }
            }
        }

        if (Prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }


    }

