
class ClassTest{
    String Name = "";
    int Age = 0;

    public static void main (String args[]){
        ClassTest Person1 = new ClassTest();

        Person1.Name = "VP";
        Person1.Age = 21;
        System.out.println("\nPerson 1 Details \nName : "+Person1.Name+"\nAge : "+Person1.Age);

        ClassTest Person2 = new ClassTest();
        Person2.Name = "PV";
        Person2.Age = 21;
        System.out.println("\nPerson 2 Details \nName : "+Person2.Name+"\nAge : "+Person2.Age);
    }
}