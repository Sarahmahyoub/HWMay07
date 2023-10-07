package Project1;

public class Project04 {

    public static void main(String[] args) {

        int[][] num = {{25, 62, 36, 95, 22},
                {23, 56, 34, 96,},
                {11, 26, 55, 15, 12},
        };

        int sum=0;
        for (int[] j : num) {
            for (int i : j) {

                if (i % 2 == 0) {

                    sum = sum + i;

            }
            }

        }
        System.out.println(sum);


        System.out.println("-----");

        int sum2=0;

        for (int[] l : num) {
            for (int k : l) {

                if (k % 2 != 0) {

                    sum2 = sum2 + k;
                }

            }
        }
        System.out.println(sum2);

    }
}
