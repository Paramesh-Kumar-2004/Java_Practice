import java.util.Scanner;

// Exception Handling Is Handle Run Time Errors
// try,catch


class Exception_Handling{
    public static void main(String [] args){
        System.out.println("Exception Handler");

        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Enter String To See The Error Handler.\nEnter The Number VP : ");
            int VP = input.nextInt();
            System.out.println("VP : "+VP);
        }

        catch(Exception e){ // General Exception Handler For All Exception Errors.
            System.out.println("\nError : \n"+e+"\n");
        }
        input.close();
    }
}