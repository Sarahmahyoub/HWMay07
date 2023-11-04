package Review3;

import com.sun.tools.javac.Main;

public class LogicalOperators {
    public static void main(String[] args) {



    boolean loginButtonDisplayed=true;
    boolean loginclickable=true;

    if (loginButtonDisplayed && loginclickable){
        System.out.println("Test passed");
    }else{

        System.out.println("Test failed");
    }

     System.out.println("-----Logical or-------");

    boolean pictureDisplayed=true;
    String accountName="Syntax";

    if (pictureDisplayed || accountName.equals("Syntax")){

        System.out.println("Login was successful");
    }else{

        System.out.println("User was not able to login");
    }

        System.out.println("-----Logical Not-------");

        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Hello";

        if(!str.equals("Hello")){

            System.out.println("Not Hello");
        }

        System.out.println("-----Logical Not-------");

        boolean confirmSelected=false;

        if (!confirmSelected){

            System.out.println("Lets click on confirm checkbox");
        }else{

            System.out.println("Click on pay button");
        }





}


     }
