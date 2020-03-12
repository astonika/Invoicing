package com.xu.service;

import com.xu.bean.Employee;
import com.xu.bean.Managers;
import com.xu.bean.Message;

public interface ManagerService {

    int register(Managers manager);

    int employeeregister(Employee manager);

    Message findMessageById(Long id);

    void updateEmployeeById(Long id);
}
