package HWClass21May13;

public class Computer {
    void CPU(){
        System.out.println("Core-based range should be good");
    }
    void RAM(){
        System.out.println("Ram size should big for faster processing computer");
    }
}
class Apple extends Computer {
    void CPU(){
        System.out.println("Core-based range is Core i5");
    }
    void RAM(){
        System.out.println("Ram size is 16GB");
    }

    void touchScreen(){
        System.out.println("Touch screen positive");
    }
}

class Lenovo extends Computer {
    void CPU(){
        System.out.println("Core-based range is Core i6");
    }
    void RAM(){
        System.out.println("Ram size is 128GB");
    }
}

class HP extends Computer {
    void CPU(){
        System.out.println("Core-based range is Core i7");
    }
    void RAM(){
        System.out.println("Ram size is 128GB");
    }
}
class Dell extends Computer {
    void CPU(){
        System.out.println("Core-based range is Core i5");
    }
    void RAM(){
        System.out.println("Ram size is 64GB");
    }
    void Battery(){
        System.out.println("Long battery life");
    }

}