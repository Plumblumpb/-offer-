package 基础算法.A10线程;

/**
 * @Auther: cpb
 * @Date: 2019/3/7 17:07
 * @Description:
 */
public class 多线程循环打印ABC {
    public static class ThreadPrinter implements Runnable{

        private String name;
        private Object prev;
        private Object self;

        public ThreadPrinter(String name, Object prev, Object self) {
            this.name = name;
            this.prev = prev;
            this.self = self;
        }
        @Override
        public void run() {
            int count = 10;
            while(count>0){
                synchronized (prev){
                    synchronized (self){
                        System.out.println(name);
                        count--;
                        self.notifyAll();
                    }
                }
                try {
                    if(count==0){
                        prev.notifyAll();
                    }else{
                        prev.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            Object a = new Object();
            Object b = new Object();
            Object c = new Object();
            ThreadPrinter threadA = new ThreadPrinter("a",c,a);
            ThreadPrinter threadB = new ThreadPrinter("b",a,b);
            ThreadPrinter threadC = new ThreadPrinter("c",b,c);

            try {
                new Thread(threadA).start();
                Thread.sleep(10);// 保证初始ABC的启动顺序
                new Thread(threadB).start();
                Thread.sleep(10);
                new Thread(threadC).start();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
