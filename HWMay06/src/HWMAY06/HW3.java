package HWMAY06;

public class HW3 {

   String firstName;

  String lastName;


   // static
    HW3(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Static Constructor is Not possible");
    }

/

    public static void main(String[] args) {
        HW3 obj=new HW3("Sarah", "Mahyoub");


    }



}
