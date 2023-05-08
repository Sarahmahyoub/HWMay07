package HWAPRIL22;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {


    Scanner inp = new Scanner(System.in);
        System.out.print("In:");
    String givenString = inp.nextLine();
    //write your code below
    String reverseStr = "";

    int strLength = givenString.length();

        for (int i = (strLength - 1); i >=0; --i) {
        reverseStr = reverseStr + givenString.charAt(i);
    }

        if (givenString.toLowerCase().equals(reverseStr.toLowerCase())) {
        System.out.println("true");
    }
        else {
        System.out.println("false");
    }
}

}
