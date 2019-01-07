package 排序算法;

/**
 * @Auther: cpb
 * @Date: 2018/12/27 19:07
 * @Description:
 */
public class 希尔排序 {
    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int  gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                //保存当前节点
                int temp = array[i];
                //保存最右边的序号
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                //保存最左边的数
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }


    public static void main(String[] args) {
        int a[] = new int[]{9,8,3,7,6,5,4,3,2,1};
        int b[] = 希尔排序.ShellSort(a);
        for(int i = 0 ;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

}
