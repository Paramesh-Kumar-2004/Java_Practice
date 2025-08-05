
class Dad {
    String Dad_Name = "Dad Class";
    int Money = 2004;
    void DadMethod(){
        System.out.println("Dad's Method");
    }
}

class Son extends Dad {

    Son() {
        System.out.println("Constructor From Son Class");
    }
    String Son_Name = "Son Class";
    void SonMethod(){
        System.out.println("Son's Method");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("\nSingle Inheritance\n");
        System.out.println("\nOne Class Derived From Another Class. Dad -> Son\n");

        Son Son1 = new Son();
        System.out.println("Taking The Dad's Money Using Son Object : Rs:"+Son1.Money);
        Son1.DadMethod();
    }
}