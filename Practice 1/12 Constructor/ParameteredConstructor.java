
class ParameteredConstructor {

    String UserName = "";
    int UserAge = 0;

    ParameteredConstructor(){
        System.out.println("Empty Constructor Without Parameters");
    }

    ParameteredConstructor(String name, int age) {
        UserName = name;
        UserAge = age;
    }

    public static void main(String[] args) {
        ParameteredConstructor obj1 = new ParameteredConstructor("VP",21);
        System.out.println(obj1.UserAge);
        System.out.println(obj1.UserName);

        // ParameteredConstructor obj2 = new ParameteredConstructor();
    }
}
