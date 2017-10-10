package mapper;

import org.apache.ibatis.annotations.Param;
import po.Managerinfo;
import po.ManagerinfoExample;

import java.util.List;

public interface ManagerinfoMapper {
    int countByExample(ManagerinfoExample example);

    int deleteByExample(ManagerinfoExample example);

    int deleteByPrimaryKey(String managernum);

    int insert(Managerinfo record);

    int insertSelective(Managerinfo record);

    List<Managerinfo> selectByExample(ManagerinfoExample example);

    Managerinfo selectByPrimaryKey(String managernum);

    int updateByExampleSelective(@Param("record") Managerinfo record, @Param("example") ManagerinfoExample example);

    int updateByExample(@Param("record") Managerinfo record, @Param("example") ManagerinfoExample example);

    int updateByPrimaryKeySelective(Managerinfo record);

    int updateByPrimaryKey(Managerinfo record);
}