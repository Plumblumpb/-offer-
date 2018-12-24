package 剑指.A26最小的K个数;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k == 0 ) return null;
        if (k>input.length) return null;
        ArrayList<Integer> list = new ArrayList<Integer>(k);
        Arrays.sort(input);
        for(int i = 0 ;i < k; i++){
            list.add(input[i]);
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int []i = new int[]{5,6,2,7,3,8};
        Solution.GetLeastNumbers_Solution(i,4);
    }

}
