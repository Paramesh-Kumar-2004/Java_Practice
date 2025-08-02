
class FunctionTest{

    void add(int V, int P){
        System.out.println("V : "+V+"\nP : "+P+"\nV + P : "+(V+P));
        Test();
    }

    void Test(){
        System.out.println("\nFunction Call From Add Function, Without Creating An Object\n Only We Can Call The Function Static to Static");
    }

    static void StaticFunctionTest(){
        System.out.println("\nStatic Function \nWe Can Call The Static To Static, Without Creating An Object");
    }

    public static void main(String[] args){

        FunctionTest obj1 = new FunctionTest();
        obj1.add(4,8);
        StaticFunctionTest();

    }
}