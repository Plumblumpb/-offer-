package 设计模式.A4桥梁模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:39
 * @Description:
 */
public class FChineseFood extends FoodServiceApi {


    protected  FChineseFood(FoodService foodService) {
        super(foodService);
    }

    @Override
    public void makeChicken() {
        foodService.makeChicken();
    }
}
