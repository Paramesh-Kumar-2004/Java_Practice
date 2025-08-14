import java.util.*;

class Test2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("VP");

        System.out.print("Enter The int : ");
        int VP = input.nextInt();
        input.nextLine();
        System.out.print("Enter The Str : ");
        String PV = input.nextLine();
        System.out.print("Enter The Chr : ");
        char VV = input.next().charAt(0);

        System.out.println("\nInt - VP : "+VP);
        System.out.println("Str - PV : "+PV);
        System.out.println("Chr - VP : "+VV);

        input.close();
    }
}
