package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.CameraType;
import cn.com.usrobot.restful.pojo.CameraTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CameraTypeMapper {
    int countByExample(CameraTypeExample example);

    int deleteByExample(CameraTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CameraType record);

    int insertSelective(CameraType record);

    List<CameraType> selectByExample(CameraTypeExample example);

    CameraType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CameraType record, @Param("example") CameraTypeExample example);

    int updateByExample(@Param("record") CameraType record, @Param("example") CameraTypeExample example);

    int updateByPrimaryKeySelective(CameraType record);

    int updateByPrimaryKey(CameraType record);
}