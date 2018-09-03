package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.Variable;
import cn.com.usrobot.restful.pojo.VariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariableMapper {
    int countByExample(VariableExample example);

    int deleteByExample(VariableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Variable record);

    int insertSelective(Variable record);

    List<Variable> selectByExample(VariableExample example);

    Variable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Variable record, @Param("example") VariableExample example);

    int updateByExample(@Param("record") Variable record, @Param("example") VariableExample example);

    int updateByPrimaryKeySelective(Variable record);

    int updateByPrimaryKey(Variable record);
}