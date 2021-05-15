/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author doquangminh
 */
public class F4_Student extends javax.swing.JPanel {

    /**
     * Creates new form EditLecturer
     */
    public F4_Student() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Search sr = new Search();
        //System.out.println(sr.searchAll("Subject", "name"));
        String[] infos = ConnectMySQL.getConnectMySQL().get_query(sr.searchAll("student", "student_id"));
        //String[] infos1 = ConnectMySQL.getConnectMySQL().get_query(sr.search("Major", "major_id", major_id));
        for(int j=0; j<infos.length/11; j++){
            String student_id = infos[j*11 + 0];
            String name = infos[11*j+1] + " " + infos[11*j + 2] + " " + infos[11*j + 3];
            String gender_id = infos[11*j+4];
            String gender = new String();
            if (gender_id.charAt(0) == '1' || gender_id.charAt(0) == 'F') 
                gender = "Female";
            else
                gender = "Male";
            String date_of_birth = infos[11*j + 5] + "/" + infos[11*j + 6] + "/" + infos[11*j + 7];
            //String email = infos[11*j + 8];
            //String phone = infos[11*j + 9];
            String major_id = infos[11*j + 10];
            String[] infos1 = ConnectMySQL.getConnectMySQL().get_query(sr.getValue("major", "major_id", major_id));
            String major = infos1[1];
            String department_id = infos1[2];
            String[] infos2 = ConnectMySQL.getConnectMySQL().get_query(sr.getValue("department", "department_id", department_id));
            String department = infos2[1];
            model.addRow(new Object[]{student_id, name,
                date_of_birth, gender, department, major});
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

        jLabel1 = new javax.swing.JLabel();
        SearchBar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEditInformation = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setText("Student List");

        jTable1.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Full name", "Date of birth", "Gender", "Department", "Major"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnSearch.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnAdd.setText("Add new");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEditInformation.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditInformation.setText("Edit Information");
        btnEditInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(400, 400, 400))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchBar)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Search sr = new Search();
        //System.out.println(sr.searchAll("Subject", "name"));
        String[] infos = ConnectMySQL.getConnectMySQL().get_query(sr.search("student", "student_id", SearchBar.getText()));
        //String[] infos1 = ConnectMySQL.getConnectMySQL().get_query(sr.search("Major", "major_id", major_id));
        for(int j=0; j<infos.length/11; j++){
            String student_id = infos[j*11 + 0];
            String name = infos[11*j+1] + " " + infos[11*j + 2] + " " + infos[11*j + 3];
            String gender_id = infos[11*j+4];
            String gender = new String();
            if (gender_id.charAt(0) == '1' || gender_id.charAt(0) == 'F') 
                gender = "Female";
            else
                gender = "Male";
            String date_of_birth = infos[11*j + 5] + "/" + infos[11*j + 6] + "/" + infos[11*j + 7];
            //String email = infos[11*j + 8];
            //String phone = infos[11*j + 9];
            String major_id = infos[11*j + 10];
            String[] infos1 = ConnectMySQL.getConnectMySQL().get_query(sr.getValue("major", "major_id", major_id));
            String major = infos1[1];
            String department_id = infos1[2];
            String[] infos2 = ConnectMySQL.getConnectMySQL().get_query(sr.getValue("department", "department_id", department_id));
            String department = infos2[1];
            model.addRow(new Object[]{student_id, name,
                date_of_birth, gender, department, major});
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainAdmin.goBack();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditInformationActionPerformed
        // TODO add your handling code here:
        MainAdmin.goToEditStudent();
    }//GEN-LAST:event_btnEditInformationActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchBar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditInformation;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
