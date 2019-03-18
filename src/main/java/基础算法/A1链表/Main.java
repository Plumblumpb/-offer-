package 基础算法.A1链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: cpb
 * @Date: 2019/3/6 16:51
 * @Description:
 */
public class Main {
    static class  Node{
        private int value;
        Node next;
        public Node(int value,Node next){
            this.value =value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }
    }
    /**
     * 翻转链表
     */
    public static Node reverseList(Node head){
        if (head==null||head.next== null){
            return head;
        }
        Node new_head = null;
        while(head !=null){
            //定义保存head的下一个节点
            Node next = head.next;
            head.next = new_head;
            new_head = head;
            head = next;
        }
        return new_head;
    }
    public static Node reverseList(Node head,int s,int e){
        //计算需要翻转的长度，记录头节点
        //将head移动到需要翻转的前一node，并获取node（用于连接）

        int change_len = e-s;
        Node pre_head = null;
        //
        Node result = head;
        while(head!=null && --s!=0 ){
            head= head.next;
        }
        Node modify_node = head;
        Node new_head = null;
        while(head!=null && change_len!=0){
            Node next  = head.next;
            new_head = head;
            head = next;
            change_len--;
        }
        modify_node.next = head;
//        if ()
        return pre_head;
    }

    public static Node getIntersectionNode(Node a1,Node a2){
        if(a1==null|| a2 ==null){
            return null;
        }
        Set set =new  HashSet();
        while(a1!=null){
            set.add(a1.value);
            a1= a1.next;
        }
        while(a2!=null){
            if(set.contains(a2.value)){
                return a2;
            }else{
                return null;
            }
        }
        return null;
    }

    public static Node detectCycle(Node node){
        Node p1 = node; Node p2 = node;
        Boolean isCycle = false;
        while(p1.next!=null && p2.next.next!=null){
            if(p1.next == p2.next.next){
                isCycle = true;
                return node;
            }else {
                p1 = p1.next;
                p2 = p2.next.next;
            }
        }
        if(isCycle){
            p1= node;
            while(p1!=p2){
                    p1.next = p1;
                    p2.next = p2;
            }
            return p1;
        }
        return null;
    }


    public static Node mergeTwoLists(Node p1 ,Node p2){
        if (p1==null){
            return p2;
        }else if(p2 == null){
            return p1;
        }else if(p1==null&&p2==null){
            return null;
        }
        Node node = null;
        while(p1!=null&&p2!=null){
            if(p1.value>p2.value){
                node.value= p2.value;
                p2 = p2.next;
            }else {
                node.value = p1.value;
                p1 = p1.next;
            }
        }
        if(p1!=null){
            node.next = p1;
        }
        if(p2!=null){
            node.next = p2;
        }
        return node;
    }

    public static void main(String[] args) {
        Node node4 = new Node(5,null);
        Node node3 = new Node(4,node4);
        Node node2 = new Node(3,node3);
        Node node1 = new Node(2,node2);
        Node node = new Node(1,node1);

//        System.out.println(Main.reverseList(node).value);

        reverseList(node,1,3);
    }
}
