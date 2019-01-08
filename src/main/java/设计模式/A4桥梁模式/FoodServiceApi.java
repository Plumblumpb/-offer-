package 设计模式.A4桥梁模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:34
 * @Description:
 */
public abstract class FoodServiceApi {
    protected  FoodService foodService;
    protected  FoodServiceApi(FoodService foodService){
        this.foodService = foodService;
    }

    public  abstract void makeChicken();
}
