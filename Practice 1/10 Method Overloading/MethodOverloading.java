

class MethodOverloading{

    void display(){
        System.out.println("First Function");
    }

    void display(int VP){
        System.out.println("Second Function");
    }

    void display(String VP){
        System.out.println("Third Function");
    }

    public static void main(String [] args){

        MethodOverloading obj1 = new MethodOverloading();
        obj1.display();
        obj1.display(2004);
        obj1.display("VP");
        System.out.println("Based On Parameters");
        
    }
}