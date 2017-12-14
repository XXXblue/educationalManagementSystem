package mapper;

import org.apache.ibatis.annotations.Param;
import po.Kcinfo;
import po.KcinfoExample;

import java.util.List;

public interface KcinfoMapper {
    int countByExample(KcinfoExample example);

    int deleteByExample(KcinfoExample example);

    int deleteByPrimaryKey(String kcnum);

    int insert(Kcinfo record);

    int insertSelective(Kcinfo record);

    List<Kcinfo> selectByExampleWithBLOBs(KcinfoExample example);

    List<Kcinfo> selectByExample(KcinfoExample example);

    Kcinfo selectByPrimaryKey(String kcnum);

    int updateByExampleSelective(@Param("record") Kcinfo record, @Param("example") KcinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Kcinfo record, @Param("example") KcinfoExample example);

    int updateByExample(@Param("record") Kcinfo record, @Param("example") KcinfoExample example);

    int updateByPrimaryKeySelective(Kcinfo record);

    int updateByPrimaryKeyWithBLOBs(Kcinfo record);

    int updateByPrimaryKey(Kcinfo record);
}