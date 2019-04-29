package 树查询优化;


import java.util.*;

/**
 * @Auther: cpb
 * @Date: 2019/4/26 11:29
 * @Description:
 */
public class Main {
    /**
     * 两层循环实现建树
     * @param treeNodes 传入的树节点列表
     * @return
     */
    public static List<TreeNode> bulid(List<TreeNode> treeNodes) {

        List<TreeNode> trees = new ArrayList<TreeNode>();

        for (TreeNode treeNode : treeNodes) {

            if ("0".equals(treeNode.getParentId())) {
                trees.add(treeNode);
            }

            for (TreeNode it : treeNodes) {
                if (it.getParentId() == treeNode.getId()) {
                    if (treeNode.getChildren() == null) {
                        treeNode.setChildren(new ArrayList<TreeNode>());
                    }
                    treeNode.getChildren().add(it);
                }
            }
        }
        return trees;
    }

    /**
     * 使用递归方法建树
     * @param treeNodes
     * @return
     */
    public static List<TreeNode> buildByRecursive(List<TreeNode> treeNodes) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        for (TreeNode treeNode : treeNodes) {
            if ("0".equals(treeNode.getParentId())) {
                trees.add(findChildren(treeNode,treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param treeNodes
     * @return
     */
    public static TreeNode findChildren(TreeNode treeNode,List<TreeNode> treeNodes) {
        for (TreeNode it : treeNodes) {
            if(treeNode.getId().equals(it.getParentId())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<TreeNode>());
                }
                treeNode.getChildren().add(findChildren(it,treeNodes));
            }
        }
        return treeNode;
    }



    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode("1","广州","0");
        TreeNode treeNode2 = new TreeNode("2","深圳","0");
        TreeNode treeNode3 = new TreeNode("3","天河区",treeNode1);
        TreeNode treeNode4 = new TreeNode("4","越秀区",treeNode1);
        TreeNode treeNode5 = new TreeNode("5","黄埔区",treeNode1);
        TreeNode treeNode6 = new TreeNode("6","石牌",treeNode3);
        TreeNode treeNode7 = new TreeNode("7","百脑汇",treeNode6);
        TreeNode treeNode8 = new TreeNode("8","南山区",treeNode2);
        TreeNode treeNode9 = new TreeNode("9","宝安区",treeNode2);
        TreeNode treeNode10 = new TreeNode("10","科技园",treeNode8);
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(treeNode1);
        list.add(treeNode2);
        list.add(treeNode3);
        list.add(treeNode4);
        list.add(treeNode5);
        list.add(treeNode6);
        list.add(treeNode7);
        list.add(treeNode8);
        list.add(treeNode9);
        list.add(treeNode10);
        List<TreeNode> trees = Main.bulid(list);
        List<TreeNode> trees_ = Main.buildByRecursive(list);
    }

    public List<Tree> BFS(List<TreeNode> list){
        if(list ==null){
            return null;
        }
        for(TreeNode node :list){
            Queue<TreeNode> queue=new LinkedList<TreeNode>();
            queue.offer(node);
            while(!queue.isEmpty()){
                TreeNode tree = queue.poll();

            }
        }
    }

//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> lists=new ArrayList<Integer>();
//        if(root==null)
//            return lists;
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            TreeNode tree=queue.poll();
//            if(tree.left!=null)
//                queue.offer(tree.left);
//            if(tree.right!=null)
//                queue.offer(tree.right);
//            lists.add(tree.val);
//        }
//        return lists;
//    }
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        ArrayList<Integer> lists=new ArrayList<Integer>();
//        if(root==null)
//            return lists;
//        Stack<TreeNode> stack=new Stack<TreeNode>();
//        stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode tree=stack.pop();
//　　　　　　//先往栈中压入右节点，再压左节点，这样出栈就是先左节点后右节点了。
//            if(tree.right!=null)
//                stack.push(tree.right);
//            if(tree.left!=null)
//                stack.push(tree.left);
//            lists.add(tree.val);
//        }
//        return lists;
//    }

}
