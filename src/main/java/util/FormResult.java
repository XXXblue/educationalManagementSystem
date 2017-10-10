package util;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1216:42
 * @Description:
 * @Modified By:
 */
public class FormResult {
//        ma.put("code",0);
//        ma.put("msg","");
//        ma.put("count",100);
//        ma.put("data",list);

    private Integer code;
    private String msg;
    private Long count;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }


}
