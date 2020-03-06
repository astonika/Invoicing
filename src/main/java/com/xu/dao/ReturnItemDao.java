package com.xu.dao;

import com.xu.bean.ReturnItem;
import com.xu.bean.ReturnItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnItemDao {
    long countByExample(ReturnItemExample example);

    int deleteByExample(ReturnItemExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(ReturnItem record);

    int insertSelective(ReturnItem record);

    List<ReturnItem> selectByExample(ReturnItemExample example);

    ReturnItem selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") ReturnItem record, @Param("example") ReturnItemExample example);

    int updateByExample(@Param("record") ReturnItem record, @Param("example") ReturnItemExample example);

    int updateByPrimaryKeySelective(ReturnItem record);

    int updateByPrimaryKey(ReturnItem record);
}