package A0二维数组中的查找;

/**
 * @Auther: cpb
 * @Date: 2018/10/10 16:34
 * @Description:
 *
 *在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */

public class Demo {
    public static boolean Find(int target, int [][] array) {
        if(array.length == 0 || array[0].length == 0){
            return false;
        }
       int row = array[0].length-1;
       int col = array.length-1;
       int hang = col;
       int lie = 0;
       int demo = array[lie][col];
       while(target != demo){
           if(target > demo){
               lie++;
               if(lie > hang){
                   return false;
               }
               demo = array[lie][col];
           }else{
                col--;
               if( col<0){
                   return false;
               }
               demo = array[lie][col];
           }
       }
       return true;
    }

    public static void main(String[] args) {
       int [][]array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
       int demo = 7;
        System.out.println(Demo.Find(demo,array));
    }
}
