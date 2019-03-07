package 集合类.HashMap;

import java.util.*;


/**
 * @Auther: cpb
 * @Date: 2019/1/31 17:52
 * @Description:
 */
public class HashMaptest8<K,V> {

    public V put(K key,V value){
//        1.当插入第一个元素前，需要初始化数组大小并初始化第一个node
//        2.求key的hash
//        3.找到key对应的下标
//        4.遍历一下对应下标处的链表，看是否有重复的 key
//        5.有则保存在链表中，无则添加链表头。这里需要判断是否扩容
        return  value;
    }

//    public V get(Object key){
////        1.根据 key 计算 hash 值。
////        2.找到相应的数组下标：hash & (length – 1)。
////        3.遍历该数组位置处的链表，直到找到相等(==或equals)的 key。
//        return V;
//    }

    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(3,3);
        map.put(2,2);

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> itr = it.next();
            System.out.println(itr.getKey());

        }



    }

}
