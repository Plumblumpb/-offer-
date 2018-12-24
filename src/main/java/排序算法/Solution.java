package 排序算法;

/**
 * @Auther: cpb
 * @Date: 2018/12/24 15:43
 * @Description:
 */
public class Solution {

    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 冒泡排序.bubbleSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
