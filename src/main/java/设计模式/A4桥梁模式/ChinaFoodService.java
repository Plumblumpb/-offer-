package 设计模式.A4桥梁模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/8 19:36
 * @Description:
 */
public class ChinaFoodService implements FoodService{
    @Override
    public void makeChicken() {
        System.out.println("china makeChicken");
    }
}
