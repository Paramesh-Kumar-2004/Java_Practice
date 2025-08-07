
// In Java Multilple Inheritance Not There.(directly)
// But Using interface we can Achive Multiple Inheritance.
// Interface Does'nt Have A Body.


interface Mom{
    // void Money(){
    //     System.out.println("Mom's Money");
    // }
    void Money();
}

interface Dad{
    // void Money(){
    //     System.out.println("Dad's Money");
    // }
    void Money();
}

class Son implements Mom,Dad{
    public void Money(){
        System.out.println("Son Using Mom's Money");
    }
}

class MultipleInheritance{
    public static void main(String[] args){
        
        Son obj1 = new Son();
        obj1.Money();

    }
}