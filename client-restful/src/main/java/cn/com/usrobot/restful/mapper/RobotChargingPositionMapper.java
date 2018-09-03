package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.RobotChargingPosition;
import cn.com.usrobot.restful.pojo.RobotChargingPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotChargingPositionMapper {
    int countByExample(RobotChargingPositionExample example);

    int deleteByExample(RobotChargingPositionExample example);

    int deleteByPrimaryKey(Integer robotRobotId);

    int insert(RobotChargingPosition record);

    int insertSelective(RobotChargingPosition record);

    List<RobotChargingPosition> selectByExample(RobotChargingPositionExample example);

    RobotChargingPosition selectByPrimaryKey(Integer robotRobotId);

    int updateByExampleSelective(@Param("record") RobotChargingPosition record, @Param("example") RobotChargingPositionExample example);

    int updateByExample(@Param("record") RobotChargingPosition record, @Param("example") RobotChargingPositionExample example);

    int updateByPrimaryKeySelective(RobotChargingPosition record);

    int updateByPrimaryKey(RobotChargingPosition record);
}