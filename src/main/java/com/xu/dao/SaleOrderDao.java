package com.xu.dao;

import com.xu.bean.SaleOrder;
import com.xu.bean.SaleOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleOrderDao {
    long countByExample(SaleOrderExample example);

    int deleteByExample(SaleOrderExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(SaleOrder record);

    int insertSelective(SaleOrder record);

    List<SaleOrder> selectByExample(SaleOrderExample example);

    SaleOrder selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByExample(@Param("record") SaleOrder record, @Param("example") SaleOrderExample example);

    int updateByPrimaryKeySelective(SaleOrder record);

    int updateByPrimaryKey(SaleOrder record);
}