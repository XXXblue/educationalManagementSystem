package mapper;

import org.apache.ibatis.annotations.Param;
import po.Teacherinfo;
import po.TeacherinfoExample;

import java.util.List;

public interface TeacherinfoMapper {
    int countByExample(TeacherinfoExample example);

    int deleteByExample(TeacherinfoExample example);

    int deleteByPrimaryKey(String teachernum);

    int insert(Teacherinfo record);

    int insertSelective(Teacherinfo record);

    List<Teacherinfo> selectByExample(TeacherinfoExample example);

    Teacherinfo selectByPrimaryKey(String teachernum);

    int updateByExampleSelective(@Param("record") Teacherinfo record, @Param("example") TeacherinfoExample example);

    int updateByExample(@Param("record") Teacherinfo record, @Param("example") TeacherinfoExample example);

    int updateByPrimaryKeySelective(Teacherinfo record);

    int updateByPrimaryKey(Teacherinfo record);
}