
class GrandFather{
    void GrandFatherMethod(){
        System.out.println("Grand Father Class");
    }
}

class Father extends GrandFather{
    void FatherMethod(){
        System.out.println("Father Class");
    }

    void OverRideMethod(){
        System.out.println("\nOver Ride Method From Father Class\n");
    }
}

class Son extends Father{
    void SonMethod(){
        System.out.println("Son Class");
    }

    void OverRideMethod(){
        System.out.println("\nOver Ride Method From Son Class\n");
    }
}

class MultiLevel{
    public static void main(String[] args){
        System.out.println("\nMulti Level Inheritance\n");
        System.out.println("\nOne Class Derived From One Class, That Class Derived From Another Class (like(ex) : Steps). GrandFather -> Father,Father -> Son\n");

        Son Son1 = new Son();
        Son1.FatherMethod();
        Son1.SonMethod();
        Son1.GrandFatherMethod();

        Son1.OverRideMethod();
    }
}