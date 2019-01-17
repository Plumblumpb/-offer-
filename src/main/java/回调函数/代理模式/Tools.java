package 回调函数.代理模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/17 16:35
 * @Description:
 */
public class Tools {
    /**
     * 测试函数使用时间，通过定义CallBack接口的execute方法
     * @param callBack
     */
    public   void  testTime(CallBack callBack) {
        long  begin = System.currentTimeMillis(); //测试起始时间
        callBack.execute(); ///进行回调操作
        long  end = System.currentTimeMillis(); //测试结束时间
        System.out.println("[use time]:"  + (end - begin)); //打印使用时间
    }

    public   static   void  main(String[] args) {
        Tools tool = new Tools();
        //让代理去实现方法去调用方法
        Proxy proxy = new Proxy(new MyCallBack());
        tool.testTime(proxy);
    }
}
