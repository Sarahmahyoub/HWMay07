package HwApril29;

public class HW4 {

    boolean number(int num) {

        boolean isPrime=true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {

        HW4 prime=new HW4();

        int num=13;

        boolean print=prime.number(num);
        System.out.println(print);


    }

}