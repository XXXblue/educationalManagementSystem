package othermapper;

import po.Rolepermission;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2214:58
 * @Description:
 * @Modified By:
 */
public interface MyManagerMapper {
    public List<Rolepermission> selPermissionByManagerNum(String ManagerNum);
}
