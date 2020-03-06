package com.xu.dao;

import com.xu.bean.PurchaseItem;
import com.xu.bean.PurchaseItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseItemDao {
    long countByExample(PurchaseItemExample example);

    int deleteByExample(PurchaseItemExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(PurchaseItem record);

    int insertSelective(PurchaseItem record);

    List<PurchaseItem> selectByExample(PurchaseItemExample example);

    PurchaseItem selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") PurchaseItem record, @Param("example") PurchaseItemExample example);

    int updateByExample(@Param("record") PurchaseItem record, @Param("example") PurchaseItemExample example);

    int updateByPrimaryKeySelective(PurchaseItem record);

    int updateByPrimaryKey(PurchaseItem record);
}