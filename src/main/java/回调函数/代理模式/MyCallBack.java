package 回调函数.代理模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/17 17:25
 * @Description:
 */
public class MyCallBack implements CallBack{
    @Override
    public void execute() {
        MyCallBack.testMethod();
    }
    public   static   void  testMethod(){
        for ( int  i= 0 ; i< 100000000 ; i++){

        }
    }
}
