package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

public class admin_add_emp extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String gender = "";

    public admin_add_emp() {
        initComponents();
    }

    private boolean validateForm() {

        String user = txt_username.getText();
        if (user.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username");
            return false;
        }
        String empname = txt_empName.getText();
        if (empname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter employee name");
            return false;
        }
        String email = txt_email.getText();
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailRegex = Pattern.compile(emailPattern);
        Matcher emailMatcher = emailRegex.matcher(email);
        if (!emailMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "please enter a  valid email");
            return false;
        }
        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter email address");
            return false;
        }

        String phoneNo = txt_phone.getText();
        String phone = "^\\d{10}$";
        Pattern phoneRegex = Pattern.compile(phone);
        Matcher phoneMatcher = phoneRegex.matcher(phoneNo);
        if (phoneNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter phone number");
            return false;
        }

        if (!phoneMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "phone number must be 10 digit");
            return false;
        }

        String gen = gender;
        if (gen.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter gender");
            return false;
        }
        Date d = txt_dob.getDate();
        if (d == null) {
            JOptionPane.showMessageDialog(null, "Please enter date of birth");
            return false;
        }
        if (d.after(new Date())) {
            JOptionPane.showMessageDialog(null, "Date of Birth cannot be in the future");
            return false;
        }

        String pass = txt_password.getText();
//        String password = "^[\\w-]{8,20}$";
//        Pattern passRegex = Pattern.compile(password);
//        Matcher passMatcher = phoneRegex.matcher(pass);
        if (pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter password");
            return false;
        }
//        if (!passMatcher.matches()) {
//            JOptionPane.showMessageDialog(null, "Password should be 8 to 20 digits");
//            return false;
//        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        txt_empName = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        txt_dob = new com.toedter.calendar.JDateChooser();
        txt_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Employee");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 250, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Username :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 119, 37));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Emp. Name :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 122, 38));

        cancelBtn.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel2.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 138, -1));

        addBtn.setBackground(new java.awt.Color(0, 0, 204));
        addBtn.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Save");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 173, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 250, 37));

        txt_empName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empNameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_empName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 250, 40));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 259, 39));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Phone No.:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 120, 38));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Gender :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 98, 36));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Password :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 117, 35));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("DOB :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 98, 36));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setText("Email ID :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 108, 39));

        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 259, 38));

        genderButtonGroup.add(male);
        male.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 70, 30));

        genderButtonGroup.add(female);
        female.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 77, 30));

        genderButtonGroup.add(other);
        other.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel2.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 30));
        jPanel2.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 259, 38));

        txt_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 260, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/empBg.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 630));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 1030, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aeroplanerealimage.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (validateForm() == true) {
            try {
                Date d = txt_dob.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String dateofbirth = sdf.format(d);
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("insert into employee(username, empname, email, phone, gender, dob, password) values (?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_empName.getText());
                pst.setString(3, txt_email.getText());
                pst.setString(4, txt_phone.getText());
                pst.setString(5, gender);
                pst.setString(6, dateofbirth);
                pst.setString(7, txt_password.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Employee added successfully.");
                dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void txt_empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empNameActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender = female.getText();
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender = male.getText();
    }//GEN-LAST:event_maleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
        gender = other.getText();
    }//GEN-LAST:event_otherActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_add_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private com.toedter.calendar.JDateChooser txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_empName;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
