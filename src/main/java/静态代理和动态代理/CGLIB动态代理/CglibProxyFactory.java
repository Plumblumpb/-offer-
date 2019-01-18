package 静态代理和动态代理.CGLIB动态代理;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 11:22
 * @Description:
 */
public class CglibProxyFactory implements MethodInterceptor {
    //得到目标对象
    private Object target;

    //使用构造方法传递目标对象
    public CglibProxyFactory(Object target) {
        super();
        this.target = target;
    }

    //创建代理对象
    public Object createProxy(){
        //1.创建Enhancer
        Enhancer enhancer = new Enhancer();
        //2.传递目标对象的class
        enhancer.setSuperclass(target.getClass());
        //3.设置回调操作
        enhancer.setCallback(this);

        return enhancer.create();
    }


    //参数一:代理对象;参数二:需要增强的方法;参数三:需要增强方法的参数;参数四:需要增强的方法的代理
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 增强前
        System.out.println("这是增强方法前......");
        Object invoke = methodProxy.invoke(target, args);
        // 增强后
        System.out.println("这是增强方法后......");
        return invoke;
    }

    public static void main(String[] args) {
        // 1.创建对象
        FoodServiceImpl foodService = new FoodServiceImpl();
        // 2.创建代理对象
        CglibProxyFactory proxy = new CglibProxyFactory(foodService);
        // 3.调用代理对象的增强方法,得到增强后的对象
        FoodService createProxy = (FoodService) proxy.createProxy();
        createProxy.makeChicken();
    }
}
