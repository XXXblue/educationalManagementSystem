package util;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1021:06
 * @Description:
 * @Modified By:
 */
public class MyResult {
    // 响应业务状态
    private   Integer status;

    // 响应消息
    private   String msg;

    // 响应中的数据
    private   Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
