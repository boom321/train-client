package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.VariablePresetPositionMap;
import cn.com.usrobot.restful.pojo.VariablePresetPositionMapExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablePresetPositionMapMapper {
    int countByExample(VariablePresetPositionMapExample example);

    int deleteByExample(VariablePresetPositionMapExample example);

    int deleteByPrimaryKey(Integer variableId);

    int insert(VariablePresetPositionMap record);

    int insertSelective(VariablePresetPositionMap record);

    List<VariablePresetPositionMap> selectByExample(VariablePresetPositionMapExample example);

    VariablePresetPositionMap selectByPrimaryKey(Integer variableId);

    int updateByExampleSelective(@Param("record") VariablePresetPositionMap record, @Param("example") VariablePresetPositionMapExample example);

    int updateByExample(@Param("record") VariablePresetPositionMap record, @Param("example") VariablePresetPositionMapExample example);

    int updateByPrimaryKeySelective(VariablePresetPositionMap record);

    int updateByPrimaryKey(VariablePresetPositionMap record);
}