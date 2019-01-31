package 集合类.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Auther: cpb
 * @Date: 2019/1/31 15:21
 * @Description:
 */
public class ArraylistTest<E> {
    //数组保存元素
    private  Object[] elementData;
    //数组大小
    private int size;
    //创建默认数组大小
    private static int DEFAULT_CAPACITY = 10;
    //判断下标是否越界
    private void rangeCheck(int index) {
        if (index >= size)
             new Exception("数组越界");
    }
    public void ensureCapacityInternal(int capacity){
        //大于初始化容量就扩容
        if(capacity>DEFAULT_CAPACITY){
            //实现容量扩充
            elementData= Arrays.copyOf(elementData, capacity*2+1);
        }
    }
    //修改
    public void set(int index ,E e){
        //判断是否越界
        rangeCheck(index);
        //设置元素
        elementData[index] = e;
    }
    //新增
    public boolean add(E e){
        //判断size+1是否越界，越界则扩容
        ensureCapacityInternal(size + 1);
        //添加元素
        elementData[size++] = e;
        return true;
    }
    //获取
    public E get(int index){
        //判断是否越界
        rangeCheck(index);
        return (E) elementData[index];
    }
    //删除
    public  boolean remove(int index){
        //判断是否越界
        rangeCheck(index);
        //获取需要移动的位数
        int numMoved = size - index - 1;
        if (numMoved > 0)
            //源数组，起始位置，目标数组，起始位置，复制长度。
            System.arraycopy(elementData, index+1, elementData, index, numMoved);
        elementData[--size] = null;
        return true;
    }

}
