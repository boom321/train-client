package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.PtzPresetNumber;
import cn.com.usrobot.restful.pojo.PtzPresetNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtzPresetNumberMapper {
    int countByExample(PtzPresetNumberExample example);

    int deleteByExample(PtzPresetNumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PtzPresetNumber record);

    int insertSelective(PtzPresetNumber record);

    List<PtzPresetNumber> selectByExample(PtzPresetNumberExample example);

    PtzPresetNumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PtzPresetNumber record, @Param("example") PtzPresetNumberExample example);

    int updateByExample(@Param("record") PtzPresetNumber record, @Param("example") PtzPresetNumberExample example);

    int updateByPrimaryKeySelective(PtzPresetNumber record);

    int updateByPrimaryKey(PtzPresetNumber record);
}