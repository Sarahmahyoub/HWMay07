package Project1;

public class Project07 {

    public static void main(String[] args) {

        int a,b,c;
        a = 0;
        b = 1;

        System.out.print(a + " ");


        for (int i = 1; i <= 10; ++i) {
            c = a + b;

            System.out.print(b + " ");

            a = b;
            b = c;

        }

        System.out.println();
    }

}



