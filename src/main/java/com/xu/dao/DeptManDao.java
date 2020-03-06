package com.xu.dao;

import com.xu.bean.DeptMan;
import com.xu.bean.DeptManExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptManDao {
    long countByExample(DeptManExample example);

    int deleteByExample(DeptManExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(DeptMan record);

    int insertSelective(DeptMan record);

    List<DeptMan> selectByExample(DeptManExample example);

    DeptMan selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") DeptMan record, @Param("example") DeptManExample example);

    int updateByExample(@Param("record") DeptMan record, @Param("example") DeptManExample example);

    int updateByPrimaryKeySelective(DeptMan record);

    int updateByPrimaryKey(DeptMan record);
}