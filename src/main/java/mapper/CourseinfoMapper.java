package mapper;

import org.apache.ibatis.annotations.Param;
import po.Courseinfo;
import po.CourseinfoExample;

import java.util.List;

public interface CourseinfoMapper {
    int countByExample(CourseinfoExample example);

    int deleteByExample(CourseinfoExample example);

    int deleteByPrimaryKey(String coursenum);

    int insert(Courseinfo record);

    int insertSelective(Courseinfo record);

    List<Courseinfo> selectByExampleWithBLOBs(CourseinfoExample example);

    List<Courseinfo> selectByExample(CourseinfoExample example);

    Courseinfo selectByPrimaryKey(String coursenum);

    int updateByExampleSelective(@Param("record") Courseinfo record, @Param("example") CourseinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Courseinfo record, @Param("example") CourseinfoExample example);

    int updateByExample(@Param("record") Courseinfo record, @Param("example") CourseinfoExample example);

    int updateByPrimaryKeySelective(Courseinfo record);

    int updateByPrimaryKeyWithBLOBs(Courseinfo record);

    int updateByPrimaryKey(Courseinfo record);
}