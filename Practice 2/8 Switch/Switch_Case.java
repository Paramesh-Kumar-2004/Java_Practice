import java.util.*;

class Switch_Case{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Switch Case");
        int VP,PV;
        char VV;

        System.out.print("Enter The First Number : ");
        VP = input.nextInt();
        System.out.print("Enter The Second Number : ");
        PV = input.nextInt();
        System.out.print("Enter The Operator (+,-,*,/,%) : ");
        VV = input.next().charAt(0);

        switch(VV){
            case '+':
                System.out.println(VP + " + " + PV + " = " + (VP+PV) );
                break;
            case '-':
                System.out.println(VP + " - " + PV + " = " + (VP-PV) );
                break;
            case '*':
                System.out.println(VP + " * " + PV + " = " + (VP*PV) );
                break;
            case '/':
                System.out.println(VP + " / " + PV + " = " + (VP/PV) );
                break;
            case '%':
                System.out.println(VP + " % " + PV + " = " + (VP%PV) );
                break;
            default:
                System.out.println(VV+" : Invalid Operator");
        }
    }
}