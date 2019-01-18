package 静态代理和动态代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: cpb
 * @Date: 2019/1/18 09:49
 * @Description:
 */
//Object proxy:被代理的对象
//Method method:要调用的方法
//Object[] args:方法调用时所需要参数
public class DynamicProxy implements InvocationHandler {
    //目标对象
    private Object target;
    //绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
    public Object newProxyInstance(Object targetObject){
        this.target=targetObject;
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        //根据传入的目标返回一个代理对象
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }
    @Override
    //关联的这个实现类的方法被调用时将被执行
    /*InvocationHandler接口的方法，proxy表示代理，method表示原对象被调用的方法，args表示方法的参数*/
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
          //打印参数
//        for(int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }
        Object ret=null;
        try{
            //调用目标方法
            ret=method.invoke(target, args);
        }catch(Exception e){
            e.printStackTrace();
            throw e;
        }
        return ret;
    }
}
