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
        
    }


}
class MyThread4 implements Runnable {
 public void run(){
    System.out.println("Starting....");
    try{
        Thread.sleep(2000);
        System.out.println("Woke up");

    }catch(InterruptedException e) {
      System.out.println("Thread Intrupted");
    }

 }
 public static void main(String[] args) {
    MyThread4  task = new MyThread4();
    Thread t = new Thread(task);
    t.start();


 }
}

class MyThread5 implements Runnable{
  public void run(){
     System.out.println("Thread1 running....");
    try{
         
        Thread.sleep(2000);
        System.out.println("Thread1 finished");

    }catch (InterruptedException e){

        System.out.println("Thread1 Intrupted ");
    }

  }
  public static void main(String[] args) {
    MyThread5 t1 = new MyThread5();
    Thread t = new Thread(t1);

    try{
     t.start();
     t.join();
     System.out.println("main continue after Thread1");
    }catch(InterruptedException e){
     System.out.println("Intrupted");
    }

   

  }
}
class WorkerThread implements Runnable{
    public void run(){
        
    }121
}






