package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class emp_cancel_flight extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public emp_cancel_flight() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private boolean cancelTicketValidateForm() {
        // flight validation below
        

        String ticketId = txt_ticketId.getText();
        if (ticketId.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter ticket id");
            return false;
        }
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cancelTicket = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        txt_ticketId = new javax.swing.JTextField();
        txt_destination = new javax.swing.JTextField();
        txt_class = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_flight_code = new javax.swing.JTextField();
        txt_flight_name = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_source = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_reason = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.blue);
        jLabel2.setText("Ticket ID :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 100, 40));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.blue);
        jLabel3.setText("Source :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 80, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.blue);
        jLabel4.setText("Destination :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.blue);
        jLabel5.setText("Name :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, 30));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.blue);
        jLabel6.setText("Class Type:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 120, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.blue);
        jLabel7.setText("Ticket Price:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.blue);
        jLabel8.setText("Flight Code:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(java.awt.Color.blue);
        jLabel9.setText("Flight Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(java.awt.Color.blue);
        jLabel10.setText("Journey Date:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setForeground(java.awt.Color.blue);
        jLabel12.setText("Username:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 114, 100, 30));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel13.setForeground(java.awt.Color.blue);
        jLabel13.setText("Reason :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 100, 30));

        cancelTicket.setBackground(java.awt.Color.red);
        cancelTicket.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cancelTicket.setForeground(new java.awt.Color(255, 255, 255));
        cancelTicket.setText("Cancel Ticket");
        cancelTicket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTicketActionPerformed(evt);
            }
        });
        jPanel2.add(cancelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, 40));

        backBtn.setBackground(new java.awt.Color(204, 204, 204));
        backBtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 90, 40));

        txt_ticketId.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_ticketId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ticketIdActionPerformed(evt);
            }
        });
        txt_ticketId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ticketIdKeyTyped(evt);
            }
        });
        jPanel2.add(txt_ticketId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, 40));

        txt_destination.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_destination.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_destination.setEnabled(false);
        txt_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_destinationActionPerformed(evt);
            }
        });
        jPanel2.add(txt_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 230, 40));

        txt_class.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_class.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_class.setEnabled(false);
        txt_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_classActionPerformed(evt);
            }
        });
        jPanel2.add(txt_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 240, 40));

        txt_price.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_price.setEnabled(false);
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel2.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 230, 40));

        txt_flight_code.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_flight_code.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_flight_code.setEnabled(false);
        txt_flight_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flight_codeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_flight_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 240, 40));

        txt_flight_name.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_flight_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_flight_name.setEnabled(false);
        txt_flight_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flight_nameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_flight_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 240, 40));

        txt_username.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_username.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_username.setEnabled(false);
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 40));

        txt_name.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_name.setEnabled(false);
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 165, 240, 40));

        txt_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_date.setEnabled(false);
        jPanel2.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 230, 40));

        txt_source.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txt_source.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_source.setEnabled(false);
        txt_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sourceActionPerformed(evt);
            }
        });
        jPanel2.add(txt_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 230, 40));

        txt_reason.setColumns(20);
        txt_reason.setRows(5);
        jScrollPane1.setViewportView(txt_reason);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 230, 90));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1080, 490));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Cancel Ticket");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ticketIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ticketIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ticketIdActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void cancelTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTicketActionPerformed
        // TODO add your handling code here:
        if (cancelTicketValidateForm() == true) {
            try {
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("update bookFlight set status=? where ticket_id=?");
                pst.setString(1, "Cancelled");
                pst.setString(2, txt_ticketId.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cancelled ticket successfully");
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_cancelTicketActionPerformed

    private void txt_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_destinationActionPerformed

    private void txt_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_classActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_flight_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flight_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flight_codeActionPerformed

    private void txt_flight_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flight_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flight_nameActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sourceActionPerformed

    private void txt_ticketIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ticketIdKeyTyped
        // TODO add your handling code here:
        try {
            String ticketId = txt_ticketId.getText();
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from bookFlight where ticket_id=? and status=?");
            pst.setString(1, ticketId);
            pst.setString(2, "Booked");
            rs = pst.executeQuery();

            while (rs.next()) {
                txt_source.setText(rs.getString("source"));
                txt_destination.setText(rs.getString("destination"));
                txt_price.setText(rs.getString("price"));
                txt_name.setText(rs.getString("name"));
                txt_class.setText(rs.getString("class"));

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                d = sdf.parse(rs.getString("journey_date"));
                txt_date.setDate(d);
                txt_flight_code.setText(rs.getString("flight_code"));
                txt_flight_name.setText(rs.getString("flight_name"));
                txt_username.setText(rs.getString("user_id"));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_ticketIdKeyTyped

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
            java.util.logging.Logger.getLogger(emp_cancel_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_cancel_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_cancel_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_cancel_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_cancel_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_class;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_destination;
    private javax.swing.JTextField txt_flight_code;
    private javax.swing.JTextField txt_flight_name;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextArea txt_reason;
    private javax.swing.JTextField txt_source;
    private javax.swing.JTextField txt_ticketId;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
