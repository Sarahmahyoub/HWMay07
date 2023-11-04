package Project1;

public class Project08 {

    public static void main(String[] args) {


        int[] number = {150, 340, 225, 370, 480, 723, 90};

        int max=number[0];
        int min=number[0];

        for (int j: number){
            if(j>max){
                max=j;

            }
            else if (j<min) {

                min=j;

            }
            }
        System.out.println(max);
        System.out.println(min);
    }

    }

