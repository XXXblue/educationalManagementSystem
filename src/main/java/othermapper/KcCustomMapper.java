package othermapper;

import pojoCustom.KcCustom;

import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/12/1411:23
 * @Description:
 * @Modified By:
 */
public interface KcCustomMapper {
    public List<KcCustom> queryKcinfo(int page, int limit);
    public Integer queryKcinfoNum();
}
