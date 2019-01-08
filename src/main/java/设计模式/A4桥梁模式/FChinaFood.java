package 设计模式.A4桥梁模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:38
 * @Description:
 */
public class FChinaFood extends FoodServiceApi {

    public FChinaFood(FoodService foodService) {
        super(foodService);
    }

    @Override
    public void makeChicken() {
        foodService.makeChicken();
    }
}
