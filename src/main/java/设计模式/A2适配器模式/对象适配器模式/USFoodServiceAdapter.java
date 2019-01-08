package 设计模式.A2适配器模式.对象适配器模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:20
 * @Description:
 */
public class USFoodServiceAdapter implements FoodService{

    private ChineseFoodService chineseFoodService;


    @Override
    public void makeNoodle() {
        chineseFoodService.makeNoodle();
    }
}
