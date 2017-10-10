

import org.junit.Test;
import util.PasswordEncoder;
/**
 * @Author: XBlue
 * @Date: Create in 2017/9/179:18
 * @Description:
 * @Modified By:
 */

public class TestPasswordEncoder {
    @Test
    public void TestPasswordEncord(){
        String salt = "be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e";
        PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
        String encode = encoderMd5.encode("zxp52077");
        System.out.println(encode);
        boolean passwordValid = encoderMd5.isPasswordValid("c21feb87d79fd42e4336e4c231785ff9", "test");
        System.out.println(passwordValid);

        PasswordEncoder encoderSha = new PasswordEncoder(salt, "SHA");
        String pass2 = encoderSha.encode("test");
        System.out.println(pass2);
        boolean passwordValid2 = encoderSha.isPasswordValid("409cf43cbdc92e1979018b2e2fdc60c7f07673e9", "test");
        System.out.println(passwordValid2);

    }


}
