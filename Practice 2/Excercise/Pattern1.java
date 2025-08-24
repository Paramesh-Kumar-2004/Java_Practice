import java.util.*;


class Pattern1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // System.out.print("enter The Number : ");
        // int VP = scan.nextInt();
        int VP = 5;

        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("VP ");
            }
            System.out.println();
        }
    }
}
