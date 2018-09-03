package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.RobotPose;
import cn.com.usrobot.restful.pojo.RobotPoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RobotPoseMapper {
    int countByExample(RobotPoseExample example);

    int deleteByExample(RobotPoseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RobotPose record);

    int insertSelective(RobotPose record);

    List<RobotPose> selectByExample(RobotPoseExample example);

    RobotPose selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RobotPose record, @Param("example") RobotPoseExample example);

    int updateByExample(@Param("record") RobotPose record, @Param("example") RobotPoseExample example);

    int updateByPrimaryKeySelective(RobotPose record);

    int updateByPrimaryKey(RobotPose record);
}