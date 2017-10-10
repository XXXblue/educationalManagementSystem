package mapper;

import org.apache.ibatis.annotations.Param;
import po.Classinfo;
import po.ClassinfoExample;

import java.util.List;

public interface ClassinfoMapper {
    int countByExample(ClassinfoExample example);

    int deleteByExample(ClassinfoExample example);

    int deleteByPrimaryKey(String classnum);

    int insert(Classinfo record);

    int insertSelective(Classinfo record);

    List<Classinfo> selectByExample(ClassinfoExample example);

    Classinfo selectByPrimaryKey(String classnum);

    int updateByExampleSelective(@Param("record") Classinfo record, @Param("example") ClassinfoExample example);

    int updateByExample(@Param("record") Classinfo record, @Param("example") ClassinfoExample example);

    int updateByPrimaryKeySelective(Classinfo record);

    int updateByPrimaryKey(Classinfo record);
}