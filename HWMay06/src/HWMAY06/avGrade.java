package HWMAY06;



public class avGrade {

    String name;

    int scienceGrade;

    int englishGrade;

    int mathGrad;


    avGrade(String name, int scienceGrade,int englishGrade,int mathGrad) {

        this.name = name;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
        this.mathGrad = mathGrad;

       }

    int Average(){

        return (scienceGrade+englishGrade+mathGrad)/3;

    }

    void print(){

        System.out.println(Average());
    }


    public static void main(String[] args) {
        avGrade obj=new avGrade("John", 85, 96, 65);
        avGrade obj2=new avGrade("Matt", 65, 88, 72);
        avGrade obj3=new avGrade("Lean", 90, 70, 51);
        avGrade obj4=new avGrade("Sarah", 87, 94, 77);
        avGrade obj5=new avGrade("Suzanne", 66, 57, 70);

        obj.print();
        obj2.print();
        obj3.print();
        obj4.print();
        obj5.print();


    }
}
