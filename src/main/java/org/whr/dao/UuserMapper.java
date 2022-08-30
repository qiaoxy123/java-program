package org.whr.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.whr.domain.Uuser;
import org.whr.domain.UuserExample;

public interface UuserMapper {
    long countByExample(UuserExample example);

    int deleteByExample(UuserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Uuser record);

    int insertSelective(Uuser record);

    List<Uuser> selectByExample(UuserExample example);

    Uuser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Uuser record, @Param("example") UuserExample example);

    int updateByExample(@Param("record") Uuser record, @Param("example") UuserExample example);

    int updateByPrimaryKeySelective(Uuser record);

    int updateByPrimaryKey(Uuser record);
}