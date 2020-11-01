/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daoimpl;
import java.sql.*;
import com.dao.StudentDao;
import com.pojos.Department;
import com.pojos.Student;
//import java.awt.List;
import java.util.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import studentregisterationform.JdbcConnection;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class StudentManagement implements StudentDao{
    Connection con=JdbcConnection.getConnection();
    
    
    public void  addStudent(Student student)
    {
        try{
        String query="insert into student(s_name,f_name,s_cast,s_nic,c_number,s_address,education,d_district,d_id) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1, student.getName());
        ps.setString(2, student.getFname());
        ps.setString(3, student.getCast());
        ps.setString(4, student.getNic());
        ps.setString(5, student.getcNumber());
        ps.setString(6, student.getAddress());
        ps.setString(7, student.getEdu());
        ps.setString(8, student.getDistrict());
        ps.setInt(9,student.getDepartmentPojo().getDepartmentId());
        ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public List<Student> getStudents()
    {
     List<Student> list=new ArrayList<>();   
        try
        {
            String query="select *from Student"; 
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Student s=new Student();
               s.setId(rs.getInt("id"));
               s.setName(rs.getString("s_name"));
               s.setFname(rs.getString("f_name"));
               s.setCast(rs.getString("s_cast"));
               s.setNic(rs.getString("s_nic"));
               s.setcNumber(rs.getString("c_number"));
               s.setAddress(rs.getString("s_address"));
               s.setEdu(rs.getString("education"));
               s.setDistrict(rs.getString("d_district"));
               Department d=new Department();
               d.setDepartmentId(rs.getInt("d_id"));
               s.setDepartmentPojo(d);
               list.add(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
return list;
    } 
    public Student getById(int id)
    {
        Student s=new Student();
        try{
        String query="select *from student where id=?";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next())
        {
            Department d=new Department();
               s.setId(rs.getInt("id"));
               s.setName(rs.getString("s_name"));
               s.setFname(rs.getString("f_name"));
               s.setCast(rs.getString("s_cast"));
               s.setNic(rs.getString("s_nic"));
               s.setcNumber(rs.getString("c_number"));
               s.setAddress(rs.getString("s_address"));
               s.setEdu(rs.getString("education"));
               s.setDistrict(rs.getString("d_district"));
               d.setDepartmentId(rs.getInt("d_id"));
               s.setDepartmentPojo(d);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
    }
    
    public void update(Student student)
    {
        try{
        String query="update student set  s_name=?,f_name=?,s_cast=?,s_nic=?,c_number=?,s_address=?,education=?,d_district=?, d_id=? where id=?";
        PreparedStatement ps=con.prepareStatement(query);
        
        ps.setString(1,student.getName());
        ps.setString(2,student.getFname());
        ps.setString(3,student.getCast());
        ps.setString(4,student.getNic());
        ps.setString(5,student.getcNumber());
        ps.setString(6,student.getAddress());
        ps.setString(7,student.getEdu());
        ps.setString(8,student.getDistrict());
        ps.setInt(9,student.getDepartmentPojo().getDepartmentId());
        ps.setInt(10,student.getId());
        ps.executeUpdate();
        
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void delete(int id)
    {
        try{
            String query="delete from student where id=?";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        }catch(Exception e){e.printStackTrace();}
        
    }
}