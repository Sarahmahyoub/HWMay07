package Class15;


public class E8IncrementingStudentStaticVariable {

    String Name;
    int ID;

    public static int numberOfStudents;

    E8IncrementingStudentStaticVariable(String Name, int ID) {


    }


    public static void main(String[] args) {
        E8IncrementingStudentStaticVariable obj = new E8IncrementingStudentStaticVariable("Matt", 56899);
        numberOfStudents++;
        E8IncrementingStudentStaticVariable obj2 = new E8IncrementingStudentStaticVariable("Jack", 52134);
        numberOfStudents++;
        E8IncrementingStudentStaticVariable obj3 = new E8IncrementingStudentStaticVariable("Mary", 55221);
        numberOfStudents++;
        System.out.println(E8IncrementingStudentStaticVariable.numberOfStudents);

    }
}
