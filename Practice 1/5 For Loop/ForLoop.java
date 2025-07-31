import java.util.Scanner;


class ForLoop{
    public static void main(String args[]){
        Scanner input =  new Scanner(System.in);
        // int VP = input.nextInt();
        int VP = 10;
        int PV = 5;

        // Print 0 to n
        System.out.println("\nPrint 0 to n");
        for(int i=0;i<VP;i++){
            System.out.print("VP :"+(i+1)+", ");
        }
        System.out.println();


        // Print x to n
        System.out.println("\nPrint x to n");
        for(int i=PV;i<=VP;i++){
            System.out.print(i+", ");
        }
        System.out.println();


        // Print Even and Odd Using if , else
        System.out.println("\nPrint Even and Odd Using if , else");
        for (int i=0;i<=VP;i++){
            if(i%2==0){
                System.out.print("Even:"+i+" ");
            }
            else{
                System.out.print("Odd:"+i+" ");
            }
        }
        System.out.println();


        // Count The Even & Odd Number 0 to n
        System.out.println("\nCount The Even & Odd Number 0 to n");
        int Even = 0;
        int Odd = 0;
        for(int i=1;i<=VP;i++){
            if(i%2==0){
                Even+=1;
            }
            else{
                Odd+=1;
            }
        }
        System.out.println("Even Count : "+Even);
        System.out.println("Odd Count : "+Odd);


        // Divisible By Both 3 & 5 , Range 1- 100
        System.out.println("\nDivisible By Both 3 & 5 , Range 1- 100");
        for (int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" Divisible By Both 3 & 5");
            }
        }
        System.out.println();
    }
}