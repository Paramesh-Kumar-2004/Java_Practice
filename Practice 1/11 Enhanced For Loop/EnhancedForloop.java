import java.util.Arrays;


class EnhancedForloop{
    public static void main(String[] args){
        
        int[] VP = {4,8,2004};
        System.out.println(Arrays.toString(VP));

        // Enhanced For loop, Print Array Element Using For Enhanced Loop.
        System.out.println("\nEnhanced For loop, Printing An Array Element Using Enhanced For Loop.");
        for(int i : VP){
            System.out.println(i);
        }

    }
}