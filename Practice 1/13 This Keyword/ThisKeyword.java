
class ThisKeyword {

    String UserName = "";

    void SetNameWithoutThis(String UserName) {
        System.out.println("Set Name Without This Keyword");
        // UserName = UserName;  // UserName it take from function's parameters.
        System.out.println("User Name Without This : " + UserName);
    }

    void SetNameWithThis(String UserName) {
        System.out.println("Set Name With This Keyword");
        this.UserName = UserName; // This Keyword this.UserName Means - obj1.UserName, Obj2.UserName
        System.out.println("User Name With This : " + UserName);
    }

    public static void main(String[] args) {

        ThisKeyword obj1 = new ThisKeyword();

        obj1.SetNameWithoutThis("Name");
        System.out.println(obj1.UserName);

        ThisKeyword obj2 = new ThisKeyword();
        obj2.SetNameWithThis("VP");

    }
}
