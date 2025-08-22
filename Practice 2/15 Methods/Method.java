
class Greet{
    void Greeting(String Name){
        System.out.println("Hi, Welcome "+Name);
    }

    static void func(){
        System.out.println("static Method");
    }   

    int Add(int a,int b){
        return a+b;
    }
}

class Method{
    static int Mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args){
        System.out.println("Methods");
        Greet obj1 = new Greet();
        obj1.Greeting("VP");
        Greet.func();
        System.out.println("Add : "+obj1.Add(4,8));

        // Inside Main class
        System.out.println("\nInside Main class : "+Mul(4,8));

    }
}