package 基础算法.A4递归函数;

import java.util.*;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/19
 * Time:22:13
 */
public class Main {
    public void generate(int i , Vector<Integer> nums,Vector<Integer> items,Vector<Vector<Integer>> result){
        if(i>nums.size()){
            return;
        }
        items.add(nums.get(i));
        result.add(items);
        generate(i+1,nums,items,result);
    }

//    public void findanswer(int index,List<Integer>ans,int[] candidates,int target,List<List<Integer>> result)
//    {
//        while(index < candidates.length && candidates[index]<= target)
//        {
//            if(candidates[index] <= target/2)
//            {
//                List<Integer> l1 = new ArrayList<Integer>(ans);
//                l1.add(candidates[index]);
//                //index从变为index+1
//                findanswer(index+1,l1,candidates,target-candidates[index],result);
//            }
//            if(candidates[index] == target)
//            {
//                List<Integer> l1 = new ArrayList<Integer>(ans);
//                l1.add(candidates[index]);
//                result.add(l1);
//            }
//            //当下一个数与当前数相同时，跳过
//            while(++index < candidates.length && candidates[index] == candidates[index-1]);
//        }
//    }

    public ArrayList<ArrayList> subsets(ArrayList num){
        ArrayList item = new ArrayList();
        ArrayList<ArrayList> result = new ArrayList<>();
        generate1(0,num,item,result);
        return result;
    }
    public void generate1(int i,ArrayList num,ArrayList item,ArrayList<ArrayList> result){
        if(i>num.size()){
            return;
        }
        item.add(num.get(i));
        result.add(item);
        generate1(i+1,num,item,result);
        item.remove(i);
        generate1(i+1,num,item,result);
    }


    public ArrayList<ArrayList> subsets2(ArrayList num,int demo){
        ArrayList item = new ArrayList();
        ArrayList<ArrayList> result = new ArrayList<>();
        Collections.sort(num);
        int sum = 0;
        generate2(0,num,item,result,sum,demo);
        return result;
    }
    public void generate2(int i,ArrayList num,ArrayList item,ArrayList<ArrayList> result,int sum,int demo){
        if(i>num.size()||sum>demo){
            return;
        }
        item.add(num.get(i));
        sum =sum+(int)num.get(i);
        if(sum==demo){
            result.add(item);
        }
        generate1(i+1,num,item,result);
        item.remove(i);
        sum = sum-(int)num.get(i);
        generate1(i+1,num,item,result);
    }


}

