package HWAPRIL22;

public class HW4 {

    public static void main(String[] args) {

        String word = "Happy Saturday";

        String word2 = "Happy weekend";

        String[] str = word.split(" ");

       String w=str[1];

        String[] str2 = word2.split(" ");

        String w2=str2[1];

        System.out.println(word.replaceAll(w,w2));


        }
    }
