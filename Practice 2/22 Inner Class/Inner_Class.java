
class Outer_Class{
    void Outer_Method(){
        System.out.println("Outer Class");
    }

    class Inside_Class{
        void Inside_Method(){
            System.out.println("Inner Class");
        }   
    }
}

class Inner_Class{
    public static void main(String[] args){
        Outer_Class Out_Obj = new Outer_Class();
        Out_Obj.Outer_Method();

        //Outer Class Name "." Inner Class Name = Out Class Obj. new Inner Class();
        Outer_Class.Inside_Class In_Obj = Out_Obj.new Inside_Class();
        In_Obj.Inside_Method();

    }
}