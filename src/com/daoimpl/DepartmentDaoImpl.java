/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daoimpl;
import com.dao.DepartmrntDao;
import com.pojos.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import studentregisterationform.JdbcConnection;
/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class DepartmentDaoImpl implements DepartmrntDao {
     Connection con=JdbcConnection.getConnection();
    public List<Department> getDepartments()
    {
     List<Department> list=new ArrayList<>();   
        try
        {
            String query="select *from Department"; 
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Department d=new Department();
               d.setDepartmentId(rs.getInt("d_id"));
               d.setDepartmentName(rs.getString("d_name"));
               
               
               list.add(d);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
return list;
    } 
    
    
    public int getDepartmentIdByName(String name)
    {
        int deptId=0;
       Department d=new Department();
        try{
        String query="select d_id from Department where d_name=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,name);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
               deptId=rs.getInt("d_id");
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return deptId;
    }
    
    public Department getById(int id)
    {
        Department d=new Department();
        try{
        String query="select *from Department where d_id=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
               d.setDepartmentId(rs.getInt("d_id"));
               d.setDepartmentName(rs.getString("d_name"));
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return d;
    }
}
