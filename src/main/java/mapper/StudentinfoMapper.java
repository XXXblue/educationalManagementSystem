package mapper;

import org.apache.ibatis.annotations.Param;
import po.Studentinfo;
import po.StudentinfoExample;

import java.util.List;

public interface StudentinfoMapper {
    int countByExample(StudentinfoExample example);

    int deleteByExample(StudentinfoExample example);

    int deleteByPrimaryKey(String studentnum);

    int insert(Studentinfo record);

    int insertSelective(Studentinfo record);

    List<Studentinfo> selectByExample(StudentinfoExample example);

    Studentinfo selectByPrimaryKey(String studentnum);

    int updateByExampleSelective(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByExample(@Param("record") Studentinfo record, @Param("example") StudentinfoExample example);

    int updateByPrimaryKeySelective(Studentinfo record);

    int updateByPrimaryKey(Studentinfo record);
}