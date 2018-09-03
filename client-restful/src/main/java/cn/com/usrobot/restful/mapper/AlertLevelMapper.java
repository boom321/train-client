package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.AlertLevel;
import cn.com.usrobot.restful.pojo.AlertLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlertLevelMapper {
    int countByExample(AlertLevelExample example);

    int deleteByExample(AlertLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AlertLevel record);

    int insertSelective(AlertLevel record);

    List<AlertLevel> selectByExample(AlertLevelExample example);

    AlertLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AlertLevel record, @Param("example") AlertLevelExample example);

    int updateByExample(@Param("record") AlertLevel record, @Param("example") AlertLevelExample example);

    int updateByPrimaryKeySelective(AlertLevel record);

    int updateByPrimaryKey(AlertLevel record);
}