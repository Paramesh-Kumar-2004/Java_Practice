import java.util.*;

class Ternary_Operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ternary Operator");

        System.out.print("Enter The Number : ");
        int VP = scan.nextInt();

        String PV = (VP < 0) ? "Negative Number" : "Positive Number";
        System.out.println("Ternary With Three Condition : " + PV);

        String VV = (VP < 0) ? "Negative Number" : (VP > 0) ? "Positive Number" : "Neutral Number";
        System.out.print("Ternary With Two Condition : " + VV);
        scan.close();
    }
}