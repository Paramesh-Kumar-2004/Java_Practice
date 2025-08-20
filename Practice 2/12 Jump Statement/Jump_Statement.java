
class Jump_Statement{
    public static void main(String[] args){
        System.out.println("Break Statement");
        int VP = 1;

        // break
        while(VP<=10){
            if(VP%2==0){
                System.out.println("First Even Number : "+VP);
                break;
            }
            VP+=1;
        }
        System.out.println();


        // continue
        System.out.println("continue Statement");
        for(int i=0; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println("The Number : "+i);
        }

    }
}