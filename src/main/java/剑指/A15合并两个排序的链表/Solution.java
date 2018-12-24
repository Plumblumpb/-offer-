package A15合并两个排序的链表;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:
 */
public class Solution {
    static  class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static  ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode demo = null;
        ListNode root=demo;
        while(list1 != null || list2 !=null){
            int a = list1==null?Integer.MAX_VALUE:list1.val;
            int b = list2==null?Integer.MAX_VALUE:list2.val;
            if(a>b){
                demo.next=list2;
                demo=list2;
                list2=list2.next;
            }else {
                demo.next=list1;
                demo=list1;
                list1=list1.next;
            }
        }
        return  root;

    }

    public ListNode Merge1(ListNode list1,ListNode list2) {
        //新建一个头节点，用来存合并的链表。
        ListNode head=new ListNode(-1);
        head.next=null;
        ListNode root=head;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                head.next=list1;
                head=list1;
                list1=list1.next;
            }else{
                head.next=list2;
                head=list2;
                list2=list2.next;
            }
        }
        //把未结束的链表连接到合并后的链表尾部
        if(list1!=null){
            head.next=list1;
        }
        if(list2!=null){
            head.next=list2;
        }
        return root.next;
    }
    public static void main(String[] args) {

    }

}
