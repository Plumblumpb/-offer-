package 排序算法;

import java.util.Arrays;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 19:53
 * @Description:
 */
public class 归并排序 {

    public static int[] MergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(MergeSort(left), MergeSort(right));
    }
    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

//    public int[] sort(int[]a){
//        int len = a.length;
//        int mid = len/2;
//        int []left = Arrays.copyOfRange(a,0,mid);
//        int []right = Arrays.copyOfRange(a,mid,len);
//        return merge1(sort(left), sort(right));
//    }
//
//    public int[] merge1(int []left,int[]right){
//        int[] result = new int[left.length + right.length];
//        for(int index = 0, i = 0, j = 0; index < result.length; index++){
//            if()
//        }
//
//    }


    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 归并排序.MergeSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
