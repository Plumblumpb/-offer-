package 基础算法.哈希和字符串;

import 集合类.HashMap.HashMaptest7;

import java.util.*;

/**
 * Created with IDEA
 * author:plumblum
 * Date:2019/3/18
 * Time:17:10
 */
public class Main {

    public static boolean  wordPattern(String pattern,String str){
        String []s = str.split(" ");
        if(pattern.length()!=s.length){
            return false;
        }
        HashMap map1 = new HashMap();
        for(int i= 0;i<s.length;i++){
            if(map1.containsKey(s[i])){
                if(!map1.get(s[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }else{
                map1.put(s[i],pattern.charAt(i));
            }
        }
        return true;
    }
    public static ArrayList<ArrayList<String>> groupAnagrems(ArrayList<String> list){
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i = 0 ; i<list.size(); i++){
            String []str = list.get(i).split("");
            char c[] = str[i].toCharArray();
            Arrays.sort(c);
            String demo = String.valueOf(c);
            if(map.containsKey(demo)){
                map.get(demo).add(str[i]);
            }else {
               ArrayList<String> list1 = new ArrayList<>();
               list1.add(str[i]);
               map.put(demo,list1);
            }
        }
        ArrayList demo = new ArrayList();
        for (Map.Entry<String,ArrayList<String>> entry: map.entrySet()){
            demo.add(entry.getValue());
        }
        return demo;
    }

    public int lengthOfLongestSubstring(String s){
        char c [] = s.toCharArray();
        int start =0,end  =0,result =0;
        HashSet set = new HashSet();
        for(int i = 0 ; i<c.length;i++){
            if (set.contains(c[i])){
                set.remove(c[i]);
                start++;
            }else{
                set.add(c[i]);
                end++;
            }
            result = Math.max(result,end-start);
        }
        return result;
    }
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Map<Character,Integer> map=new HashMap<>();
        for(;start<n && end<n;end++){
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end)),start);//从有重复的下一个位置继续找
            }
            map.put(s.charAt(end),end+1);//map每次更新
            res=Math.max(res,end-start+1);//结果每次更新
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
