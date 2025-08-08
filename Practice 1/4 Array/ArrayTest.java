import java.util.Arrays;
import java.util.Scanner;

class ArrayTest{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int[] VP = new int[3];
        VP[0] = 3;
        VP[1] = 4;
        VP[2] = 2004;
        int Total = 0;


        // Print Sum Of The Array Element
        System.out.println("\nPrint Sum Of The Array Element");
        for(int i=0;i<3;i++){
            Total+=VP[i];
        }
        System.out.println(Total);


        // Get Array Elements Using Loop
        int[] PV = new int[3];
        System.out.println("\nGet & Print Array Elements Using Loop");
        for(int i=0;i<3;i++){
            System.out.print("Enter The Element "+i+" : ");
            PV[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(PV));
        for(int i=0;i<3;i++){
            System.out.println(i+" Array Element Is :"+PV[i]);
        }
        System.out.println();


        // Print Multiplication Table
        System.out.println("Print 2 Table");
        for(int i=1;i<=10;i++){
            System.out.println(i+" X 2 "+"= "+(i*2));
        }


        // Get Array Length From User, Get Array Element, Find Middle Element
        System.out.println("\nGet Array Length From User, Get Array Element, Find Middle Element");
        System.out.print("Enter Size Of The Array : ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter The Element "+i+" : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Array Elements : "+Arrays.toString(arr));
        System.out.println("Middle Element : "+arr[(arr.length/2)]);
        input.close();

    }
}

