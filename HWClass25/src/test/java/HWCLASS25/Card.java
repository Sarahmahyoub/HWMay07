package HWCLASS25;

import java.util.ArrayList;
import java.util.List;

public class Card {

    //Create a Card class that will have interest rate field and card type
    //  and a constructor that will initialize the fields.
    //  Create 3 objects of different card and store them into LinkedList.
    //  Using for loop/advanced for loop/ iterator access all methods of the class.

    double interest;
    String cardType;

    public Card(double interest, String cardType) {
        this.interest = interest;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "interest=" + interest +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
class CardTester{
    public static void main(String[] args) {

        Card card1=new Card(15.5, "Visa");
        Card card2=new Card(20.00, "AMEX");
        Card card3=new Card(25.00, "Discover");

        List<String> cardList=new ArrayList<>();
        cardList.add(card1.toString());
        cardList.add(card2.toString());
        cardList.add(card3.toString());

        for(String cards:cardList){

            System.out.println(cards);
        }


    }


}
