package 基础算法.A5图;

import java.util.ArrayList;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/20
 * Time:23:37
 */
public class Main {
   class GraphNode{
       //图顶的值
       int label ;
       //相连节点指针数组
       ArrayList<GraphNode> list;
        GraphNode(int label){
            this.label = label;
        }
   }


}

