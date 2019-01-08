package 设计模式.A2适配器模式.对象适配器模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:18
 * @Description:
 */
public class ChineseFoodService implements FoodService{
    @Override
    public void makeNoodle() {
        System.out.println("中国式做面");
    }
}
