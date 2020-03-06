package com.xu.dao;

import com.xu.bean.SaleReturnItem;
import com.xu.bean.SaleReturnItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnItemDao {
    long countByExample(SaleReturnItemExample example);

    int deleteByExample(SaleReturnItemExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(SaleReturnItem record);

    int insertSelective(SaleReturnItem record);

    List<SaleReturnItem> selectByExample(SaleReturnItemExample example);

    SaleReturnItem selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") SaleReturnItem record, @Param("example") SaleReturnItemExample example);

    int updateByExample(@Param("record") SaleReturnItem record, @Param("example") SaleReturnItemExample example);

    int updateByPrimaryKeySelective(SaleReturnItem record);

    int updateByPrimaryKey(SaleReturnItem record);
}