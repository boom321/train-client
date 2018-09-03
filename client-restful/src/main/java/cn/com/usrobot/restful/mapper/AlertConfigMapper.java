package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.AlertConfig;
import cn.com.usrobot.restful.pojo.AlertConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlertConfigMapper {
    int countByExample(AlertConfigExample example);

    int deleteByExample(AlertConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlertConfig record);

    int insertSelective(AlertConfig record);

    List<AlertConfig> selectByExample(AlertConfigExample example);

    AlertConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlertConfig record, @Param("example") AlertConfigExample example);

    int updateByExample(@Param("record") AlertConfig record, @Param("example") AlertConfigExample example);

    int updateByPrimaryKeySelective(AlertConfig record);

    int updateByPrimaryKey(AlertConfig record);
}