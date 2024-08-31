package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import airlineManagement.admin_emp_details;
import com.mysql.cj.util.DnsSrv;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class admin_update_emp extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String gender = "";

    public admin_update_emp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private boolean validateForm() {

        String empname = txt_empName.getText();

        String email = txt_email.getText();
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailRegex = Pattern.compile(emailPattern);
        Matcher emailMatcher = emailRegex.matcher(email);

        String phoneNo = txt_phone.getText();
        String phone = "^\\d{10}$";
        Pattern phoneRegex = Pattern.compile(phone);
        Matcher phoneMatcher = phoneRegex.matcher(phoneNo);

        String gen = gender;
        Date d = txt_dob.getDate();

        if (empname.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter employee name");
            return false;
        }

        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter email address");
            return false;
        }
        if (!emailMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "please enter a  valid email");
            return false;
        }
        if (phoneNo.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter phone number");
            return false;
        }

        if (!phoneMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "phone number must be 10 digit");
            return false;
        }
        if (gen.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter gender");
            return false;
        }
        if (d == null) {
            JOptionPane.showMessageDialog(null, "Please enter date of birth");
            return false;
        }
        if (d.after(new Date())) {
            JOptionPane.showMessageDialog(null, "Date of Birth cannot be in the future");
            return false;
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        txt_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        txt_dob = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        txt_email = new javax.swing.JTextField();
        txt_empName = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update Employee");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Username :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 86, -1, 39));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Emp. Name :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 135, 114, 37));

        deleteBtn.setBackground(new java.awt.Color(255, 0, 51));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 165, 41));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_username.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_username.setEnabled(false);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 289, 39));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("Phone :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 181, 114, 39));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Gender :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 333, 114, 36));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("DOB :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 283, 114, 38));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Email :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 234, 114, 37));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 70, 32));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 80, 32));

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        other.setForeground(new java.awt.Color(255, 255, 255));
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel2.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 70, 32));

        txt_dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 289, 38));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 229, 10));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        txt_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_emailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_emailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_emailKeyTyped(evt);
            }
        });
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 289, 39));

        txt_empName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_empName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_empNameActionPerformed(evt);
            }
        });
        txt_empName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_empNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_empNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_empNameKeyTyped(evt);
            }
        });
        jPanel2.add(txt_empName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 289, 39));

        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        txt_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_phoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_phoneKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_phoneKeyTyped(evt);
            }
        });
        jPanel2.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 289, 39));

        updateBtn.setBackground(new java.awt.Color(0, 51, 255));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 165, 41));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 40, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/updateemp.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if (validateForm() == true) {
            try {
                Date d = txt_dob.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String fDate = sdf.format(d);
                String user = txt_username.getText();
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("update employee set empname=?, email=?, phone=?, gender=?, dob=? where username=?");
                pst.setString(1, txt_empName.getText());
                pst.setString(2, txt_email.getText());
                pst.setString(3, txt_phone.getText());
                pst.setString(4, gender);
                pst.setString(5, fDate);
                pst.setString(6, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update record successfully");
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void txt_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneKeyTyped

    private void txt_phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneKeyReleased

    private void txt_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_phoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneKeyPressed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_empNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empNameKeyTyped

    private void txt_empNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empNameKeyReleased

    private void txt_empNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empNameKeyPressed

    private void txt_empNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_empNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empNameActionPerformed

    private void txt_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailKeyTyped

    private void txt_emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailKeyReleased

    private void txt_emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_emailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailKeyPressed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        // TODO add your handling code here:
        gender = other.getText();
    }//GEN-LAST:event_otherActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender = female.getText();
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender = male.getText();
    }//GEN-LAST:event_maleActionPerformed

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameKeyTyped

    private void txt_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameKeyReleased

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameKeyPressed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int del = JOptionPane.showConfirmDialog(
            null,
            "Do you want to delete",
            "Employee Record",
            JOptionPane.YES_NO_OPTION
        );

        if (del == JOptionPane.YES_OPTION) {
            try {
                String user = txt_username.getText();
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("delete from employee where username=?");
                pst.setString(1, user);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record deleted successfully");
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_update_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_update_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteBtn;
    public javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JRadioButton male;
    public javax.swing.JRadioButton other;
    public com.toedter.calendar.JDateChooser txt_dob;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_empName;
    public javax.swing.JTextField txt_phone;
    public javax.swing.JTextField txt_username;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
