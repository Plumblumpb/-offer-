package 静态代理和动态代理.动态代理;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 10:01
 * @Description:
 */
public class Client {
    public static void main(String[] args){
        DynamicProxy dynamicProxy=new DynamicProxy();
        FoodService foodService=(FoodService)dynamicProxy.newProxyInstance(new FoodServiceImpl());
        //UserManager userManager=new UserManagerImpl();
        foodService.makeChicken();
    }
}
