


class Stack{
    private int[] VP = new int[4];
    private int tos;

    // Only Access the variables in that class Alone.

    Stack(){
        tos = -1;
    }

    void push(int n){
        if(tos==VP.length-1){
            System.out.println("Stack Is Full");
        }
        else{
            VP[++tos] = n;
        }
    }

    int pop(){
        if(tos == -1){
            return -1;
        }
        else{
            return VP[tos--];
        }
    }
}