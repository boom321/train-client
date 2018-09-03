package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.HistAlert;
import cn.com.usrobot.restful.pojo.HistAlertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistAlertMapper {
    int countByExample(HistAlertExample example);

    int deleteByExample(HistAlertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistAlert record);

    int insertSelective(HistAlert record);

    List<HistAlert> selectByExample(HistAlertExample example);

    HistAlert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistAlert record, @Param("example") HistAlertExample example);

    int updateByExample(@Param("record") HistAlert record, @Param("example") HistAlertExample example);

    int updateByPrimaryKeySelective(HistAlert record);

    int updateByPrimaryKey(HistAlert record);
}