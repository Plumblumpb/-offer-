package A6斐波那契数列_递归;

/**
 * @Auther: cpb
 * @Date: 2018/10/11 08:37
 * @Description:前面两个数为后面一个数的和，递归从0或者1倒推。
 */
public class Solution {
    public int Fibonacci(int n) {
        if(n==0)
            return 0;
        else if(n==1||n==2)
            return 1;
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) {

    }

}
