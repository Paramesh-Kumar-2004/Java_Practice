

class Student{
    String Name = "VP";
    static int age = 21;

    static void StaticMethod(){
        System.out.println("\nPrint From Static Method\n");
    }
}


class StatickeyWord{
    public static void main(String[] args){
        System.out.println("\nStatic Key Word\n 1. Static to Static Call Only");
        Student obj1 = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();

        obj1.Name = "Obj1";
        obj2.Name = "Obj2";
        obj3.Name = "Obj3";

        obj1.age = 22; 

        Student.StaticMethod(); // We Can Access The Static Key or Static Method using THe Class Name, No Need To Create A Object.

        System.out.println("\nObj1 :\n Name : "+obj1.Name+", Age : "+obj1.age);
        System.out.println("\nObj2 :\n Name : "+obj2.Name+", Age : "+obj2.age);
        System.out.println("\nObj1 :\n Name : "+obj3.Name+", Age : "+obj3.age);
    }
}