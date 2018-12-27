package 设计模式.单例模式;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 20:31
 * @Description:
 */
public class Singleton2 {
    private Singleton2(){

    }

    public static  Singleton2 singleton;

    public static Singleton2 getInstance(){
        if (singleton == null){
            synchronized (Singleton2.class){
                if (singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
