package cn.com.usrobot.restful.mapper;

import cn.com.usrobot.restful.pojo.DataType;
import cn.com.usrobot.restful.pojo.DataTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataTypeMapper {
    int countByExample(DataTypeExample example);

    int deleteByExample(DataTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataType record);

    int insertSelective(DataType record);

    List<DataType> selectByExample(DataTypeExample example);

    DataType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataType record, @Param("example") DataTypeExample example);

    int updateByExample(@Param("record") DataType record, @Param("example") DataTypeExample example);

    int updateByPrimaryKeySelective(DataType record);

    int updateByPrimaryKey(DataType record);
}