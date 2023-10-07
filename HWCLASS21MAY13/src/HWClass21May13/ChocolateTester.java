package HWClass21May13;

public class ChocolateTester {

    public static void main(String[] args) {

        Chocolate[] obj = {new darkChocolate("Lindt", "Dark Brown", 1),
                new whiteChocolate("Kinder Bueno", "White", 3),
                new milkChocolate("Cadbury", "Brown", 2)};

        for (Chocolate choco : obj) {
            choco.printInfo();
            choco.taste();

                if (choco instanceof darkChocolate) {
                    ((darkChocolate) choco).texture();
                } else if (choco instanceof whiteChocolate) {
                    ((whiteChocolate) choco).make();
                }

            }
        }

    }








