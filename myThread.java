 class PrintNumbers extends Thread {
    
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }

        System.out.println("Thread is running! ");
    }

    public static void main(String[] args) {

         System.out.println("main thread is running");
         PrintNumbers t = new PrintNumbers();

         t.start();

        //  System.out.println("main thread is running");
    }
}

class Thread1 extends Thread {
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println("hello");
        }
    }
}
class Thread2 extends Thread {
    public void run(){
        for (int j = 1; j<=3; j++){
            System.out.println("World");
        }
    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();



    }
}

class MyTask implements Runnable{
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println("Task is running!");

        }
    }
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);

        t.start();
        
    }qw

}



