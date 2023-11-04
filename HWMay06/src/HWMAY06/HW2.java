package HWMAY06;

public class HW2 {

    String firstName;

    String lastName;

    int age;

    char gender;


    HW2() {

        System.out.println("Default Constructor");
    }
    public HW2(String firstName, String lastName) {

        System.out.println("Public Constructor");
    }

    private HW2(String firstName, int age) {

        System.out.println("Private Constructor");
    }

    protected HW2(String firstName, char gender) {

        System.out.println("Protected Constructor");
    }

 public static void main(String[] args) {
     HW2 obj = new HW2();
     HW2 obj2 = new HW2("Sarah","Mahyoub");
     HW2 obj3 = new HW2("Sarah", 40);
     HW2 obj4 = new HW2("Sarah", 'F');



 }
    }
