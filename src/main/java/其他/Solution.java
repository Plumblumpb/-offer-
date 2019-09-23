package 其他;

import org.apache.commons.lang3.StringUtils;
import 树查询优化.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:
 */
public class Solution {
    public static void main(String[] args) {
        List<Tree> list =  new ArrayList<>();
        for(int  i = 0 ; i<10; i++){
            Tree tree = new Tree();
            if(i!=7) {
                tree.setId(i + "");
                tree.setName(i + "");
                tree.setParentId(i - 1 + "");
            }
            list.add(tree);
        }
        System.out.println("ok");
        List<String> parentIds = list.stream().filter(s-> StringUtils.isNotBlank(s.getParentId())).map(Tree::getParentId).collect(Collectors.toList());
        System.out.println(parentIds);
        list.stream().forEach(tree -> System.out.println(tree.getParentId()));
    }
}
