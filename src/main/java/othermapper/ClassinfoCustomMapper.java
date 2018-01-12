package othermapper;

import pojoCustom.ClassinfoCustom;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1318:53
 * @Description:
 * @Modified By:
 */
public interface ClassinfoCustomMapper {
    public  List <ClassinfoCustom> queryClassinfo(int page,int limit);
    public Integer queryClassinfoNum();
    public List<ClassinfoCustom> searchFreeClass(String ct,String ty,String tt,String cd ,String cdt,String th);
}
