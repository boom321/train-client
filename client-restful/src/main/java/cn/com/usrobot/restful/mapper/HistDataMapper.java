package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.HistData;
import cn.com.usrobot.restful.pojo.HistDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistDataMapper {
    int countByExample(HistDataExample example);

    int deleteByExample(HistDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistData record);

    int insertSelective(HistData record);

    List<HistData> selectByExample(HistDataExample example);

    HistData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistData record, @Param("example") HistDataExample example);

    int updateByExample(@Param("record") HistData record, @Param("example") HistDataExample example);

    int updateByPrimaryKeySelective(HistData record);

    int updateByPrimaryKey(HistData record);
}