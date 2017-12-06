package mapper;

import org.apache.ibatis.annotations.Param;
import po.Applygrade;
import po.ApplygradeExample;

import java.util.List;

public interface ApplygradeMapper {
    int countByExample(ApplygradeExample example);

    int deleteByExample(ApplygradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Applygrade record);

    int insertSelective(Applygrade record);

    List<Applygrade> selectByExample(ApplygradeExample example);

    Applygrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Applygrade record, @Param("example") ApplygradeExample example);

    int updateByExample(@Param("record") Applygrade record, @Param("example") ApplygradeExample example);

    int updateByPrimaryKeySelective(Applygrade record);

    int updateByPrimaryKey(Applygrade record);
}