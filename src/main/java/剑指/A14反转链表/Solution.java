package A14反转链表;

import java.util.ArrayList;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:输入一个链表，反转链表后，输出新链表的表头。
 *
 * 解题重点
 */
public class Solution {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode newHead = null;
        ListNode pNode = head;
        ListNode pPrev = null;
        while(pNode!=null){
            ListNode pNext = pNode.next;
            if(pNext==null)
                newHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        return newHead;
    }
        public static void main(String[] args) {

        }


}