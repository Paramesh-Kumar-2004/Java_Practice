import java.util.Scanner;

// Create A Own Exception Error handling


class Errorhandler extends Exception{
    public Errorhandler(String msg){
        super(msg);
    }
}


class CustomExceptionHandling{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Custom Exception Handling");

        try{
            System.out.print("Enter Your Age : ");
            int Age = input.nextInt();
            if(Age<=18){
                throw new Errorhandler("Age Should Be Grater Than 18");
            }
            else{
                System.out.println("Age : "+Age);
            }
        }        
        catch(Exception e){
            System.out.println("\nError : "+e+"\n");
        }
    }
}