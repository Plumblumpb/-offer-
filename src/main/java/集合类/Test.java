package 集合类;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: cpb
 * @Date: 2019/1/31 16:58
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        int n = 18 - 1;
        //先移位再或运算，最终保证返回值是2的整数幂
        System.out.println( n >>> 1);
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> 2;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        HashMap map = new HashMap();
        Hashtable hashtable = new Hashtable();
    }
}
