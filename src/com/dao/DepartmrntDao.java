/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Department;
import java.util.List;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public interface DepartmrntDao {
    public List<Department> getDepartments();
    public int getDepartmentIdByName(String name);
    public Department getById(int id);
}
