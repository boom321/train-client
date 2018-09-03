package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.DataSubtype;
import cn.com.usrobot.restful.pojo.DataSubtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSubtypeMapper {
    int countByExample(DataSubtypeExample example);

    int deleteByExample(DataSubtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataSubtype record);

    int insertSelective(DataSubtype record);

    List<DataSubtype> selectByExample(DataSubtypeExample example);

    DataSubtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataSubtype record, @Param("example") DataSubtypeExample example);

    int updateByExample(@Param("record") DataSubtype record, @Param("example") DataSubtypeExample example);

    int updateByPrimaryKeySelective(DataSubtype record);

    int updateByPrimaryKey(DataSubtype record);
}