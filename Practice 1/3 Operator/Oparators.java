import java.util.Scanner;

class Operator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter VP : ");
        // int VP = input.nextInt();
        // System.out.print("Enter PV : ");
        // int PV = input.nextInt();
        // input.nextLine();

        // int VP = 52;
        // int PV = 126;

        // System.out.print("Enter OP : ");
        // int OP = input.next().charAt(0);

        // if(OP == '+')
        // {
        //     System.out.println("Add : "+ (VP+PV));
        // }

        // else if(OP == '-'){
        //     System.out.println("Minas : "+ (VP-PV));
        // }

        // else{
        //     System.out.println("Only + or -");
        // }

        String a = "VP";
        String b = "vp";
        System.out.print(a.equals(b.toUpperCase()));

        input.close();
    }
}