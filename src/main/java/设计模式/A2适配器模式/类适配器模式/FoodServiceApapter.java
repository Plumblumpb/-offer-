package 设计模式.A2适配器模式.类适配器模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:28
 * @Description:
 */
public class FoodServiceApapter extends FoodServiceImpl implements FoodService {

    @Override
    public void makeChicken() {
        System.out.println("make chicken");
    }
}
