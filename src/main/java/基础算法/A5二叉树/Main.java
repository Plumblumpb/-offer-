package 基础算法.A5二叉树;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/20
 * Time:14:45
 */
public class Main {
    static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }

    public void traversal(TreeNode node){
        if(node==null){
            return;
        }
        traversal(node.left);
        traversal(node.right);
    }

    public ArrayList<ArrayList> pathSum(TreeNode node,int sum){
        ArrayList list = new ArrayList();
        ArrayList<ArrayList> result = new ArrayList<>();
        int path_value = 0;
        return result;
    }
    public void preOrder(TreeNode node,int sum,ArrayList list,ArrayList<ArrayList> result,int path_value){
        if(node==null){
            return;
        }
        list.add(node.val);
        path_value +=  node.val;
        if(path_value==sum){
            result.add(list);
        }
        preOrder(node.left,sum,list,result,path_value);
        preOrder(node.right,sum,list,result,path_value);
        list.remove(node.val);
        path_value -= node.val;
    }

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p ,TreeNode q){
        ArrayList plist = new ArrayList();
        ArrayList qlist  =new ArrayList();
        ArrayList list = new ArrayList();
        int i= 0;
        while(qlist.get(i)==plist.get(i)){
            i++;
        }
        return new TreeNode((int)plist.get(i-1));
    }

    public void preOrder1(TreeNode root,ArrayList plist,ArrayList qlist,ArrayList list,TreeNode p ,TreeNode q,int finish){
        if(root==null||finish==1){
            finish = 0;
            return;
        }
        list.add(root.val);
        if(root.val == p.val){
            plist = list;
            finish = 1;
        }
        if (root.val == q.val){
            qlist = list;
            finish = 1;
        }
        preOrder1(root.left,plist,qlist,list,p,q,finish);
        preOrder1(root.right,plist,qlist,list,p,q,finish);
    }

    public static  void BFS_print(TreeNode root){
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        TreeNode currentNode;
        while(!list.isEmpty()){
            currentNode=list.poll();
            System.out.println(currentNode.val);
            if(currentNode.left!=null){
                list.add(currentNode.left);
            }
            if(currentNode.right!=null){
                list.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode a1 =new TreeNode(1);
        TreeNode a12 =new TreeNode(12);
        TreeNode a13 =new TreeNode(13);
        TreeNode a14 =new TreeNode(14);
        TreeNode a15 =new TreeNode(15);
        a1.left=a12;
        a1.right=a13;
        a12.right=a14;
        a13.left = a15;
        Main.BFS_print(a1);
    }
}
