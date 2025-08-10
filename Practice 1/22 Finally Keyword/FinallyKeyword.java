import java.util.Scanner;

// try,catch,finally

class FinallyKeyword{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Finally");
        
        int VP = 0;

        try{
            VP = input.nextInt();
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        finally{
            System.out.println("Finally Result Is : "+VP);
        }
        input.close();
    }
}
