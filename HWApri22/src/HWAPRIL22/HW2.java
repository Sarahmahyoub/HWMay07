package HWAPRIL22;

public class HW2 {

    public static void main(String[] args) {

        String str="This sentence I want to reverse";


        String [] strArr1=str.split(" ");


        for (int i = 0; i < strArr1.length; i++) {

            StringBuilder str2=new StringBuilder(strArr1[i]);


            System.out.print(str2.reverse()+" ");
        }





    }

    }




