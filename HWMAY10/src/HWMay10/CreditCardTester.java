package HWMay10;

public class CreditCardTester {

    public static void main(String[] args) {

        CreditCard obj=new CreditCard();
        System.out.println(obj.getInterest(5000, 17.5));

        Visa obj2=new Visa();
        System.out.println(obj2.getInterest(2000, 11.5));

        AX obj3=new AX();
        System.out.println(obj3.getInterest(1500.5, 9.5));


    }
}
