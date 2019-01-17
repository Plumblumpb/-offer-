package 反射机制;

/**
 * @Auther: cpb
 * @Date: 2019/1/17 19:48
 * @Description:
 */
public class Test {

    private int i = 0;
    private String j = "test";
    public void mytest(){}

    public int mytest(int i){
        System.out.println(i);
        return i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public void printTest(String test){
        System.out.println(test);
    }
}
