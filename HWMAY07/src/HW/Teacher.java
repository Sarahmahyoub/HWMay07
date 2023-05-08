package HW;

public class Teacher {

    String name;

    void teaching() {


        System.out.println("Teacher teaches students");

    }

}
  class mathTeacher extends Teacher {

        void teaching2() {
            System.out.println(name+" teaches math");
        }
    }

   class chemistryTeacher extends Teacher {

        void teaching3() {

            System.out.println(name+" teaches chemistry");
        }
    }

    class pianoTeacher extends Teacher {

        void teaching4() {

            System.out.println(name+" teaches piano");
        }

    }

    class TeacherTester {
        public static void main(String[] args) {
            Teacher obj = new Teacher();
            obj.name = "Nancy";
            obj.teaching();


            System.out.println("-------");
            mathTeacher obj2 = new mathTeacher();
            obj2.name = "Allen";
            obj2.teaching2();


            System.out.println("-------");

            chemistryTeacher obj3 = new chemistryTeacher();
            obj3.name = "John";
            obj3.teaching3();


            System.out.println("-------");
            pianoTeacher obj4 = new pianoTeacher();
            obj4.name = ("Sarah");
            obj4.teaching4();

        }
    }

