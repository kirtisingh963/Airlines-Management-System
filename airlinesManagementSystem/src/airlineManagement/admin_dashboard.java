package airlineManagement;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class admin_dashboard extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public admin_dashboard() {
        initComponents();
        getAdmin();
    }

    
    @SuppressWarnings("unchecked")
    public void getAdmin(){
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from adminlogin");
            rs = pst.executeQuery();

            if(rs.next()){
                admin_name.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admin_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_addFlight = new javax.swing.JLabel();
        btn_addEmp = new javax.swing.JLabel();
        btn_flightDetail = new javax.swing.JLabel();
        btn_updateEmp = new javax.swing.JLabel();
        btn_updateFlight = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_empDetails = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1560, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AIRLINES MANAGEMENT SYSTEM");

        admin_name.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        admin_name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-menu-50.png"))); // NOI18N
        jLabel14.setMinimumSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admin_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Features");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 141, 47));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-home-50.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 50, 49));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AMS DASHBOARD");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 47));

        btn_addFlight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addFlight.setForeground(new java.awt.Color(255, 255, 255));
        btn_addFlight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_addFlight.setText("Add Flight");
        btn_addFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addFlightMouseClicked(evt);
            }
        });
        jPanel3.add(btn_addFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, 40));

        btn_addEmp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_addEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_addEmp.setText("Add Employee");
        btn_addEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_addEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addEmpMouseClicked(evt);
            }
        });
        jPanel3.add(btn_addEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 185, 40));

        btn_flightDetail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_flightDetail.setForeground(new java.awt.Color(255, 255, 255));
        btn_flightDetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_flightDetail.setText("Flight Details");
        btn_flightDetail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_flightDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_flightDetailMouseClicked(evt);
            }
        });
        jPanel3.add(btn_flightDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 185, 40));

        btn_updateEmp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_updateEmp.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_updateEmp.setText("Passenger Details");
        btn_updateEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateEmpMouseClicked(evt);
            }
        });
        jPanel3.add(btn_updateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 170, 40));

        btn_updateFlight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_updateFlight.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateFlight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_updateFlight.setText("Update Flight");
        btn_updateFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_updateFlight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateFlightMouseClicked(evt);
            }
        });
        jPanel3.add(btn_updateFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 185, 47));

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setBackground(new java.awt.Color(255, 0, 0));
        btn_logout.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        jPanel4.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-48.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 40, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 340, 60));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-48 (1).png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, 40));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-flight-insurance-50.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 50, 40));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-employee-50.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 40));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-details-48.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 50, 40));

        btn_empDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_empDetails.setForeground(new java.awt.Color(255, 255, 255));
        btn_empDetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_empDetails.setText("Employee Details");
        btn_empDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_empDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_empDetailsMouseClicked(evt);
            }
        });
        jPanel3.add(btn_empDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 185, 47));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 50, 40));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Account_50px.png"))); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 50, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, -1, 720));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adminPanel.jpg"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 720));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 75, 1214, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addEmpMouseClicked
        // TODO add your handling code here:
        try {
            new admin_add_emp().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_addEmpMouseClicked

    private void btn_empDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empDetailsMouseClicked
        // TODO add your handling code here:
        try {
            new admin_emp_details().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_empDetailsMouseClicked

    private void btn_addFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addFlightMouseClicked
        // TODO add your handling code here:
        new admin_add_flight().setVisible(true);
    }//GEN-LAST:event_btn_addFlightMouseClicked

    private void btn_flightDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_flightDetailMouseClicked
        // TODO add your handling code here:
        new admin_flight_details().setVisible(true);
    }//GEN-LAST:event_btn_flightDetailMouseClicked

    private void btn_updateEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateEmpMouseClicked
        // TODO add your handling code here:
        new emp_view_passanger().setVisible(true);
    }//GEN-LAST:event_btn_updateEmpMouseClicked

    private void btn_updateFlightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateFlightMouseClicked
        // TODO add your handling code here:
        new admin_update_flight().setVisible(true);
    }//GEN-LAST:event_btn_updateFlightMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        
        try {
            int logout = JOptionPane.showConfirmDialog(null, "Are you sure want to logout", "Admin Panel", JOptionPane.YES_NO_OPTION);
            
            if (logout == JOptionPane.YES_OPTION) {
            new welcome().setVisible(true);
            this.dispose();
        }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_logoutMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel admin_name;
    private javax.swing.JLabel btn_addEmp;
    private javax.swing.JLabel btn_addFlight;
    private javax.swing.JLabel btn_empDetails;
    private javax.swing.JLabel btn_flightDetail;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel btn_updateEmp;
    private javax.swing.JLabel btn_updateFlight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
