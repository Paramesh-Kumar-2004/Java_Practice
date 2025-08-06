class  Dad{
    void DadMoney(){
        System.out.println("Dad Money");
    }
}

class Son extends Dad{
    void Son_Method(){
        System.out.println("\nSon's Class");
    }
}

class Mom extends  Dad{
    void Mom_Method(){
        System.out.println("\nMom's Method");
    }
}

class Hierarchical{
    public static void main(String[] args){
        
        Mom objMom = new Mom();
        objMom.Mom_Method();
        System.out.print("Mom Access Dad's Money : ");
        objMom.DadMoney();


        Son Son1 = new Son();
        Son1.Son_Method();
        System.out.print("Son Access Dad's Money : ");
        Son1.DadMoney();

    }
}