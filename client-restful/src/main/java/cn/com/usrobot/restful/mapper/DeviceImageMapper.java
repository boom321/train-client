package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.DeviceImage;
import cn.com.usrobot.restful.pojo.DeviceImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceImageMapper {
    int countByExample(DeviceImageExample example);

    int deleteByExample(DeviceImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceImage record);

    int insertSelective(DeviceImage record);

    List<DeviceImage> selectByExample(DeviceImageExample example);

    DeviceImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceImage record, @Param("example") DeviceImageExample example);

    int updateByExample(@Param("record") DeviceImage record, @Param("example") DeviceImageExample example);

    int updateByPrimaryKeySelective(DeviceImage record);

    int updateByPrimaryKey(DeviceImage record);
}