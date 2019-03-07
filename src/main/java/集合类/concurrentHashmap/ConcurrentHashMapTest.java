package 集合类.concurrentHashmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Auther: cpb
 * @Date: 2019/2/1 10:30
 * @Description:
 */
public class ConcurrentHashMapTest<K,V> {

//    public V put(K key, V value){
//        1.计算key的hash值
//        2.根据hash（32位），找出hash中队列的segment位置
//    }


    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put(null,null);

    }
}
