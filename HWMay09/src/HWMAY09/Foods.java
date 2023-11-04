package HWMAY09;

public class Foods {

    private void iceCream ( String name, String name2){

        System.out.println(name+" "+name2);
    }

    private void iceCream ( int num, String name){

        System.out.println(num+" "+name);
    }

    private void iceCream ( String name, int num){

        System.out.println(name+" is number "+num);
    }


    public static void main(String[] args) {

        Foods obj=new Foods();
        obj.iceCream("Chocolate", "Ice cream");
        obj.iceCream(3, "Chocolates Ice creams");
        obj.iceCream("Chocolate ice creams",1);

    }
}
