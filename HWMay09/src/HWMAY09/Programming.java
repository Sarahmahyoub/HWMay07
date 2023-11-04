package HWMAY09;

public class Programming {


    public void system() {

        System.out.println("I love programming languages");
    }

    public void system(String name) {

        System.out.println("I love " + name);
    }


    public static void main(String[] args) {

        Programming obj=new Programming();
        obj.system();
        obj.system("Java");
    }
}