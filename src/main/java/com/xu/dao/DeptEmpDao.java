package com.xu.dao;

import com.xu.bean.DeptEmpExample;
import com.xu.bean.DeptEmpKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptEmpDao {
    long countByExample(DeptEmpExample example);

    int deleteByExample(DeptEmpExample example);

    int deleteByPrimaryKey(DeptEmpKey key);

    int insert(DeptEmpKey record);

    int insertSelective(DeptEmpKey record);

    List<DeptEmpKey> selectByExample(DeptEmpExample example);

    int updateByExampleSelective(@Param("record") DeptEmpKey record, @Param("example") DeptEmpExample example);

    int updateByExample(@Param("record") DeptEmpKey record, @Param("example") DeptEmpExample example);
}