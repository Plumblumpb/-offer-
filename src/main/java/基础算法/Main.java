package 基础算法;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: cpb
 * @Date: 2019/3/6 16:48
 * @Description:
 */
public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.remove());
        System.out.println(linkedList.size());
    }
}
