

class Method_Overloading{

    static void Add(int a, int b){
        System.out.println("Add a+b   : "+(a+b));
    }

    static void Add(int a, int b, int c){
        System.out.println("Add a+b+c : "+(a+b+c));
    }

    public static void main(String[] args){
        System.out.println("Method Overloading"); // Method name is same, but parameters is different,
        int VP = 4;
        int PV = 8;
        int VV = 2004;

        Add(VP,PV);
        Add(VP,PV,VV);
    }
}