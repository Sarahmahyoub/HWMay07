package HomeWorksArrays;

public class HWArray05 {

    public static void main(String[] args) {

        int[][] num = {
                {10, 25, 30},
                {37, 70, 73},
                {21, 40, 55},
                {29, 66, 18},
        };


        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {

            if (num[i][j]%2=0) {
                System.out.print(num[i][j] + " ");

                }

            }

        }


    }

}