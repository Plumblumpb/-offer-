package 排序算法;

/**
 * @Auther: cpb
 * @Date: 2018/12/25 19:26
 * @Description:
 */
public class 插入排序 {
    public static int[] insertionSort(int[] array) {
        int len = array.length;
        if (len == 0 ||len ==1) return array;
        for(int i = 0 ;i<len-1; i++){
            int a = array[i+1];
            int index = i;
            //注意先判断组数是否越界，再判断是否满足条件。
            while(index >= 0 && a<array[index]){
                array[index+1] = array[index];
                index--;
            }
            array[index+1] = a;

        }
        return array;
    }
    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 插入排序.insertionSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
