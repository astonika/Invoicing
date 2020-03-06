package com.xu.dao;

import com.xu.bean.SaleReturnOrder;
import com.xu.bean.SaleReturnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleReturnOrderDao {
    long countByExample(SaleReturnOrderExample example);

    int deleteByExample(SaleReturnOrderExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(SaleReturnOrder record);

    int insertSelective(SaleReturnOrder record);

    List<SaleReturnOrder> selectByExample(SaleReturnOrderExample example);

    SaleReturnOrder selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") SaleReturnOrder record, @Param("example") SaleReturnOrderExample example);

    int updateByExample(@Param("record") SaleReturnOrder record, @Param("example") SaleReturnOrderExample example);

    int updateByPrimaryKeySelective(SaleReturnOrder record);

    int updateByPrimaryKey(SaleReturnOrder record);
}