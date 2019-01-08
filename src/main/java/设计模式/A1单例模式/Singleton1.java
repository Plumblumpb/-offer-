package 设计模式.A1单例模式;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 20:25
 * @Description:
 */
public class Singleton1 {
    private Singleton1(){}

    public static Singleton1 singleton= new Singleton1();

    public static Singleton1 getInstance(){
        return  singleton;
    }
}
