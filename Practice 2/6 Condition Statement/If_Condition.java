import java.util.Scanner;

class If_Condition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int VP = scan.nextInt();
        if(VP>0){
            System.out.print(VP+" Is Positive");
            if(VP%2==0){
                System.out.print(" And Even");
            }
            else{
                System.out.print(" And Odd");
            }
        }
        else if(VP<0){
            System.out.print(VP+" Is Negative");
            if(VP%2==0){
                System.out.print(" And Even");
            }
            else{
                System.out.print(" And Odd");
            }
        }
        else{
            System.out.print(VP+" Is Neutral");
        }
    }
}