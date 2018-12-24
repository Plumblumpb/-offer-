package A8变态跳台阶_递归;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {
    public int JumpFloor(int target) {
        if(target==0||target==1)
               return 1;
        if(target==2)
               return 2;
        int sum = 0;
        for(int i=0;i<target;i++){
                sum = sum+JumpFloor(i);
            }
        return sum;
    }
    public static void main(String[] args) {

    }

}
