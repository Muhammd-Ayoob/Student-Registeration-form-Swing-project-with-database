/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class Student {
    private int id;
    private String name;
    private String fname;
    private String cast;
    private String nic;
    private String cNumber;
    private String address;
    private String edu;
    private String district;
    private Department departmentPojo;

    public Department getDepartmentPojo() {
        return departmentPojo;
    }

    public void setDepartmentPojo(Department departmentPojo) {
        this.departmentPojo = departmentPojo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getcNumber() {
        return cNumber;
    }

    public void setcNumber(String cNumber) {
        this.cNumber = cNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", fname=" + fname + ", cast=" + cast + ", nic=" + nic + ", cNumber=" + cNumber + ", address=" + address + ", edu=" + edu + ", district=" + district + '}';
    }
    
    
}
