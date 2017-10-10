package mapper;

import org.apache.ibatis.annotations.Param;
import po.Deptinfo;
import po.DeptinfoExample;

import java.util.List;

public interface DeptinfoMapper {
    int countByExample(DeptinfoExample example);

    int deleteByExample(DeptinfoExample example);

    int deleteByPrimaryKey(String deptnum);

    int insert(Deptinfo record);

    int insertSelective(Deptinfo record);

    List<Deptinfo> selectByExampleWithBLOBs(DeptinfoExample example);

    List<Deptinfo> selectByExample(DeptinfoExample example);

    Deptinfo selectByPrimaryKey(String deptnum);

    int updateByExampleSelective(@Param("record") Deptinfo record, @Param("example") DeptinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Deptinfo record, @Param("example") DeptinfoExample example);

    int updateByExample(@Param("record") Deptinfo record, @Param("example") DeptinfoExample example);

    int updateByPrimaryKeySelective(Deptinfo record);

    int updateByPrimaryKeyWithBLOBs(Deptinfo record);

    int updateByPrimaryKey(Deptinfo record);
}