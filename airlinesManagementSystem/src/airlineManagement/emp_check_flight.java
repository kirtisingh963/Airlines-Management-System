package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class emp_check_flight extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int i, q;

    public emp_check_flight() {
        initComponents();
//        showData();
        showSource();
    }

    public void showSource() {
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select distinct source from flightDetails");
            rs = pst.executeQuery();
            while (rs.next()) {
                txt_source.addItem(rs.getString("source"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_flight = new rojeru_san.complementos.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_source = new javax.swing.JComboBox<>();
        txt_destination = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("From");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 69, 71, -1));

        showBtn.setBackground(new java.awt.Color(255, 0, 0));
        showBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        showBtn.setForeground(new java.awt.Color(255, 255, 255));
        showBtn.setText("Show Details");
        showBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        showBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });
        jPanel2.add(showBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 64, 156, 38));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 115, -1, 575));

        tbl_flight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Code", "Flight Name", "Capacity", "Source", "Destination", "Depart Time", "Arrival Time"
            }
        ));
        tbl_flight.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tbl_flight.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_flight.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_flight);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 1256, 575));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airlines Flight Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 6, 399, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("To");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 69, 35, -1));

        txt_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select source" }));
        txt_source.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_sourceItemStateChanged(evt);
            }
        });
        jPanel2.add(txt_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 65, 198, 38));

        txt_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select destination" }));
        jPanel2.add(txt_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 65, 198, 38));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 37, 33));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:
        try {
            String s = txt_source.getSelectedItem().toString() + "%";
            String d = txt_destination.getSelectedItem().toString() + "%";
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flights join flightDetails"
                    + " on flights.flight_code=flightDetails.flight_code where source like ? and destination like ?");
            pst.setString(1, s);
            pst.setString(2, d);
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) tbl_flight.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                for (i = 1; i < q; i++) {
                    v.add(rs.getString("flight_code"));
                    v.add(rs.getString("flight_name"));
                    v.add(rs.getString("capacity"));
                    v.add(rs.getString("source"));
                    v.add(rs.getString("destination"));
                    v.add(rs.getString("depart_time"));
                    v.add(rs.getString("arrival_time"));
                }
                model.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_showBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        try {
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txt_sourceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_sourceItemStateChanged
        // TODO add your handling code here:
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flightDetails where source=?");
            pst.setString(1, txt_source.getSelectedItem().toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                String destination = rs.getString("destination");
                boolean exists = false;
                for (i = 0; i < txt_destination.getItemCount(); i++) {
                    if (txt_destination.getItemAt(i).equals(destination)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    txt_destination.addItem(destination);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_txt_sourceItemStateChanged

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
            java.util.logging.Logger.getLogger(emp_check_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_check_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_check_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_check_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_check_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showBtn;
    private rojeru_san.complementos.RSTableMetro tbl_flight;
    private javax.swing.JComboBox<String> txt_destination;
    private javax.swing.JComboBox<String> txt_source;
    // End of variables declaration//GEN-END:variables
}
