package HWMay10;

public class CreditCard {

    double balance;

   double interest;

  double getInterest(double balance, double interest) {
      double result=0;
      result = balance * interest / 100;
      return result;

  }
    }
    class Visa extends CreditCard {


    }

    class AX extends CreditCard {

        @Override
        double getInterest(double balance, double interest) {
            return super.getInterest(balance, interest);

        }
    }
