import java.util.Scanner;


class NestedForLoop{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int VP = input.nextInt();


        System.out.println("\nPyramid Pattern");
        for(int i=0;i<VP;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Print (ex:4) [4][4] Star Pattern
        System.out.println("\nPrint (ex:4) [4][4] Pattern");
        for(int i=0;i<VP;i++){
            for(int j=0;j<VP;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();

    }
}