package mapper;

import org.apache.ibatis.annotations.Param;
import po.Majorinfo;
import po.MajorinfoExample;

import java.util.List;

public interface MajorinfoMapper {
    int countByExample(MajorinfoExample example);

    int deleteByExample(MajorinfoExample example);

    int deleteByPrimaryKey(String majornum);

    int insert(Majorinfo record);

    int insertSelective(Majorinfo record);

    List<Majorinfo> selectByExample(MajorinfoExample example);

    Majorinfo selectByPrimaryKey(String majornum);

    int updateByExampleSelective(@Param("record") Majorinfo record, @Param("example") MajorinfoExample example);

    int updateByExample(@Param("record") Majorinfo record, @Param("example") MajorinfoExample example);

    int updateByPrimaryKeySelective(Majorinfo record);

    int updateByPrimaryKey(Majorinfo record);
}