package mapper;

import org.apache.ibatis.annotations.Param;
import po.Kslxsjzd;
import po.KslxsjzdExample;

import java.util.List;

public interface KslxsjzdMapper {
    int countByExample(KslxsjzdExample example);

    int deleteByExample(KslxsjzdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Kslxsjzd record);

    int insertSelective(Kslxsjzd record);

    List<Kslxsjzd> selectByExample(KslxsjzdExample example);

    Kslxsjzd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Kslxsjzd record, @Param("example") KslxsjzdExample example);

    int updateByExample(@Param("record") Kslxsjzd record, @Param("example") KslxsjzdExample example);

    int updateByPrimaryKeySelective(Kslxsjzd record);

    int updateByPrimaryKey(Kslxsjzd record);
}