

package 排序算法;
/**
 * @Auther: cpb
 * @Date: 2018/12/24 15:30
 * @Description:
 */
public class 冒泡排序 {
    public static int[] bubbleSort(int[] array){
        int len = array.length;
        if (len == 0 ||len ==1) return array;
        for (int i = 0 ; i<len-1; i++){
            for(int j = i+1;j<len;j++){
                if(array[i]>array[j]){
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 冒泡排序.bubbleSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
