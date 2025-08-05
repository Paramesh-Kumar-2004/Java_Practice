

abstract class Vehicle{
    abstract void MaxSpeed();

    void Brand(){
        System.out.println("BMW");
    }
}

class Car extends Vehicle{
    void MaxSpeed(){
        System.out.println("Car : 200 KM/H");
    }

    void Brand(){
        System.out.println("Rolls Royce");
    }
}


class AbstractMethod{
    public static void main(String[] args){
        System.out.println("\nAbstract Method\n 1. Abstract Method Only Can Write Inside The Abstract Class\n 2. All Child Should Override The Abstract Method.(Method Function Both Are Same)\n");

        Car obj1 = new Car();
        obj1.MaxSpeed();
        obj1.Brand();
    }
}