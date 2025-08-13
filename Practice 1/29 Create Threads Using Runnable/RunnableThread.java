

// Instead of extends Thread - implements Runnable
class A implements Runnable{
    public void run(){
        System.out.println("\nRunnable... From Outside Class");
    }
}


class RunnableThread{
    public static void main(String[] args){
        System.out.println("Runnable Threads From Main Function");

        Runnable obj1 = new A();

        Thread t = new Thread(obj1);
        t.start();
    }
}