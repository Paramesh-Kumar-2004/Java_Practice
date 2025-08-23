

class FinalClass{
    final int year = 2004;
    final void Final_Method(){
        System.out.println("Final Method");
    }
}

class subClass extends FinalClass{
    // void Final_Method(){
    //     System.out.println("Edit");
    // }
}

class Final_Keyword{
    public static void main(String[] args){
        subClass obj1 = new subClass();
        obj1.Final_Method();
    }
}
