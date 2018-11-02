package A9矩形覆盖;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution {
    public int RectCover(int target) {
      if(target == 1)
          return 1;
      if (target == 2)
          return 2;
      return 0;
    }
    public static void main(String[] args) {

    }

}
