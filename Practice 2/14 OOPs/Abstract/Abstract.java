

abstract class Member{
    public String Name = "";
    abstract void Wish();
}

class Teacher extends Member{
    void Wish(){
        System.out.println("Welcome Teacher");
    }
}

class Student extends Member{
    void Wish(){
        System.out.println("Welcome Student");
    }
}


class Abstract{
    public static void main(String[] args){
        System.out.println("Abstract");
        Teacher t1 = new Teacher();
        t1.Wish();

        Student s1 = new Student();
        s1.Wish();
    }
}