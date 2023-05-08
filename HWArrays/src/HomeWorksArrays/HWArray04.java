package HomeWorksArrays;

public class HWArray04 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30},
                {60, 70, 80},
                {30, 40, 60},
        };


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

            }

            int[] col = numbers[i];
            for (int l = 0; l < col.length; l++) {
                    sum=sum+col[l];
                }

            }
            System.out.println(sum);

        }

    }
