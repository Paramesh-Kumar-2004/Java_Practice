import java.util.*;
import java.util.Arrays;

class Arrays_Works{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Arrays");

        // Both Methods Are Correct.
        // int[] VP = new int[5];
        int VP[] = new int[5];

        for(int i=0; i<5; i++){
            VP[i] = input.nextInt();    
        }

        System.out.println(Arrays.toString(VP));
    }
}