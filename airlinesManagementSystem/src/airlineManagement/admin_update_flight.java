package airlineManagement;
import java.sql.*;
import javax.swing.*;
public class admin_update_flight extends javax.swing.JFrame {
    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public admin_update_flight() {
        initComponents();
        getFlight();
    }
    @SuppressWarnings("unchecked")
    public void getFlight() {
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flights");
            rs = pst.executeQuery();
            while (rs.next()) {
                txt_flight_code.addItem(rs.getString("flight_code"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private boolean validateFlightDetails() {
        // flight details validation below
        String flight_code = String.valueOf(txt_flight_code.getSelectedIndex());
        if (flight_code.equals("0")) {
            JOptionPane.showMessageDialog(null, "Please select flight code");
            return false;
        }
        String source = String.valueOf(txt_source.getSelectedIndex());
        if (source.equals("0")) {
            JOptionPane.showMessageDialog(null, "Please select source");
            return false;
        }
        String destination = String.valueOf(txt_destination.getSelectedIndex());
        if (destination.equals("0")) {
            JOptionPane.showMessageDialog(null, "Please select destination");
            return false;
        }
        String class_name = String.valueOf(txt_className.getSelectedIndex());
        if (class_name.equals("0")) {
            JOptionPane.showMessageDialog(null, "Please select class");
            return false;
        }
        String price = txt_price.getText();
        if (price.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter price");
            return false;
        }
        String depart = txt_depart_time.getText();
        if (depart.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter depart time");
            return false;
        }
        String arrival = txt_arrival_time.getText();
        if (arrival.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter arrival time");
            return false;
        }
        return true;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        txt_price = new javax.swing.JTextField();
        txt_className = new javax.swing.JComboBox<>();
        txt_flight_code = new javax.swing.JComboBox<>();
        txt_source = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_destination = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_flight_name = new javax.swing.JTextField();
        txt_depart_time = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_arrival_time = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 566, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 566));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Airlines Flight");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 350, 46));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Flight Code");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 121, 28));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("Source");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 30));

        saveBtn.setBackground(new java.awt.Color(0, 0, 255));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save ");
        saveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 220, 39));
        jPanel4.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 240, 30));

        txt_className.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select class", "Normal", "Economy", "First Class", "Business" }));
        jPanel4.add(txt_className, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 240, 30));

        txt_flight_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select flight code" }));
        txt_flight_code.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_flight_codeItemStateChanged(evt);
            }
        });
        txt_flight_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flight_codeActionPerformed(evt);
            }
        });
        jPanel4.add(txt_flight_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 240, 30));

        txt_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select source", "Patna", "Pune", "Mumbai", "Delhi", "Banglore", "Lucknow", "Siliguri", "Hyderabad", "Dehradun" }));
        jPanel4.add(txt_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 240, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setText("Price");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 120, 30));

        txt_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select destination", "Patna", "Pune", "Mumbai", "Delhi", "Banglore", "Lucknow", "Siliguri", "Hyderabad", "Dehradun" }));
        txt_destination.setKeySelectionManager(null);
        jPanel4.add(txt_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 240, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Destination");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("Class Name");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Flight Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 121, 28));

        txt_flight_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_flight_name.setEnabled(false);
        txt_flight_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_flight_nameFocusGained(evt);
            }
        });
        txt_flight_name.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_flight_nameInputMethodTextChanged(evt);
            }
        });
        jPanel4.add(txt_flight_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 240, 30));
        jPanel4.add(txt_depart_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 240, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 255));
        jLabel12.setText("Depart Time");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Arrival Time");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 120, 30));

        txt_arrival_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arrival_timeActionPerformed(evt);
            }
        });
        jPanel4.add(txt_arrival_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 240, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Flight Details");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 150, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/flightDetails.jpg"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 500, 530));

        jButton1.setBackground(new java.awt.Color(213, 1, 1));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        if (validateFlightDetails() == true) {
            try {
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("update flightDetails set source=?, destination=?,"
                        + " class_name=?, price=?, depart_time=?, arrival_time=? where flight_code=?");
                pst.setString(1, txt_source.getSelectedItem().toString());
                pst.setString(2, txt_destination.getSelectedItem().toString());
                pst.setString(3, txt_className.getSelectedItem().toString());
                pst.setString(4, txt_price.getText());
                pst.setString(5, txt_depart_time.getText());
                pst.setString(6, txt_arrival_time.getText());
                pst.setString(7, txt_flight_code.getSelectedItem().toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Flight details updated successfully");
                getFlight();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void txt_flight_codeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_flight_codeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flight_codeItemStateChanged

    private void txt_flight_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flight_codeActionPerformed
        
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flights where flight_code=?");
            pst.setString(1, txt_flight_code.getSelectedItem().toString());
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_flight_name.setText(rs.getString("flight_name"));
//                txt_price.setText(rs.getString("price"));
//                txt_depart_time.setText(rs.getString("depart_time"));
//                txt_arrival_time.setText(rs.getString("arrival_time"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_flight_codeActionPerformed

    private void txt_flight_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_flight_nameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flight_nameFocusGained

    private void txt_flight_nameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_flight_nameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flight_nameInputMethodTextChanged

    private void txt_arrival_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arrival_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arrival_timeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_update_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txt_arrival_time;
    private javax.swing.JComboBox<String> txt_className;
    private javax.swing.JTextField txt_depart_time;
    private javax.swing.JComboBox<String> txt_destination;
    private javax.swing.JComboBox<String> txt_flight_code;
    private javax.swing.JTextField txt_flight_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JComboBox<String> txt_source;
    // End of variables declaration//GEN-END:variables
}
