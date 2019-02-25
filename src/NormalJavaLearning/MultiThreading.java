package NormalJavaLearning;


public class MultiThreading implements Runnable{

    public static void main(String[] args) {

        MultiThreading multiThreading  = new MultiThreading();
        Thread thread = new Thread(multiThreading);
        Thread thread1 = new Thread(multiThreading);
        thread.start();
        System.out.println("i am here");
        thread1.start();



    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i);
                System.out.println("\n");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
