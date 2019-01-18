package 静态代理和动态代理.静态代理;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:11
 * @Description:
 */
public class StaticProxy implements FoodService {

    private FoodService foodService;
    public StaticProxy(FoodService foodService){
        this.foodService = foodService;
    }
    @Override
    public void makeNoodle() {
        foodService.makeNoodle();
    }

    @Override
    public void makeChicken() {
        foodService.makeChicken();
    }
}
