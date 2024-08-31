package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emp_add_passanger extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    String gender="";


   
    public emp_add_passanger() {
        initComponents();
        generateRandom();
    }
    public void generateRandom(){
        Random r = new Random();
        txt_userId.setText("user"+r.nextInt(1000000));
    }
    
    public boolean validateEmp() {
        
        String name = txt_name.getText();
          if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter passanger name");
            return false;
        }
        Date d = txt_dob.getDate();
         if (d == null) {
            JOptionPane.showMessageDialog(null, "Please enter date of birth");
            return false;
        }
        
        String address = txt_address.getText();
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter address");
            return false;
        }

        String phone = txt_phone.getText();
        String phoneNo = "^\\d{10}$";
        Pattern phoneRegex = Pattern.compile(phoneNo);
        Matcher phoneMatcher = phoneRegex.matcher(phone);
        if (!phoneMatcher.matches()) {
            JOptionPane.showMessageDialog(null, "phone number must be 10 digit");
            return false;
        }
        if (phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter phone");
            return false;
        }
        
        String nationality = String.valueOf(txt_nationality.getSelectedItem());
        if (nationality.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter nationality");
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
            JOptionPane.showMessageDialog(null, "Please enter email id");
            return false;
        }
         String passport_no = txt_passport.getText();
        if (passport_no.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter passport no");
            return false;
        }
        String genderr = gender;
        if (genderr.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter gender");
            return false;
        }
        return true;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_passport = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        other = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dob = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_nationality = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        txt_userId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Airlines India");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 350, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Gender");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        jPanel3.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 210, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Passport No");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 120, 30));

        txt_passport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passportActionPerformed(evt);
            }
        });
        jPanel3.add(txt_passport, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Phone");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, 30));

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });
        jPanel3.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 210, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Email Id");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));

        buttonGroup1.add(other);
        other.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });
        jPanel3.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 70, 30));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 60, 30));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("UserId");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 120, 30));
        jPanel3.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 210, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("DOB");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 120, 30));

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 210, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Address");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 120, 30));

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        jPanel3.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 210, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Nationality");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 120, 30));

        txt_nationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indian", "Bangladeshi", "Brazilian", "Australian", "Canadian", "Cambodian", "Italian", "Israeli", "Russian", " " }));
        txt_nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nationalityActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 210, 40));

        saveBtn.setBackground(new java.awt.Color(0, 51, 255));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 160, 40));

        closeBtn.setBackground(new java.awt.Color(255, 0, 51));
        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel3.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 140, 40));

        txt_userId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_userId.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.add(txt_userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 116, 210, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aeroo.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_passportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passportActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        gender = other.getText();
    }//GEN-LAST:event_otherActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if (validateEmp() == true) {
            try {
                Date d = txt_dob.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fDate = sdf.format(d);
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("insert into passenger(userid,name,dob,phone,email,address,nationality,gender,passport_no)values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1, txt_userId.getText());
                pst.setString(2, txt_name.getText());
                pst.setString(3, fDate);
                pst.setString(4, txt_phone.getText());
                pst.setString(5, txt_email.getText());

                pst.setString(6, txt_address.getText());
                pst.setString(7, String.valueOf(txt_nationality.getSelectedItem()));
                pst.setString(8, gender);
                pst.setString(9, txt_passport.getText());               
                 pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Passenger added successfully...");
                this.dispose();
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error :"+ e.getMessage());
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
         try {
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        gender = male.getText();
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        gender = female.getText();
    }//GEN-LAST:event_femaleActionPerformed

    private void txt_nationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nationalityActionPerformed

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
            java.util.logging.Logger.getLogger(emp_add_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_add_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_add_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_add_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_add_passanger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton closeBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton other;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txt_address;
    private com.toedter.calendar.JDateChooser txt_dob;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JComboBox<String> txt_nationality;
    private javax.swing.JTextField txt_passport;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JLabel txt_userId;
    // End of variables declaration//GEN-END:variables
}
