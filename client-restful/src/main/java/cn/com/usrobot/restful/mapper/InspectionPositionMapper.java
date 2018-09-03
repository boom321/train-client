package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.InspectionPosition;
import cn.com.usrobot.restful.pojo.InspectionPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionPositionMapper {
    int countByExample(InspectionPositionExample example);

    int deleteByExample(InspectionPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InspectionPosition record);

    int insertSelective(InspectionPosition record);

    List<InspectionPosition> selectByExample(InspectionPositionExample example);

    InspectionPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InspectionPosition record, @Param("example") InspectionPositionExample example);

    int updateByExample(@Param("record") InspectionPosition record, @Param("example") InspectionPositionExample example);

    int updateByPrimaryKeySelective(InspectionPosition record);

    int updateByPrimaryKey(InspectionPosition record);
}