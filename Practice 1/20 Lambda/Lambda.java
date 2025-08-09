

interface LambdaClass{
    void LambdaFunction();
}

class Lambda{
    public static void main(String[] args){
        System.out.println("Lambda");

        LambdaClass obj1 = new LambdaClass(){
            public void LambdaFunction(){
                System.out.println("Lamda Function");
            };
        };
        obj1.LambdaFunction();


        LambdaClass obj2 = ()->{
            System.out.println("Lambda Function ShortCut");
        };

        obj2.LambdaFunction();

    }
}