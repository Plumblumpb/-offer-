package 排序算法;

/**
 * @Auther: cpb
 * @Date: 2019/1/7 18:56
 * @Description:
 */
public class 快速排序 {

    public static void quickSort(int[] arr,int start,int end){

        //递归调用的结束条件,开始要拆分的数组就剩下一个元素的时候
        if(end-start<1)
            return;
        int part = partArr(arr, start, end);
        //三种情况下的继续拆分
        if(part==start)
            quickSort(arr,part+1,end);
        else if(part ==end)
            quickSort(arr,start,end-1);
        else{
            quickSort(arr,start,part-1);
            quickSort(arr,part+1,end);
        }
    }

    public static int partArr(int[] arr, int start, int end) {

        //选取基准元素，这里我们以最后一个位置，作为基准

        int base = arr[end];
        //记录，比基准元素小的变量，这里我们假设要比较的元素都不小于基准元素，这样通过比较
        //就把小于基准元素的数据全部找到，n=start表示的就是默认没有小于基准元素。
        int n = start;

        //基准元素不参与遍历比较
        for (int i = start; i < end; i++) {
            if (arr[i] < base) {
                //将小于基准元素的放到基准的左边
                if (i != n)
                    swap(arr, i, n);
                n++;
            }
        }
        //遍历完成之后，将基准元素放到应该的位置上
        swap(arr, n, end);
        return n;
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int a[] = new int[]{1,8,3,7,6,5,4,3,2,9};
        快速排序.quickSort(a,0,a.length-1);
        for(int i = 0 ;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
