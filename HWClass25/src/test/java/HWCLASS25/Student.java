package HWCLASS25;

import java.util.HashMap;

public class Student {

//Create a Set that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.

    public static void main(String[] args) {

        HashMap<String,Integer> Students=new HashMap<>();

        Students.put("Vald",23545);
        Students.put("Alina",44654);
        Students.put("Lean",54548);
        Students.put("Darko",45214);

        System.out.println(Students.keySet());
    }
}
