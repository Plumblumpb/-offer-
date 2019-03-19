package 基础算法.A3贪心算法;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/19
 * Time:15:03
 */
public class Main {
    public static void main(String[] args) {
        int [][]num ={{1,2},{2,3},{3,4}};
        System.out.println(num.length);
        System.out.println(num[1].length);
    }

    public static int findContentChirdren(int []a, int b[]){
        int child = 0;
        int sweet = 0;

        while(child<a.length&&sweet<b.length){
            if(a[child]>b[sweet]){
                sweet++;
            }
            sweet++;
        }
        return child;
    }

    public int wiggleMaxLength(int []num){
        if (num.length<2){
            return num.length;
        }
        int begin = 0,up = 1,down = 2,state = 0;
        int max_length = 1;
        for (int i = 0; i<num.length ;i++){
            switch (state){
                case 0:
                    if(num[i]>num[i-1]){
                        state = 1;
                        max_length++;
                    }else {
                        state = 2;
                        max_length++;
                    }
                    break;
                case 1:
                    if(num[i]<num[i-1]){
                        state = 2;
                        max_length++;
                    }
                    break;
                case 2:
                    if(num[i]>num[i-1]){
                        state = 1;
                        max_length++;
                    }
                    break;
            }
        }
        return max_length;
    }

    public String removeKidgits(String num ,int k){
        ArrayList list= new ArrayList<>();
        char c[] = num.toCharArray();
        StringBuffer result  = new StringBuffer();
        for(int i = 0 ; i<c.length ;i++){
            int demo = c[i]-'0';
            if(list.size()>0&& (int)list.get(list.size()-1)>demo&&k>0){
                list.remove(list.size()-1);
                k--;
            }
            if(demo!=0||list.size()!=0){
                list.add(demo);
            }
        }
        while(k>0&&list.size()!=0){
            list.remove(list.size()-1);
            k--;
        }
        for(int i = 0 ; i<list.size();i++){
            result.append(list.get(i));
        }
        return result.toString();
    }

    public boolean canJump(int []num){
        ArrayList list = new ArrayList();
        if(num.length == 0){
            return false;
        }else {
            list.add(num[0]);
        }
        for(int i = 1 ; i<num.length ;i++){
            int demo = num[i];
            if(demo+1>=(int)list.get(i-1)){
                list.add(demo+1);
            }else{
                if((int)list.get(i-1)-1==0){
                    return false;
                }
                list.add((int)list.get(i-1)-1);
            }
        }
        return true;
    }
    public int canJump2(int []num){
        int current_max = num[0];//当前节点可以到达的最远距离
        int pre_current_max = num[0];//遍历过的节点中可以到达的最远距离；
        int jump_num = 1;
        for(int i = 1; i<num.length; i++){
            if(i>current_max){
                jump_num++;
                current_max = pre_current_max;
            }else {
                pre_current_max = Math.max(pre_current_max,num[i]+i);
            }
        }
        return jump_num;

    }


    public int findMinArrowsShots(int  [][]list){
        //先按照起始点排序
        int shoot_num = 1;
        int shoot_begin = list[0][0];
        int shoot_end = list[0][1];

        for(int i = 1 ; i<list.length; i++){
            if(shoot_end>list[i][0]){
                shoot_begin = list[i][0];
                if(shoot_end>list[i][1]){
                    shoot_end = list[i][1];
                }
            }else {
                shoot_num++;
                shoot_begin = list[i][0];
                shoot_end = list[i][1];
            }

        }
        return shoot_num;
    }

    public int get_min_stop(int l,int p,int[][] stop){
        PriorityQueue queue = new PriorityQueue();
        int result = 0;
        int l1= 0;
        int p1=0;
        for (int i = 1 ;i<stop.length ; i++){
            l1= l1+stop[i][0];
            queue.add(stop[i][1]);
            while(p<l1){
                p=p+(int)queue.peek();
                queue.poll();
                result++;
                if(queue.isEmpty()){
                    return 0;
                }
            }
        }
        return result;
    }


}
