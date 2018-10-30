package A2从尾到头打印链表;

import java.util.ArrayList;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * 重点：判断用本体。
 */
public class Solution {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }





    public static void main(String[] args) {

    }

}
