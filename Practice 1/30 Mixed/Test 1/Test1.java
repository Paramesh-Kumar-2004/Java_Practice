// Creating a public function inside the class and access that inside the main function

class Dog{
    public void Eat1(){
        System.out.println("Dog Is Eating");
    }

    void Eat2(){
        System.out.println("Dog Is Eating");
    }
}

class Test1{
    public static void main(String[] args){
        Dog obj1 = new Dog();
        obj1.Eat1();
        obj1.Eat2();

        // Eat1(); // This Is Not Working
    }
}


