package exception;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1312:36
 * @Description:
 * @Modified By:
 */
public class CustomException extends Exception{
    //系统自定义异常处理类,针对预期的异常，需要在程序中抛出此类的异常
    //异常信息
    private String message;

    public CustomException(String message){
        super(message);
        this.message=message;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

}
