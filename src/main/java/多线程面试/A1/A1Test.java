package 多线程面试.A1;

/**
 * @Auther: cpb
 * @Date: 2019/2/13 09:47
 * @Description:现在有线程 T1、T2 和 T3。你如何确保 T2 线程在 T1 之后执行，并且 T3 线程在 T2 之后执行
 */
public class A1Test {
    public static void main(String[] args) {
        try {
            Thread thread1 = new Thread(new Thread1());
            Thread thread2 = new Thread(new Thread2());
            Thread thread3 = new Thread(new Thread3());
            thread1.start();
            thread2.start();
            thread3.start();
            thread3.join();
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<3;i++) {
            System.out.println("线程1");
        }
    }
}
class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i<3 ;i++) {
            System.out.println("线程2");
        }
    }
}
class Thread3 implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<3 ; i++) {
            System.out.println("线程3");
        }
    }
}