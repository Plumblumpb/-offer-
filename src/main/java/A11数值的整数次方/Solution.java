package A11数值的整数次方;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 *
 * 解题重点：double temp = 1.0;temp = temp *base;
 */
public class Solution {
    public double Power(double base, int exponent) {
        double temp = 1.0;
        if(exponent>0){
            while(exponent>0){
                temp = temp *base;
                exponent--;
            }
            return temp;
        }else if(exponent == 0){
            return temp;
        }else {
            exponent = Math.abs(exponent);
            while(exponent>0){
                temp = temp *base;
                exponent--;
            }
            return 1/temp;
        }
    }
    public static void main(String[] args) {

    }

}
