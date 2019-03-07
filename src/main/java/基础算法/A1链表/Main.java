package 基础算法.A1链表;

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
