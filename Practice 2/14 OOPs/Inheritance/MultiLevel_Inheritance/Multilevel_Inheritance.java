

class Dad{
    void Dad_Money(){
        System.out.println("Money from Dad Class");
    }
}


class Mom extends Dad{
    void Mom_Money(){
        System.out.println("Money from Mom Class");
    }
}


class Son extends Mom{

}

class Multilevel_Inheritance{
    public static void main(String[] args){
        System.out.println("Multilevel Inheritance");
        Son son1 = new Son();

        System.out.print("Son Access Dad's Money : ");
        son1.Dad_Money();

        System.out.print("Son Access Mom's Money : ");
        son1.Mom_Money();
    }
}