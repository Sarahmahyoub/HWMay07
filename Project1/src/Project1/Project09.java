package Project1;

public class Project09 {

    public static void main(String[] args) {


        int[] arr= {150, 340, 225, 370, 480, 723, 90};

        int max=0;
        int secondMax=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);


    }

    }

