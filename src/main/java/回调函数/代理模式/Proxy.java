package 回调函数.代理模式;

/**
 * @Auther: cpb
 * @Date: 2019/1/17 17:27
 * @Description:
 */
public class Proxy implements CallBack {
    private CallBack callBack;

    public Proxy(CallBack callBack){
        this.callBack = callBack;
    }
    @Override
    public void execute() {
        callBack.execute();
    }
}
