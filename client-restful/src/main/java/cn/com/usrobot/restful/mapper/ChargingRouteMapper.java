package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.ChargingRoute;
import cn.com.usrobot.restful.pojo.ChargingRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChargingRouteMapper {
    int countByExample(ChargingRouteExample example);

    int deleteByExample(ChargingRouteExample example);

    int deleteByPrimaryKey(Integer robotId);

    int insert(ChargingRoute record);

    int insertSelective(ChargingRoute record);

    List<ChargingRoute> selectByExample(ChargingRouteExample example);

    ChargingRoute selectByPrimaryKey(Integer robotId);

    int updateByExampleSelective(@Param("record") ChargingRoute record, @Param("example") ChargingRouteExample example);

    int updateByExample(@Param("record") ChargingRoute record, @Param("example") ChargingRouteExample example);

    int updateByPrimaryKeySelective(ChargingRoute record);

    int updateByPrimaryKey(ChargingRoute record);
}