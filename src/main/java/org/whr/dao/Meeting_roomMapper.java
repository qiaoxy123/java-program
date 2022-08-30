package org.whr.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.whr.domain.Meeting_room;
import org.whr.domain.Meeting_roomExample;

public interface Meeting_roomMapper {
    long countByExample(Meeting_roomExample example);

    int deleteByExample(Meeting_roomExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Meeting_room record);

    int insertSelective(Meeting_room record);

    List<Meeting_room> selectByExample(Meeting_roomExample example);

    Meeting_room selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Meeting_room record, @Param("example") Meeting_roomExample example);

    int updateByExample(@Param("record") Meeting_room record, @Param("example") Meeting_roomExample example);

    int updateByPrimaryKeySelective(Meeting_room record);

    int updateByPrimaryKey(Meeting_room record);
}