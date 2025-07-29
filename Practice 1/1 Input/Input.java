import java.util.Scanner;

class Input{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter You Integer : ");
        int PV = input.nextInt();
        input.nextLine();

        System.out.print("Enter Your String : ");
        String VP = input.nextLine();

        char VV = input.next().charAt(0);

        System.out.println("Your Integer : " +PV);
        System.out.println("Your String : " +VP);
        System.out.println("Your Char : " +VV);
        
    }
}