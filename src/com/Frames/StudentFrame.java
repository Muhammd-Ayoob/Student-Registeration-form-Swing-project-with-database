/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Frames;
import com.pojos.Student;
import com.dao.StudentDao;
import com.dao.DepartmrntDao;
import com.daoimpl.DepartmentDaoImpl;
import com.daoimpl.StudentManagement;
import com.pojos.Department;
import com.pojos.Student;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muhammad Ayoob Bugti
 */
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    static DefaultTableModel table=null;
    StudentDao sd=new StudentManagement();
    DepartmrntDao departmenDao=new DepartmentDaoImpl(); 
    static int id=0;
    //Student s=new Student();
    public StudentFrame() {
        
        initComponents();
        fillStudentTable();
        fillDepartmentComboBox();
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(100,100, (int)dim.getWidth(),(int) dim.getHeight());
        setLocationRelativeTo(null);
    }
    
    public void fillDepartmentComboBox()
    {
        List<Department> list=departmenDao.getDepartments();
        for(Department d:list)
        {
           DepartmentComboBox.addItem(d.getDepartmentName());
        }
    }
    
    public void fillStudentTable()
    {
        Object columnNames[]={"id","Name","Fname","Cast","NIC","Number","Address","Education","District","Department"};
        DefaultTableModel table=new DefaultTableModel(columnNames,0);
        List<Student> list;
        list = sd.getStudents();
        for(Student s:list)
        {
            Department d=departmenDao.getById(s.getDepartmentPojo().getDepartmentId());
         Object rowData[]={s.getId(),s.getName(), s.getFname(),s.getCast(), s.getNic(), s.getcNumber(),s.getAddress(),s.getEdu(),s.getDistrict(),d.getDepartmentName()};   
         table.addRow(rowData);
         StudentTable.setModel(table);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        HeaderLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        fNameLbl = new javax.swing.JLabel();
        castLbl = new javax.swing.JLabel();
        nicLbl = new javax.swing.JLabel();
        cNumberLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        educationLbl = new javax.swing.JLabel();
        districtLbl = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        castField = new javax.swing.JTextField();
        nicField = new javax.swing.JTextField();
        cNumberField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        educationField = new javax.swing.JTextField();
        districtField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HeaderLbl.setText("Student Registeration Form");
        getContentPane().add(HeaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        nameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLbl.setText("Name");
        getContentPane().add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 76, 42, -1));

        fNameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fNameLbl.setText("fName");
        getContentPane().add(fNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 60, -1));

        castLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        castLbl.setText("cast");
        getContentPane().add(castLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 163, 58, -1));

        nicLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nicLbl.setText("nic");
        getContentPane().add(nicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 204, 42, -1));

        cNumberLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cNumberLbl.setText("cNumber");
        getContentPane().add(cNumberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 314, -1, -1));

        addressLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addressLbl.setText("address");
        getContentPane().add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 258, -1, -1));

        educationLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        educationLbl.setText("education");
        getContentPane().add(educationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 349, -1, 31));

        districtLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        districtLbl.setText("district");
        getContentPane().add(districtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 404, -1, 25));
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 67, 202, 31));
        getContentPane().add(fNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 113, 202, 32));
        getContentPane().add(castField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 153, 202, 33));

        nicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nicField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 197, 200, 35));

        cNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNumberFieldActionPerformed(evt);
            }
        });
        getContentPane().add(cNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 306, 202, 37));
        getContentPane().add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 249, 202, 39));

        educationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educationFieldActionPerformed(evt);
            }
        });
        getContentPane().add(educationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 349, 202, 34));

        districtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtFieldActionPerformed(evt);
            }
        });
        getContentPane().add(districtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 401, 201, 35));

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 515, 127, 70));

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 596, 134, 65));

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        StudentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(StudentTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 67, 1040, 594));

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 596, 127, 65));

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 515, 134, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Department");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 467, -1, -1));

        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(DepartmentComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 457, 201, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void educationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_educationFieldActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        String name=nameField.getText();
        String fName=fNameField.getText();
        String cast=castField.getText();
        String nic=nicField.getText();
        String cNumber=cNumberField.getText();
        String address=addressField.getText();
        String education=educationField.getText();
        String district=districtField.getText();
        String dept=DepartmentComboBox.getSelectedItem().toString();
        int id=departmenDao.getDepartmentIdByName(dept);
        
        Student st=new Student();
        Department d=new Department();
        d.setDepartmentId(id);
        st.setName(name);
        st.setFname(fName);
        st.setCast(cast);
        st.setNic(nic);
        st.setcNumber(cNumber);
        st.setAddress(address);
        st.setEdu(education);
        st.setDistrict(district);
        st.setDepartmentPojo(d);
        StudentManagement sm=new StudentManagement();
        sm.addStudent(st);
        fillStudentTable();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        nameField.setText("");
        fNameField.setText("");
        castField.setText("");
        nicField.setText("");
        cNumberField.setText("");
        addressField.setText("");
        educationField.setText("");
        districtField.setText("");

    }//GEN-LAST:event_ClearButtonActionPerformed

    private void cNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNumberFieldActionPerformed

    private void districtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtFieldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       
        
        String name=nameField.getText();
        String fName=fNameField.getText();
        String cast=castField.getText();
        String nic=nicField.getText();
        String cNumber=cNumberField.getText();
        String address=addressField.getText();
        String education=educationField.getText();
        String district=districtField.getText();
        
        
        
        String dept=DepartmentComboBox.getSelectedItem().toString();
        int dId=departmenDao.getDepartmentIdByName(dept);
        
     
        Department d=new Department();
       
        Student st=new Student();
        d.setDepartmentId(dId);
        st.setId(id);
        st.setName(name);
        st.setFname(fName);
        st.setCast(cast);
        st.setNic(nic);
        st.setcNumber(cNumber);
        st.setAddress(address);
        st.setEdu(nic);
        st.setDistrict(district);
        st.setDepartmentPojo(d);
        sd.update(st);
        
        
        fillStudentTable();
        sd.update(st);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void StudentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentTableMouseClicked
        
        id=(int) StudentTable.getValueAt(StudentTable.getSelectedRow(),0);
       
       Student s1=sd.getById(id);
      
        nameField.setText(s1.getName());
        fNameField.setText(s1.getFname());
        castField.setText(s1.getCast());
        nicField.setText(s1.getNic());
        cNumberField.setText(s1.getcNumber());
        addressField.setText(s1.getAddress());
        educationField.setText(s1.getEdu());
        districtField.setText(s1.getDistrict());
       Department d=departmenDao.getById(s1.getDepartmentPojo().getDepartmentId());
       DepartmentComboBox.setSelectedItem(d.getDepartmentName());
    }//GEN-LAST:event_StudentTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        sd.delete(id);
        fillStudentTable();
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void nicFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JLabel HeaderLbl;
    private javax.swing.JTable StudentTable;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField cNumberField;
    private javax.swing.JLabel cNumberLbl;
    private javax.swing.JTextField castField;
    private javax.swing.JLabel castLbl;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField districtField;
    private javax.swing.JLabel districtLbl;
    private javax.swing.JTextField educationField;
    private javax.swing.JLabel educationLbl;
    private javax.swing.JTextField fNameField;
    private javax.swing.JLabel fNameLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nicField;
    private javax.swing.JLabel nicLbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
