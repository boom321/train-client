package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.UserFunction;
import cn.com.usrobot.restful.pojo.UserFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFunctionMapper {
    int countByExample(UserFunctionExample example);

    int deleteByExample(UserFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFunction record);

    int insertSelective(UserFunction record);

    List<UserFunction> selectByExample(UserFunctionExample example);

    UserFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFunction record, @Param("example") UserFunctionExample example);

    int updateByExample(@Param("record") UserFunction record, @Param("example") UserFunctionExample example);

    int updateByPrimaryKeySelective(UserFunction record);

    int updateByPrimaryKey(UserFunction record);
}