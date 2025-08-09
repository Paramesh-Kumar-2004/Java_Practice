
interface Person {
    // Inside The Interface Alll The Functions Are Abstract. Connot Create A Object.
    int Age = 21; // Default : public static final.

    void Savings();

    // Using static of default we can create a body for a function.
    static String Name = "VP"; // default not allowed

    default void VP() {
        System.out.println("Default void function");
    }

}

class Details implements Person {
    @Override
    public void Savings() {
        System.out.println("2K/M");
    }
}

class Interface {
    public static void main(String[] args) {

        Details obj1 = new Details();
        obj1.Savings();
        System.out.println("Age : " + Person.Age);

        System.out.println("\nDefault & Static Keyword In Interface");
        obj1.VP();
        System.out.println("Name : " + Person.Name);

    }
}