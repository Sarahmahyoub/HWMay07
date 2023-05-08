package HomWorks02;

public class HW01 {

    public static void main(String[] args) {


        String food = "pizza";

        int middle=food.length()/2;

        for (int i = 0; i < food.length(); i++) {

            if (!food.isEmpty() && food.charAt(i) >= 3) {


            }

        }
        System.out.println(food.charAt(middle));
    }
}