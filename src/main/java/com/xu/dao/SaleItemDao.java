package com.xu.dao;

import com.xu.bean.SaleItem;
import com.xu.bean.SaleItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleItemDao {
    long countByExample(SaleItemExample example);

    int deleteByExample(SaleItemExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(SaleItem record);

    int insertSelective(SaleItem record);

    List<SaleItem> selectByExample(SaleItemExample example);

    SaleItem selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") SaleItem record, @Param("example") SaleItemExample example);

    int updateByExample(@Param("record") SaleItem record, @Param("example") SaleItemExample example);

    int updateByPrimaryKeySelective(SaleItem record);

    int updateByPrimaryKey(SaleItem record);
}