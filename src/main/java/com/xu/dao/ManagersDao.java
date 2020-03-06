package com.xu.dao;

import com.xu.bean.Managers;
import com.xu.bean.ManagersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagersDao {
    long countByExample(ManagersExample example);

    int deleteByExample(ManagersExample example);

    int deleteByPrimaryKey(Long customerId);

    int insert(Managers record);

    int insertSelective(Managers record);

    List<Managers> selectByExample(ManagersExample example);

    Managers selectByPrimaryKey(Long customerId);

    int updateByExampleSelective(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByExample(@Param("record") Managers record, @Param("example") ManagersExample example);

    int updateByPrimaryKeySelective(Managers record);

    int updateByPrimaryKey(Managers record);
}