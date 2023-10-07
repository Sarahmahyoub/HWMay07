package HWMAY09;

public class Food {

    static void iceCream ( String name, String name2){

        System.out.println(name+" "+name2);
    }

    static void iceCream ( int num, String name){

        System.out.println(num+" "+name);
    }

    static void iceCream ( String name, int num){

        System.out.println(name+" is number "+num);
    }


    public static void main(String[] args) {

        Food.iceCream("Chocolate", "Ice cream");
        Food.iceCream(3, "Chocolates Ice creams");
        Food.iceCream("Chocolate ice creams",1);

    }
}
