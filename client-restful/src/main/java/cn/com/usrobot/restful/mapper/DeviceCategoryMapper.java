package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.DeviceCategory;
import cn.com.usrobot.restful.pojo.DeviceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceCategoryMapper {
    int countByExample(DeviceCategoryExample example);

    int deleteByExample(DeviceCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeviceCategory record);

    int insertSelective(DeviceCategory record);

    List<DeviceCategory> selectByExample(DeviceCategoryExample example);

    DeviceCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeviceCategory record, @Param("example") DeviceCategoryExample example);

    int updateByExample(@Param("record") DeviceCategory record, @Param("example") DeviceCategoryExample example);

    int updateByPrimaryKeySelective(DeviceCategory record);

    int updateByPrimaryKey(DeviceCategory record);
}