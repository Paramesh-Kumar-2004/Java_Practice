

class VP{
    final int Year = 2004;

    final void Info(){
        System.out.println("Info Function Called, We Connot Override This Function");
    }
}

final class VP2{
    VP2(){
        System.out.println("\nFinal Class, Connot Extends This Class");
    }
}

class FinalKeyword{
    public static void main(String[] args){
        System.out.println("Final Is Setting The Value, It Connot Be Change.\nWe Connot Override");
        System.out.println("Final Keyword, Final Method, Final Class\n");
        System.out.println("Final Keyword - Connot Change(like const in js),\nFinal Method - Connot Override The Function,\nFinal Class - Connot Extends The Class.\n");

        VP obj1 = new VP();
        System.out.println("Connot Change The Year Value Because This Is Final :\nYear : "+obj1.Year);

        obj1.Info();

        VP2 obj2 = new VP2();
    }
}