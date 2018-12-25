package 排序算法;

/**
 * @Auther: cpb
 * @Date: 2018/12/24 15:43
 * @Description:
 */
public class 选择排序 {

    public static int[] selectionSort(int[] array) {
        int len = array.length;
        if (len == 0 ||len ==1) return array;
        for(int i = 0 ;i <len-1; i++){
            int a = array[i];
            int k = i;
            for(int j = i+1;j<len;j++){
                if(a>array[j]){
                    a = array[j];
                    k = j;
                }
            }
            if(k != i){
                int b = array[i];
                array[i] = array[k];
                array[k] = b;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 选择排序.selectionSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
