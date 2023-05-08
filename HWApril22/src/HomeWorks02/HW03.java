package HomWorks02;

import java.util.Scanner;

public class HW03 {

    public static void main(String[] args) {

        Scanner key= new Scanner(System.in);
        System.out.println("Mom's first name ");
        Scanner key2= new Scanner(System.in);
        System.out.println("Dad's first name ");
        Scanner key3= new Scanner(System.in);
        System.out.println("Boy or Girl? ");

        String name=key.next();
        String name2=key2.next();
        String gender=key3.next();
        String gender1="boy";
        String gender2="girl";
        int endingIndex=name2.length()-3;
        int endingIndex2=name.length()-2;
        String newName= name.substring(0, 2) + name2.substring(endingIndex);
        String newName2= name2.substring(0, 3) + name.substring(endingIndex2);

        if (gender.equals(gender2)) {

            System.out.print("Suggested baby name: "+newName.toUpperCase());

        }else if (gender.equals(gender1)){

            System.out.print("Suggested baby name: "+newName2.toUpperCase());


        }

    }
}
