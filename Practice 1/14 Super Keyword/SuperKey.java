

class Dad{

    int VP = 2004; // Using Super We Can Access Variables, Functions & Pass The Parameters

    Dad(String DadName){
        System.out.println("Dad Name : "+DadName);
    }

    void Money(){
        System.out.println("Dad's Money");
    }
}

class Son extends Dad{
    Son(String DadName){
        super(DadName);
        super.Money();
        System.out.println("Son Class End");
    }
}


class SuperKey{
    public static void main(String[] args){
        System.out.println("\nUsing Super Keyword, We Can Access Variables, Functions & Pass The Parameters\n");

        Son obj1 = new Son("Selvaraj");  // Justing Creating The Object For Son Class. It Call The Son Class Constructor.

    }
}