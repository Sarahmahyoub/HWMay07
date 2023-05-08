package HWMAY3;

public class HW1 {

    public void reverseWord (String i){

       StringBuilder Str=new StringBuilder(i);
        System.out.println(Str.reverse());

    }

    public static void main(String[] args) {

        HW1 obj=new HW1();
        obj.reverseWord("flowers");

    }
}
