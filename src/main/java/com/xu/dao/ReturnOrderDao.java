package com.xu.dao;

import com.xu.bean.ReturnOrder;
import com.xu.bean.ReturnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnOrderDao {
    long countByExample(ReturnOrderExample example);

    int deleteByExample(ReturnOrderExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(ReturnOrder record);

    int insertSelective(ReturnOrder record);

    List<ReturnOrder> selectByExample(ReturnOrderExample example);

    ReturnOrder selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") ReturnOrder record, @Param("example") ReturnOrderExample example);

    int updateByExample(@Param("record") ReturnOrder record, @Param("example") ReturnOrderExample example);

    int updateByPrimaryKeySelective(ReturnOrder record);

    int updateByPrimaryKey(ReturnOrder record);
}