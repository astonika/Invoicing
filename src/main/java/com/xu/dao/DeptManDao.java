package com.xu.dao;

import com.xu.bean.DeptManExample;
import com.xu.bean.DeptManKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptManDao {
    long countByExample(DeptManExample example);

    int deleteByExample(DeptManExample example);

    int deleteByPrimaryKey(DeptManKey key);

    int insert(DeptManKey record);

    int insertSelective(DeptManKey record);

    List<DeptManKey> selectByExample(DeptManExample example);

    int updateByExampleSelective(@Param("record") DeptManKey record, @Param("example") DeptManExample example);

    int updateByExample(@Param("record") DeptManKey record, @Param("example") DeptManExample example);
}