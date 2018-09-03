package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.Robot;
import cn.com.usrobot.restful.pojo.RobotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotMapper {
    int countByExample(RobotExample example);

    int deleteByExample(RobotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Robot record);

    int insertSelective(Robot record);

    List<Robot> selectByExample(RobotExample example);

    Robot selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Robot record, @Param("example") RobotExample example);

    int updateByExample(@Param("record") Robot record, @Param("example") RobotExample example);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}