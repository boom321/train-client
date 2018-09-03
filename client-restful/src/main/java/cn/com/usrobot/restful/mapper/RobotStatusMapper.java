package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.RobotStatus;
import cn.com.usrobot.restful.pojo.RobotStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotStatusMapper {
    int countByExample(RobotStatusExample example);

    int deleteByExample(RobotStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RobotStatus record);

    int insertSelective(RobotStatus record);

    List<RobotStatus> selectByExample(RobotStatusExample example);

    RobotStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RobotStatus record, @Param("example") RobotStatusExample example);

    int updateByExample(@Param("record") RobotStatus record, @Param("example") RobotStatusExample example);

    int updateByPrimaryKeySelective(RobotStatus record);

    int updateByPrimaryKey(RobotStatus record);
}