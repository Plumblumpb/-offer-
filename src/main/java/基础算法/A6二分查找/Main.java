package 基础算法.A6二分查找;

import java.util.ArrayList;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/21
 * Time:0:27
 */
public class Main {

    public int binary_search(ArrayList list,int target){
        int start = 0;
        int end = list.size()-1;
        while(start<=end){
            int mid = (start + end )/2;
            if((int)list.get(mid)>target){
                end = mid-1;
            }else if((int)list.get(mid)<target){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return 0;
    }

}
