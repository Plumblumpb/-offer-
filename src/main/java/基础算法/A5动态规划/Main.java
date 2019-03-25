package 基础算法.A5动态规划;

import java.util.ArrayList;

public class Main {

    public static int rob(int num[]){
        int length = num.length;
        if(length==0){
            return 0;
        }else if (length ==1){
            return num[0];
        }else if(length ==2){
            return Math.max(num[0],num[1]);
        }

        int result[] = new int[length];
        result[0] = num[0];
        result[1] = num[1];
        for(int i = 2; i<length;i++){
            result[i] = Math.max(num[i] + result[i-2], result[i -1]);
        }
        return result[length-1];
    }

    public static int maxSubArray(int nums[]){
        int demo[] = new int[nums.length];
        int max_res = nums[0];
        for(int i = 1;i<nums.length;i++){
            demo[i] = Math.max(demo[i-1]+nums[i],nums[i]);
            if(max_res<demo[i]){
                max_res = demo[i];
            }
        }
        return max_res;
    }

    public static int coinChange(int []coins,int amount){
        int []demo = new int[amount];
        for(int k = 0 ; k<amount; k++){
            demo[k] =-1;
        }
        for (int i = 0;i<amount;i++){
            for(int j = 0;j<coins.length;j++){
                //第一个判断用于 金额大于纸币，
                if(i-coins[j]>=0&&demo[i-coins[j]]!=-1){
                    if(demo[i] ==-1 ||demo[i]>demo[i-coins[j]]+1 ){
                        demo[i] = demo[i-coins[j]]+1;
                    }
                }
            }
        }
        return demo[amount-1];
    }


    public static int 
}
