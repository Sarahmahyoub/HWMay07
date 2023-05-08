package HWMAY3;

public class HW2 {

    private void word (String i){

        System.out.println(i.toLowerCase().replaceAll("[bcdfghjklmnpqrstvwxyz]",""));

    }

    public static void main(String[] args) {

        HW2 obj=new HW2();
        obj.word("Technology");

    }
}
