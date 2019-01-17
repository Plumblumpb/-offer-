package 反射机制;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: cpb
 * @Date: 2019/1/17 19:43
 * @Description:
 */
public class Reflect {
    /**
     * 获取类方法和类属性
     */
    public static void test1(){
        Class c = Test.class;
        Method[] methods = c.getMethods();
        for(int i = 0;i<methods.length;i++){
            System.out.println(methods[i].getName());
        }
        Field[] fields = c.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f.getType()+":"+f.getName());
        }
    }

    /**
     * 根据类名动态创建类的对象
     * @throws Exception
     */
    public static void test2() {
        try {
            Class c = Class.forName("反射机制.Test");
            Test Test = (Test)c.newInstance();
            Test.setI(1);
            Test.setJ("1001");
            Test.getI();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据类名和方法名，执行对象的方法
     * @param
     * @param method
     * @param value
     * @throws Exception
     */
    public static void test3(Test test,String method,String value) {
        try {
            Class c = test.getClass();
            Method set = c.getMethod(method,new Class[]{String.class});
            set.invoke(test,new Object[]{value});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    /**
     * 动态创建数组对象，对数组元素复制和取值
     */
    public static void test4(){
        try{
            Class cls = Class.forName("java.lang.String");
            //创建一个String类型的数组，大小为10
            Object arr = Array.newInstance(cls, 10);
            //在数组5索引的位置赋值
            Array.set(arr, 5, "this is a test");
            //获取数组5索引位置的值
            String s = (String) Array.get(arr, 5);
            System.out.println(s);
        }catch(Throwable e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        try {
            Reflect.test1();
            Reflect.test2();
            Class c = Class.forName("反射机制.Test");
            Test test = (Test)c.newInstance();
            Reflect.test3(test ,"printTest","test");
            Reflect.test4();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
