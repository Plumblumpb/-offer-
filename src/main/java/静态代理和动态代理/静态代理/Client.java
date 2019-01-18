package 静态代理和动态代理.静态代理;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 10:01
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new FoodServiceImpl());
        staticProxy.makeChicken();
    }

}
