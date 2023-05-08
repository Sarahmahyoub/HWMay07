package Project01;

public class Project07 {

    public static void main(String[] args) {

        int count = 10, num1 = 0, num2 = 1, sum = 0;

        System.out.print(num1+" ");


        for (int i = 1; i < count; ++i) {

            System.out.print(num2+" ");

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }

        System.out.println();
    }

}



