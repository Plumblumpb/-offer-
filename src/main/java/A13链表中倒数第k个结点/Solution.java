package A13链表中倒数第k个结点;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:
 */
public class Solution {


 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null)   return head;
        int i = 0;
        ListNode demo = head;
        ListNode node = head;
        while(demo!=null){
            i++;
            demo = demo.next;
        }
        if (i < k)  return null;
        for(int j = 0; j<i-k;j++){
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {

    }

}
