package mapper;

import org.apache.ibatis.annotations.Param;
import po.Studentcourseinfo;
import po.StudentcourseinfoExample;

import java.util.List;

public interface StudentcourseinfoMapper {
    int countByExample(StudentcourseinfoExample example);

    int deleteByExample(StudentcourseinfoExample example);

    int deleteByPrimaryKey(Integer stucourseid);

    int insert(Studentcourseinfo record);

    int insertSelective(Studentcourseinfo record);

    List<Studentcourseinfo> selectByExample(StudentcourseinfoExample example);

    Studentcourseinfo selectByPrimaryKey(Integer stucourseid);

    int updateByExampleSelective(@Param("record") Studentcourseinfo record, @Param("example") StudentcourseinfoExample example);

    int updateByExample(@Param("record") Studentcourseinfo record, @Param("example") StudentcourseinfoExample example);

    int updateByPrimaryKeySelective(Studentcourseinfo record);

    int updateByPrimaryKey(Studentcourseinfo record);
}