package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class emp_view_passanger extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    String gender="";
    int i, q,id = 0;

  
    public emp_view_passanger() {
        initComponents();
        showData();
    }
    public void showData(){
        try {
            conn = DriverManager.getConnection(host,username,password);
            pst = conn.prepareStatement("select * from passenger");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) txt_passengerDetailsTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector V = new Vector();   
                for(i=1; i<=q; i++) {
                    V.add(rs.getString("userid"));
                    V.add(rs.getString("name"));
                    V.add(rs.getString("dob"));
                    V.add(rs.getString("phone"));
                    V.add(rs.getString("email"));
                    V.add(rs.getString("address"));
                    V.add(rs.getString("nationality"));
                    V.add(rs.getString("gender"));
                    V.add(rs.getString("passport_no"));
                }
                    model.addRow(V);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error occured" + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_passengerDetailsTable = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        refreshbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_passengerDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User id", "Name", "DOB", "Phone", "Email Id", "Address", "Nationality", "Gender", "Passport"
            }
        ));
        txt_passengerDetailsTable.setColorBordeFilas(new java.awt.Color(102, 102, 102));
        txt_passengerDetailsTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        txt_passengerDetailsTable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        txt_passengerDetailsTable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        txt_passengerDetailsTable.setFuenteFilas(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_passengerDetailsTable.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_passengerDetailsTable.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_passengerDetailsTable.setRowHeight(26);
        jScrollPane1.setViewportView(txt_passengerDetailsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1090, 560));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Passenger Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 264, 37));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Search by passport");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 36, 140, 20));

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 200, 30));

        refreshbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshbtn.setText("Refresh");
        refreshbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        jPanel2.add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 8, 1090, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        try {
            String s = txt_search.getText();
            conn = DriverManager.getConnection(host,username,password);
            pst = conn.prepareStatement("select * from passenger where passport_no = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) txt_passengerDetailsTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector V = new Vector();   
                for(i=1; i<=q; i++) {
                    V.add(rs.getString("userid"));
                    V.add(rs.getString("name"));
                    V.add(rs.getString("dob"));
                    V.add(rs.getString("phone"));
                    V.add(rs.getString("email"));
                    V.add(rs.getString("address"));
                    V.add(rs.getString("nationality"));
                    V.add(rs.getString("gender"));
                    V.add(rs.getString("passport_no"));
                }
                    model.addRow(V);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error occured" + e.getMessage());
        }
    }//GEN-LAST:event_txt_searchKeyTyped

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
       showData();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(emp_view_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_view_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_view_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_view_passanger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_view_passanger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshbtn;
    private rojeru_san.complementos.RSTableMetro txt_passengerDetailsTable;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
