package 设计模式.A4桥梁模式;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 20:25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        FoodServiceApi chinaFood = new FChinaFood(new ChinaFoodService());
        FoodServiceApi chineseFood = new FChinaFood(new ChineseFoodService());
        chinaFood.makeChicken();
        chineseFood.makeChicken();
    }
}
