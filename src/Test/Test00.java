package Test;



public class Test00 implements Runnable{

    public static void main(String[] args) {

        Test00 test00 = new Test00();
        Thread thread = new Thread(test00);
        Thread thread1 = new Thread(test00);
        thread.start();
        System.out.println("i am here");
        thread1.start();


    }


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
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
