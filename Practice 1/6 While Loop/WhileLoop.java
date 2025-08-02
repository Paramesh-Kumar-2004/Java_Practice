import java.util.Scanner;
import java.util.Random;


class WhileLoop{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int VP = input.nextInt();

        int i =1;
        while(i<=VP){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        // Print Randowm Numer Using while loop
        System.out.println("\nPrint Randowm Numer Using while loop");
        Random random = new Random();
        int num = 0;
        while(num != 5){
            num = random.nextInt(10);
            System.out.print(num+" ");
        }

    }
}