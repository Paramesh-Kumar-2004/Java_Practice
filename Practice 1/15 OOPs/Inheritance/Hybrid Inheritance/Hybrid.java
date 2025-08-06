
class Dad{
    void Dad_Money(){
        System.out.println("Dad's Money");
    }
}

class Mom extends Dad{
    void Mom_Money(){
        System.out.println("Mom's Money");
    }
}

class Son1 extends Dad{
    void Son1_Method(){
        System.out.println("Son1's Method");
    }
}

class Son2 extends Mom{
    void Son2_Method(){
        System.out.println("Son2's Method");
    }
}

class Hybrid{
    public static void main(String[] args){
        System.out.println("\nHybrid Inheritance\n");

        System.out.println("Access Dad's Money Using Son1 Object");
        Son1 Son1obj1 = new Son1();
        System.out.print("Son1 Object : ");
        Son1obj1.Dad_Money();

        System.out.println("\nAccess Dad's Money & Mom's Money Using Son2 Object");
        Son2 Son2obj1 = new Son2();
        System.out.print("Son2 Object : ");
        Son2obj1.Mom_Money();
        System.out.print("Son2 Object : ");
        Son2obj1.Dad_Money();
    }
}