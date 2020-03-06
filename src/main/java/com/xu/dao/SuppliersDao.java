package com.xu.dao;

import com.xu.bean.Suppliers;
import com.xu.bean.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersDao {
    long countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    List<Suppliers> selectByExample(SuppliersExample example);

    Suppliers selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}