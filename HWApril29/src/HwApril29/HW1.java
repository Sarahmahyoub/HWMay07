package HwApril29;



public class HW1 {

    void language (String word) {

        if (word.equals("France")) {

            System.out.println("Bonjour");

        } if (word.equals("Germany")){

            System.out.println("Hallo");

        }if (word.equals("Italy")){

            System.out.println("Ciao");

        }if (word.equals("China")){

            System.out.println("Nǐ hǎo");

    }
}

    public static void main(String[] args) {

             HW1 hello1=new HW1();
             String word="China";
             hello1.language(word);

    }
}

