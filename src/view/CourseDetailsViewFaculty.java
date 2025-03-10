 package view;
 import dto.CourseDetailsDto;
 import java.util.ArrayList;
 import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
 import controller.CourseDetailsController;
 
 
 public class CourseDetailsViewFaculty extends javax.swing.JFrame {
    private CourseDetailsController courseDetailsController = new CourseDetailsController();
     /**
      * Creates new form CourseDetailsView
      */
     public CourseDetailsViewFaculty() {
         initComponents();
         loadTable();
     }
 
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {
 
         lblHeader = new javax.swing.JLabel();
         lblCourseID = new javax.swing.JLabel();
         txtCourseID = new javax.swing.JTextField();
         lblTitle = new javax.swing.JLabel();
         txtTitle = new javax.swing.JTextField();
         lblCreditsHours = new javax.swing.JLabel();
         txtCreditHours = new javax.swing.JTextField();
         lblDeportment = new javax.swing.JLabel();
         txtDeportment = new javax.swing.JTextField();
         lblPrerequisites = new javax.swing.JLabel();
         txtPrerequisites = new javax.swing.JTextField();
         lblMEC = new javax.swing.JLabel();
         txtMEC = new javax.swing.JTextField();
         btnBack = new javax.swing.JButton();
         btnUpdateCourse = new javax.swing.JButton();
         btnDeleteCourse = new javax.swing.JButton();
         jScrollPane1 = new javax.swing.JScrollPane();
         tblCourseDetails = new javax.swing.JTable();
         btnAddCourse1 = new javax.swing.JButton();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         lblHeader.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
         lblHeader.setForeground(new java.awt.Color(102, 102, 102));
         lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
         lblHeader.setText("Course Management System - Course Details");
 
         lblCourseID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
         lblCourseID.setText("Course ID");
 
         lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
         lblTitle.setText("Course Name");
 
         lblCreditsHours.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
         lblCreditsHours.setText("Credit Hours");
 
         lblDeportment.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
         lblDeportment.setText(" Deportment");
 
         lblPrerequisites.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
         lblPrerequisites.setText("Prerequisites");
 
         lblMEC.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
         lblMEC.setText("Maximum Enrollment Capacity");
 
         btnBack.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
         btnBack.setForeground(new java.awt.Color(102, 102, 102));
         btnBack.setText("Back");
         btnBack.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnBackActionPerformed(evt);
             }
         });
 
         btnUpdateCourse.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
         btnUpdateCourse.setForeground(new java.awt.Color(102, 102, 102));
         btnUpdateCourse.setText("Update Course");
         btnUpdateCourse.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnUpdateCourseActionPerformed(evt);
             }
         });
 
         btnDeleteCourse.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
         btnDeleteCourse.setForeground(new java.awt.Color(102, 102, 102));
         btnDeleteCourse.setText("Delete Course");
         btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnDeleteCourseActionPerformed(evt);
             }
         });
 
         tblCourseDetails.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
         tblCourseDetails.setForeground(new java.awt.Color(204, 204, 204));
         tblCourseDetails.setModel(new javax.swing.table.DefaultTableModel(
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
         tblCourseDetails.setAutoscrolls(false);
         tblCourseDetails.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 tblCourseDetailsMouseClicked(evt);
             }
         });
         jScrollPane1.setViewportView(tblCourseDetails);
 
         btnAddCourse1.setFont(new java.awt.Font("Impact", 1, 14)); // NOI18N
         btnAddCourse1.setForeground(new java.awt.Color(102, 102, 102));
         btnAddCourse1.setText("Add Course");
         btnAddCourse1.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 btnAddCourse1ActionPerformed(evt);
             }
         });
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(layout.createSequentialGroup()
                         .addContainerGap()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
                             .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(lblCreditsHours, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(txtTitle)
                                         .addGap(17, 17, 17))
                                     .addGroup(layout.createSequentialGroup()
                                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(txtCreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                         .addGap(904, 904, 904))))
                             .addGroup(layout.createSequentialGroup()
                                 .addComponent(lblCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1178, javax.swing.GroupLayout.PREFERRED_SIZE))
                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                 .addGap(581, 581, 581)
                                 .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGap(48, 48, 48)
                                 .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGap(57, 57, 57)
                                 .addComponent(btnAddCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGap(39, 39, 39)
                                 .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addGap(176, 176, 176))
                             .addGroup(layout.createSequentialGroup()
                                 .addGap(1, 1, 1)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(lblPrerequisites, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                         .addComponent(txtPrerequisites, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addGap(903, 903, 903))
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(lblMEC, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                         .addComponent(txtMEC, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addGap(0, 0, Short.MAX_VALUE))
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(lblDeportment, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                         .addComponent(txtDeportment)))))))
                 .addContainerGap())
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lblCourseID))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtCreditHours, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lblCreditsHours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lblDeportment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtDeportment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtPrerequisites, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(lblPrerequisites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(lblMEC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtMEC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnUpdateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnDeleteCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnAddCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(27, 27, 27)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(0, 12, Short.MAX_VALUE))
         );
 
         pack();
     }// </editor-fold>//GEN-END:initComponents
 
     private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         dispose();
         new FacultyDashboard().setVisible(true);
     }//GEN-LAST:event_btnBackActionPerformed
 
     private void tblCourseDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseDetailsMouseClicked
         searchCourse();
     }//GEN-LAST:event_tblCourseDetailsMouseClicked
 
     private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
         deleteCourse();
     }//GEN-LAST:event_btnDeleteCourseActionPerformed
 
     private void btnUpdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCourseActionPerformed
        updateCourse();
     }//GEN-LAST:event_btnUpdateCourseActionPerformed
 
     private void btnAddCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourse1ActionPerformed
        addCourse();
     }//GEN-LAST:event_btnAddCourse1ActionPerformed
 
     
 
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btnAddCourse1;
     private javax.swing.JButton btnBack;
     private javax.swing.JButton btnDeleteCourse;
     private javax.swing.JButton btnUpdateCourse;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JLabel lblCourseID;
     private javax.swing.JLabel lblCreditsHours;
     private javax.swing.JLabel lblDeportment;
     private javax.swing.JLabel lblHeader;
     private javax.swing.JLabel lblMEC;
     private javax.swing.JLabel lblPrerequisites;
     private javax.swing.JLabel lblTitle;
     private javax.swing.JTable tblCourseDetails;
     private javax.swing.JTextField txtCourseID;
     private javax.swing.JTextField txtCreditHours;
     private javax.swing.JTextField txtDeportment;
     private javax.swing.JTextField txtMEC;
     private javax.swing.JTextField txtPrerequisites;
     private javax.swing.JTextField txtTitle;
     // End of variables declaration//GEN-END:variables
 
     
     // Add Course
     private void addCourse() {
             /*CourseDetailsDto course = new CourseDetailsDto(
                 txtCourseID.getText(),
                 txtTitle.getText(),
                 Double.parseDouble(txtCreditHours.getText()),
                 txtDeportment.getText(),
                 txtPrerequisites.getText(),
                 Integer.parseInt(txtMEC.getText())
             );
             
             try{
             String resp = courseDetailsController.addCourse(course);
             JOptionPane.showMessageDialog(this,resp);
             loadTable();
             clearForm();
             }catch(Exception e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(this, e.getMessage());
             }  */
              try {
         String courseId = txtCourseID.getText().trim();
         String title = txtTitle.getText().trim();
         String department = txtDeportment.getText().trim();
         String prerequisites = txtPrerequisites.getText().trim();
         
         if (courseId.isEmpty() || title.isEmpty() || department.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Course ID, Title, and Department cannot be empty!");
             return;
         }
 
         double creditHours;
         int maxEnrollmentCapacity;
         try {
             creditHours = Double.parseDouble(txtCreditHours.getText().trim());
             maxEnrollmentCapacity = Integer.parseInt(txtMEC.getText().trim());
         } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this, "Credit Hours and Maximum Enrollment Capacity must be numeric values!");
             return;
         }
 
         CourseDetailsDto course = new CourseDetailsDto(courseId, title, creditHours, department, prerequisites, maxEnrollmentCapacity);
         String resp = courseDetailsController.addCourse(course);
         
         JOptionPane.showMessageDialog(this, resp);
         loadTable();
         clearForm();
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
     }
 }
     
     private void clearForm(){
         txtCourseID.setText("");
         txtTitle.setText("");
         txtCreditHours.setText("");
         txtDeportment.setText("");
         txtPrerequisites.setText("");
         txtMEC.setText(""); 
     }
     
     //Load Table 
     public void loadTable(){
          try {
             String columns[] = {"CoursID", "Title", "CreditHours","Department", "Prerequisites", "MaxEnrollmentCapacity"};
             DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                 public boolean isCellEditable(int row, int column) {
                     return false;
                 }
             };
             tblCourseDetails.setModel(dtm);
             
             ArrayList<CourseDetailsDto> CourseDetailsDtos = courseDetailsController.getAllCourses();
             for (CourseDetailsDto course : CourseDetailsDtos) {
                 Object[] rowData = {course.getCourseID(),course.getTitle(),course.getCreditHours(),course.getDepartment(),course.getPrerequisites(),course.getMaxEnrollmentCapacity() };
                 dtm.addRow(rowData);
             }
             
         } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
     }
     private void searchCourse(){
          String CourseID = tblCourseDetails.getValueAt(tblCourseDetails.getSelectedRow(), 0).toString();
         try {
             CourseDetailsDto course = courseDetailsController.searchCourse(CourseID);
             if(course != null){
                 txtCourseID.setText(course.getCourseID());
                 txtTitle.setText(course.getTitle());
                 txtCreditHours.setText(Double.toString(course.getCreditHours()));
                 txtDeportment.setText(course.getDepartment());
                 txtPrerequisites.setText(course.getPrerequisites());
                 txtMEC.setText(Integer.toString(course.getMaxEnrollmentCapacity()));
                 
             } else {
                 JOptionPane.showMessageDialog(this, "Course not found");
             }
         } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
     }
     private void deleteCourse(){
       try {
             String resp = courseDetailsController.deleteCourse(txtCourseID.getText());
             JOptionPane.showMessageDialog(this, resp);
             loadTable();
             clearForm();
         } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
     
     }
     public void updateCourse(){
          CourseDetailsDto courseDto = new CourseDetailsDto(
                 txtCourseID.getText(),
                 txtTitle.getText(),
                 Double.parseDouble(txtCreditHours.getText()),
                 txtDeportment.getText(),
                 txtPrerequisites.getText(),
                 Integer.parseInt(txtMEC.getText())
         );
         
         try {
             String resp = courseDetailsController.updateCourse(courseDto);
             JOptionPane.showMessageDialog(this, resp);
             loadTable();
             clearForm();
         } catch (Exception e) {
             e.printStackTrace();
             JOptionPane.showMessageDialog(this, e.getMessage());
         }
     }
    
 }
 