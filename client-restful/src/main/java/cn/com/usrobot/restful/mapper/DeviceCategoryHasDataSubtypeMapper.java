package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.DeviceCategoryHasDataSubtypeExample;
import cn.com.usrobot.restful.pojo.DeviceCategoryHasDataSubtypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceCategoryHasDataSubtypeMapper {
    int countByExample(DeviceCategoryHasDataSubtypeExample example);

    int deleteByExample(DeviceCategoryHasDataSubtypeExample example);

    int deleteByPrimaryKey(DeviceCategoryHasDataSubtypeKey key);

    int insert(DeviceCategoryHasDataSubtypeKey record);

    int insertSelective(DeviceCategoryHasDataSubtypeKey record);

    List<DeviceCategoryHasDataSubtypeKey> selectByExample(DeviceCategoryHasDataSubtypeExample example);

    int updateByExampleSelective(@Param("record") DeviceCategoryHasDataSubtypeKey record, @Param("example") DeviceCategoryHasDataSubtypeExample example);

    int updateByExample(@Param("record") DeviceCategoryHasDataSubtypeKey record, @Param("example") DeviceCategoryHasDataSubtypeExample example);
}