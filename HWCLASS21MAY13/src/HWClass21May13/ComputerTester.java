package HWClass21May13;
public class ComputerTester {

    public static void main(String[] args) {

        Computer obj[] = {new Apple(), new Lenovo(), new HP(), new Dell()};

        Computer obj3=new HP();
        ((HP) obj3).CPU();
        ((HP) obj3).RAM();
        Computer obj4=new Lenovo();
        ((Lenovo) obj4).CPU();
        ((Lenovo) obj4).RAM();

        for (Computer comp : obj) {

            if (comp instanceof Apple) {
                ((Apple) comp).touchScreen();
            } else if (comp instanceof Dell) {
                ((Dell) comp).Battery();

                Computer obj2=new Apple();
                obj2.CPU();
                obj2. RAM();
            }
        }
    }
}