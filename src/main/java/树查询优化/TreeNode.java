package 树查询优化;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @Auther: cpb
 * @Date: 2019/4/26 11:30
 * @Description:
 */
public class TreeNode {

        private String id;

        private String parentId;

        private String name;

        private LinkedHashSet<TreeNode> children = new LinkedHashSet<>();

        private int level;

        private String path;

        private boolean isLeaf;

        private int sort;

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public TreeNode(String id, String name, String parentId) {
            this.id = id;
            this.parentId = parentId;
            this.name = name;
        }
        public TreeNode(String id, String name, TreeNode parent) {
            this.id = id;
            this.parentId = parent.getId();
            this.name = name;
        }


        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public LinkedHashSet<TreeNode> getChildren() {
            return children;
        }

        public void setChildren(LinkedHashSet<TreeNode> children) {
            this.children = children;
        }


}
