package Project01;

public class Project05 {

    public static void main(String[] args) {


        int x = 32;
        int y = 54;


        System.out.println("Number1 before swapping: " + x);
        System.out.println("Number1 before swapping: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println();

            System.out.println("Number 1 after swapping: " + x);
            System.out.println("Number 2 after swapping: " + y);


    }


}
