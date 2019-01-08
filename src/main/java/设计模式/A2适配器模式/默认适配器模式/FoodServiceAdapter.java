package 设计模式.A2适配器模式.默认适配器模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:15
 * @Description:
 */
public class FoodServiceAdapter extends FoodServiceImpl {
    @Override
    public void makeNoodle() {
        System.out.println("adapter noodle");
    }

    @Override
    public void makeChicken() {
        System.out.println("adapter Chicken");
    }
}
