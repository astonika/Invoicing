package com.xu.dao;

import com.xu.bean.Dept;
import com.xu.bean.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptDao {
    long countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}