package util;

/**
 * @Author: XBlue
 * @Date: Create in 2017/10/711:07
 * @Description:
 * @Modified By:
 */
public class SubStringUtils {
    public static String getSubStr(String str, int num) {
        String result = "";
        int i = 0;
        while(i < num) {
            int lastFirst = str.lastIndexOf('/');
            result = str.substring(lastFirst) + result;
            str = str.substring(0, lastFirst);
            i++;
        }
        return result.substring(1);
    }
}
