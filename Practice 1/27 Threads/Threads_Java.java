


// At The same time we - Playing Games, Watching Videos, etc... This is called Multitasking... 
// At The same time we - One Task Doing Multiple Work Is Called Multitasking. Ex : Downloading Some Videos From Online. We Donwload from one source (ex:Chrome) It Download All the files.


class A_Without_Thread{
    void run(){
        for(int i=0;i<5;i++){
            System.out.println("A_Without_Thread : VP");
        }
    }
}
class B_Without_Thread{
    void run(){
        for(int i=0;i<5;i++){
            System.out.println("B_Without_Thread : VP");
        }
    }
}



// Thread :- Function Should Be public, class shouls have function called run, First we should start thread.
class A_With_Thread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" : VP");
        }
    }
}
class B_With_Thread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println((i+"1")+" : VP");
        }
    }
}


class Threads_Java{
    public static void main(String[] args){
        System.out.println("Threads");

        System.out.println("\nWithout Threads");
        A_Without_Thread ObjA = new A_Without_Thread();
        B_Without_Thread ObjB = new B_Without_Thread();

        ObjA.run();
        ObjB.run();


        // Threads 
        // In Threads We Can Set Priority, The Range 1 to 10 (Ex: If A Doing Important Work Means ObjThreadB.setPriority(2))
        System.out.println("\nWith Threads");
        A_With_Thread ObjThreadA = new A_With_Thread();
        B_With_Thread ObjThreadB = new B_With_Thread();
        ObjThreadB.setPriority(10);
        ObjThreadA.setPriority(2);

        ObjThreadA.start();
        ObjThreadB.start();

    }
}