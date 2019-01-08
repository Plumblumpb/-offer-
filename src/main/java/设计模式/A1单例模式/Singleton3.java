package 设计模式.A1单例模式;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 20:35
 * @Description:
 */
public class Singleton3 {
    private Singleton3(){}

    private static class Singleton{
        private  Singleton3 singleton3(){
          return new Singleton3();
      }
    }

    public  static Singleton3 getInstance(){
        return new Singleton().singleton3();
    }
}
