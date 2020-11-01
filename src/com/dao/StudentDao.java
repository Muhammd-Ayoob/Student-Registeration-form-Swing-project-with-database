/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojos.Student;
import java.util.List;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public interface StudentDao {
    public void addStudent(Student student);
   
    public List<Student> getStudents();
    public Student getById(int id);
    public void update(Student student);
    public void delete(int id);
}
