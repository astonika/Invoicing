package com.xu.dao;

import com.xu.bean.DeptEmp;
import com.xu.bean.DeptEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptEmpDao {
    long countByExample(DeptEmpExample example);

    int deleteByExample(DeptEmpExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(DeptEmp record);

    int insertSelective(DeptEmp record);

    List<DeptEmp> selectByExample(DeptEmpExample example);

    DeptEmp selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    int updateByExample(@Param("record") DeptEmp record, @Param("example") DeptEmpExample example);

    int updateByPrimaryKeySelective(DeptEmp record);

    int updateByPrimaryKey(DeptEmp record);
}