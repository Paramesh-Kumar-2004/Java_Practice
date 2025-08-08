import java.util.Scanner;

class Do_While{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int num = 0;
        do{
            num+=1;
            System.out.println(num+" : VP");
        }
        while(num<5);


        // Get int from user grater than 10, get int until user enter greater than 10
        System.out.println("\nGet int from user grater than 10, get int until user enter greater than 10");
        int num2 = 0;
        do{
            System.out.print("Enter The Number : ");
            num2 = input.nextInt();
        }while(num2 <=10);

        input.close();

    }
}