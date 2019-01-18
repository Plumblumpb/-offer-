package 静态代理和动态代理.静态代理;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:10
 * @Description:
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public void makeNoodle() {
        System.out.println("make noodle");
    }

    @Override
    public void makeChicken() {
        System.out.println("make Chicken");
    }
}
