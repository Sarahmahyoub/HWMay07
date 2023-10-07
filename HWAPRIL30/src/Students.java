public class Students {


    String Name;
    int ID;

    public static int numberOfStudents;

    Students(String Name, int ID) {

    }

    public static void main(String[] args) {
        Students OBJ = new Students("Matt", 56998);
        numberOfStudents++;
        Students obj2 = new Students("Jack", 52134);
        numberOfStudents++;
        Students obj3 = new Students("Mary", 55221);
        numberOfStudents++;
        System.out.println(Students.numberOfStudents);

    }
}
