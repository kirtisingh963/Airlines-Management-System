package airlineManagement;
import java.sql.*;
import javax.swing.*;
public class emp_dashboard extends javax.swing.JFrame {
    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public emp_dashboard() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_profile = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        add_passenger = new javax.swing.JLabel();
        book_flight = new javax.swing.JLabel();
        booked_ticket_details = new javax.swing.JLabel();
        cancel_ticekt = new javax.swing.JLabel();
        view_cancel_ticket = new javax.swing.JLabel();
        passenger_details = new javax.swing.JLabel();
        check_flight = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        txt_profile.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        txt_profile.setForeground(new java.awt.Color(255, 255, 255));
        txt_profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_profile.setText("Profile");
        txt_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_profileMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Snap ITC", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Airlines Management System");

        txt_user.setForeground(new java.awt.Color(0, 0, 255));
        txt_user.setText("emp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 708, Short.MAX_VALUE)
                .addComponent(txt_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_profile, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txt_user))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 60));

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        add_passenger.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        add_passenger.setForeground(new java.awt.Color(255, 255, 255));
        add_passenger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_passenger.setText("Add Passenger");
        add_passenger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_passenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_passengerMouseClicked(evt);
            }
        });

        book_flight.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        book_flight.setForeground(new java.awt.Color(255, 255, 255));
        book_flight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_flight.setText("Book Ticket");
        book_flight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book_flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_flightMouseClicked(evt);
            }
        });

        booked_ticket_details.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        booked_ticket_details.setForeground(new java.awt.Color(255, 255, 255));
        booked_ticket_details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        booked_ticket_details.setText("Booked Ticket Details");
        booked_ticket_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        booked_ticket_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booked_ticket_detailsMouseClicked(evt);
            }
        });

        cancel_ticekt.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        cancel_ticekt.setForeground(new java.awt.Color(255, 255, 255));
        cancel_ticekt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel_ticekt.setText("Cancel Ticket");
        cancel_ticekt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel_ticekt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_ticektMouseClicked(evt);
            }
        });

        view_cancel_ticket.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        view_cancel_ticket.setForeground(new java.awt.Color(255, 255, 255));
        view_cancel_ticket.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_cancel_ticket.setText("View Cancelled Ticket");
        view_cancel_ticket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_cancel_ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_cancel_ticketMouseClicked(evt);
            }
        });

        passenger_details.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        passenger_details.setForeground(new java.awt.Color(255, 255, 255));
        passenger_details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passenger_details.setText("Passenger Details");
        passenger_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passenger_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passenger_detailsMouseClicked(evt);
            }
        });

        check_flight.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        check_flight.setForeground(new java.awt.Color(255, 255, 255));
        check_flight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        check_flight.setText("Check Flight");
        check_flight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_flightMouseClicked(evt);
            }
        });

        about.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setText("About");
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(add_passenger, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(passenger_details, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(book_flight, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(booked_ticket_details, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cancel_ticekt, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(view_cancel_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check_flight, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(cancel_ticekt)
                    .addComponent(view_cancel_ticket)
                    .addComponent(check_flight)
                    .addComponent(about)
                    .addComponent(booked_ticket_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(book_flight)
                    .addComponent(passenger_details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_passenger))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ams.jpg"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 730));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1590, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_passengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_passengerMouseClicked
        // TODO add your handling code here:
        try {
            new emp_add_passanger().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_add_passengerMouseClicked

    private void passenger_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passenger_detailsMouseClicked
        // TODO add your handling code here:
        try {
            new emp_view_passanger().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_passenger_detailsMouseClicked

    private void book_flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_flightMouseClicked
        // TODO add your handling code here:
        try {
            new emp_book_flight().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_book_flightMouseClicked

    private void booked_ticket_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booked_ticket_detailsMouseClicked
        // TODO add your handling code here:
        try {
            new emp_view_booked_flight().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_booked_ticket_detailsMouseClicked

    private void cancel_ticektMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_ticektMouseClicked
        // TODO add your handling code here:
        try {
            new emp_cancel_flight().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cancel_ticektMouseClicked

    private void view_cancel_ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_cancel_ticketMouseClicked
        // TODO add your handling code here:
        try {
            new emp_view_cancelled_flight().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_view_cancel_ticketMouseClicked

    private void check_flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_flightMouseClicked
        // TODO add your handling code here:
        try {
            new emp_check_flight().setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_check_flightMouseClicked

    private void txt_profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_profileMouseClicked
        // TODO add your handling code here:
        try {
            emp_profile profile = new emp_profile();
            profile.showProfile(txt_user.getText());
            profile.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_profileMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel add_passenger;
    private javax.swing.JLabel book_flight;
    private javax.swing.JLabel booked_ticket_details;
    private javax.swing.JLabel cancel_ticekt;
    private javax.swing.JLabel check_flight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel passenger_details;
    private javax.swing.JLabel txt_profile;
    public javax.swing.JLabel txt_user;
    private javax.swing.JLabel view_cancel_ticket;
    // End of variables declaration//GEN-END:variables
}
