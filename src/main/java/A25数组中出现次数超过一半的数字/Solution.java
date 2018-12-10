package A25数组中出现次数超过一半的数字;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 *
 *
 * 解题方案先排序，然后再进行统计
 */
public class Solution {

    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        System.out.println(array);
        int num=array[len/2];
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;

    }

    public int MoreThanHalfNum_Solution2(int [] array) {
        if(array.length == 0) return 0;
        if(array.length == 1) return array[0];
        // 遍历每个元素，并记录次数；若与前一个元素相同，则次数加1，否则次数减1
        int result = array[0];
        int times = 1; // 次数

        for(int i=1;i<array.length;++i)
        {
            if(times == 0)
            {
                // 更新result的值为当前元素，并置次数为1
                result = array[i];
                times = 1;
            }
            else if(array[i] == result)
            {
                ++times; // 相同则加1
            }
            else
            {
                --times; // 不同则减1               
            }
        }

        // 判断result是否符合条件，即出现次数大于数组长度的一半
        times = 0;
        for(int i=0;i<array.length;++i)
        {
            if(array[i] == result) ++times;
        }

        return (times > array.length/2) ? result : 0;

    }

    public static void main(String[] args) {
        int a[] = {1,2,3,2,2,2,5,4,2};
        for (int i = 0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        for (int i = 0 ; i< a.length ; i++){
            System.out.println(a[i]);
        }

    }
}
