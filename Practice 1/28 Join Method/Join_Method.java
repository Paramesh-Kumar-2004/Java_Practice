
// If we run this code without join , The code complete before completing the thread (here for loop).
// join if checked Exception error. it means we should use try, catch block.


class ThreadClass extends Thread{
    int VP = 0;
    public void run(){
        for(int i=0; i<=2004;i++){
            VP = i;
        }
    }
}


class Join_Method{
    public static void main(String[] args){
        System.out.println("Join Method : ");

        ThreadClass obj1 = new ThreadClass();   
        
        // Start Thread
        obj1.start();
        try{
            obj1.join();
        }
        catch(Exception e){
            System.out.println("Error : "+e);
        }
        System.out.println("VP : "+obj1.VP);
    }
}