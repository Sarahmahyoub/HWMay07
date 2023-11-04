package HWCLASS25;

import java.util.ArrayList;

public class Insurance {

    //Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    // Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    // Create 3 objects of the sub classes and store them in ArrayList.
    // Using for loop/advanced for loop/ iterator access all methods of the class.

    String insuranceName;

     public void getQuote(){

     };

     public void cancelInsurance(){

     };

}
class CarInsurance extends Insurance{

    String carModel="Hyundai";

    @Override
    public void getQuote() {
        System.out.println("Get insurance Quote for "+carModel);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancels Insurance for "+carModel);
    }
}
class PetInsurance extends Insurance{

    String petType="Bird";

    @Override
    public void getQuote() {
        System.out.println("Get insurance Quote "+petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancels insurance "+petType);
    }
}
class HealthInsurance extends Insurance{


    @Override
    public void getQuote() {
        System.out.println("Get insurance Quote");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancels insurance");
    }
}
class InsuranceTester{
    public static void main(String[] args) {
        CarInsurance car=new CarInsurance();
        car.getQuote();
        car.cancelInsurance();

        PetInsurance pet=new PetInsurance();
        pet.getQuote();
        pet.cancelInsurance();

        HealthInsurance health=new HealthInsurance();
        health.getQuote();
        health.cancelInsurance();

        ArrayList<Insurance> arrayList=new ArrayList<>();

        arrayList.add(car);
        arrayList.add(pet);
        arrayList.add(health);

        for (Insurance insurance:arrayList){

            System.out.println(insurance);


        }

    }

}

