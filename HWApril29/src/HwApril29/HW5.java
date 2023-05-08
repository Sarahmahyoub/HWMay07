package HwApril29;

public class HW5 {

    char getGrade (int score, char grade) {


        if (score > 90) {
           grade='A';
            return grade;
        }
        if (score > 80) {
            grade='A';
           return grade;
        }
        if (score > 70) {
            grade='C';
          return grade;
        }
        if (score > 50) {
            grade='D';
            return grade;

           }else {
            grade='F';
            return grade;
        }

    }

    public static void main(String[] args) {

        HW5 num=new HW5();

        int score=95;
        char grade=' ';
       char grade1= num.getGrade(score, grade);
        System.out.println(grade1);


    }

}