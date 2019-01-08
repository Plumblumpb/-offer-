package 设计模式.A3代理模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:11
 * @Description:
 */
public class FoodServiceProxy implements FoodService {

    private FoodServiceImpl foodService;
    @Override
    public void makeNoodle() {
        foodService.makeNoodle();
    }

    @Override
    public void makeChicken() {
        foodService.makeChicken();
    }
}
