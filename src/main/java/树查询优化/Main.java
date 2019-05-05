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
                if(it.getId()==treeNode.getId()){
                    continue;
                }
                if (it.getParentId() == treeNode.getId()) {
                    if (treeNode.getChildren() == null) {
                        treeNode.setChildren(new LinkedHashSet<TreeNode>());
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
                    treeNode.setChildren(new LinkedHashSet<>());
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
        List<Tree> treeBFSRecursion =  Main.BFSRecursion(trees);
        List<Tree> treeDFSRecursion = Main.DFSRecursion(trees);
//        List<Tree> treeBFS = Main.BFS(trees);
//        List<Tree> treeDFS = Main.DFS(trees);
        System.out.println(treeBFSRecursion);
        System.out.println(treeDFSRecursion);
    }

//    public static List<TreeNode> BFS(List<TreeNode> list){
//
//    }

    public static List<Tree> BFSRecursion(List<TreeNode> list){
        List<Tree> trees = new ArrayList<>();
        for(TreeNode node:list){
            Tree  tree = new Tree();
            tree.setId(node.getId());
            tree.setName(node.getName());
            String path = "/"+node.getId();
            tree.setPath(path);
            tree.setParentId("1");
            tree.setSort(1);
            tree.setLeaf(false);
            tree.setLevel(1);
            trees.add(tree);
            Set<TreeNode> treeNodes = node.getChildren();
            BFSRecursionBFS(trees,treeNodes,path,tree.getLevel()+1);
        }
        return trees;
    }

    public static List<Tree> BFSRecursionBFS(List<Tree> trees,Set<TreeNode> list,String path,int level){
        int i = 1;
        for(TreeNode node:list){
            Tree  tree = new Tree();
            tree.setId(node.getId());
            tree.setName(node.getName());
            String path1 = path+"/"+node.getId();
            tree.setPath(path1);
            tree.setParentId(node.getParentId());
            tree.setLevel(level);
            tree.setSort(i++);
            trees.add(tree);
            Set<TreeNode> treeNodes = node.getChildren();
            BFSRecursionBFS(trees, treeNodes, path1,level);
        }
        return trees;
    }



    /**
     *
     * @param list
     * @return
     */
    public static List<Tree> DFSRecursion(List<TreeNode> list){
        List<Tree> trees = new ArrayList<>();
        for(TreeNode node:list){
            Tree  tree = new Tree();
            tree.setId(node.getId());
            tree.setName(node.getName());
            String path = "/"+node.getId();
            tree.setPath(path);
            tree.setParentId("1");
            DFSRecursionDFS(trees,node,path);
            trees.add(tree);
        }
        return trees;
    }

    public static List<Tree>  DFSRecursionDFS(List<Tree> trees,TreeNode node,String path){
        Set<TreeNode> treeNodes = node.getChildren();
        for(TreeNode node1:treeNodes){
            Tree  tree = new Tree();
            tree.setId(node1.getId());
            tree.setName(node1.getName());
            tree.setParentId(node.getId());
            String path1 = path+"/"+node1.getId();
            tree.setPath(path1);
            DFSRecursionDFS(trees,node1,path1);
            trees.add(tree);
        }
        return trees;
    }

    /**
     * stack深度遍历
     * 缺点无法设置sort，
     * @param list
     * @return
     */
    public static List<Tree> DFS(List<TreeNode> list){
        List<Tree> trees = new ArrayList<>();
        for(TreeNode node:list) {
            trees.addAll(DFSList(node));
        }
        return trees;
    }



    public static List<Tree> DFSList(TreeNode node){
        List<Tree> trees = new ArrayList<>();
        LinkedList result = new LinkedList();
        result.add(node);
        Map<Integer,Integer> sort = new HashMap<>();
        while(!result.isEmpty()){
            TreeNode node1 = (TreeNode) result.pollLast();
            Tree tree1 = new Tree();
            if(trees.isEmpty()){
                node1.setPath("/"+node1.getId());
                node1.setLevel(1);
                node1.setParentId("");
                tree1.setPath(node1.getPath());
                tree1.setParentId(node1.getParentId());
                tree1.setName(node1.getName());
                tree1.setLeaf(false);
                tree1.setId(node1.getId());
                tree1.setLevel(node1.getLevel());
                tree1.setSort(1);
                trees.add(tree1);
                //设置sort
                sort.put(tree1.getLevel(),1);
            }else{
                tree1.setPath(node1.getPath());
                tree1.setParentId(node1.getParentId());
                tree1.setName(node1.getName());
                tree1.setLeaf(node1.isLeaf());
                tree1.setId(node1.getId());
                tree1.setLevel(node1.getLevel());
                tree1.setSort(node1.getSort());
                trees.add(tree1);
            }


            LinkedHashSet<TreeNode> set = node1.getChildren();
            if(set.size()>0){
                for (int i = set.size()-1; i >=0; i--) {
                    TreeNode treeNode = (TreeNode) set.toArray()[i];
                    treeNode.setParentId(node1.getId());
                    treeNode.setPath(node1.getPath()+"/"+treeNode.getId());
                    treeNode.setLevel(node1.getLevel()+1);
                    if(treeNode.getChildren().isEmpty()){
                        treeNode.setLeaf(true);
                    }
                    if (sort.containsKey(treeNode.getLevel())){
                        sort.put(treeNode.getLevel(),sort.get(treeNode.getLevel())+1);
                    }else {
                        sort.put(treeNode.getLevel(),1);
                    }
                    treeNode.setSort(sort.get(treeNode.getLevel()));
                    result.add(treeNode);
            }
        }
        }
        return trees;
    }


    public static List<Tree> BFS(List<TreeNode> list){
        List<Tree> trees = new ArrayList<>();
        for(TreeNode node:list) {
            trees.addAll(BFSList(node));
        }
        return trees;
    }
    /**
     * queue实现广度遍历
     * @param node
     * @return
     */
    public static  List<Tree> BFSList(TreeNode node){
        List<Tree> trees = new ArrayList<>();
        LinkedList result = new LinkedList();
        result.add(node);
        Map<Integer,Integer> sort = new HashMap<>();
        while(!result.isEmpty()){
            TreeNode node1 = (TreeNode) result.poll();
            Tree tree1 = new Tree();
            if(trees.isEmpty()){
                node1.setPath("/"+node1.getId());
                node1.setLevel(1);
                node1.setParentId("");
                tree1.setPath(node1.getPath());
                tree1.setParentId(node1.getParentId());
                tree1.setName(node1.getName());
                tree1.setLeaf(false);
                tree1.setId(node1.getId());
                tree1.setLevel(node1.getLevel());
                tree1.setSort(1);
                trees.add(tree1);
                //设置sort
                sort.put(tree1.getLevel(),1);
            }else{
                tree1.setPath(node1.getPath());
                tree1.setParentId(node1.getParentId());
                tree1.setName(node1.getName());
                tree1.setLeaf(node1.isLeaf());
                tree1.setId(node1.getId());
                tree1.setLevel(node1.getLevel());
                tree1.setSort(node1.getSort());
                trees.add(tree1);

            }


            LinkedHashSet<TreeNode> set = node1.getChildren();
            if(set.size()>0){
                for (int i = 0; i < set.size(); i++) {
                    TreeNode treeNode = (TreeNode) set.toArray()[i];
                    treeNode.setParentId(node1.getId());
                    treeNode.setPath(node1.getPath()+"/"+treeNode.getId());
                    treeNode.setLevel(node1.getLevel()+1);
                    if(treeNode.getChildren().isEmpty()){
                        treeNode.setLeaf(true);
                    }
                    if (sort.containsKey(treeNode.getLevel())){
                        sort.put(treeNode.getLevel(),sort.get(treeNode.getLevel())+1);
                    }else {
                        sort.put(treeNode.getLevel(),1);
                    }
                    treeNode.setSort(sort.get(treeNode.getLevel()));
                    result.add(treeNode);
            }
            }
        }
        return trees;

    }
}
