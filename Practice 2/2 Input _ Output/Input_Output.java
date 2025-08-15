import java.util.*;

class Input_Output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eneter The Number  : ");
        int VP = input.nextInt();
        input.nextLine();
        System.out.print("Eneter The String  : ");
        String PV = input.nextLine();
        System.out.print("Enter The Char : ");
        char VV = input.next().charAt(0);

        // input.nextLong(), input.nextFloat(), input.nextDouble()

        System.out.println("Number : " + VP);
        System.out.println("String : " + PV);
        System.out.println("Char   : " + VV);

        input.close();

    }
}