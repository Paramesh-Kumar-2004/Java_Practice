
class ConstructorTest{

    String UserName = "";
    int UserAge = 0;

    ConstructorTest(String name,int age){
        UserName = name;
        UserAge = age;
    }
    
    // Sending The Values To The Parameter (Constructor)
    public static void main(String[] ags){

        ConstructorTest obj1 = new ConstructorTest("VP",21);
        
        System.out.println("Name : "+obj1.UserName);
        System.out.println("Age : "+obj1.UserAge);

    }
}