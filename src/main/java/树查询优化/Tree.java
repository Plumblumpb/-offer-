package 树查询优化;

/**
 * @Auther: cpb
 * @Date: 2019/4/29 17:55
 * @Description:
 */
public class Tree {
    private String id;

    private String parentId;

    private String name;

    private String path;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
