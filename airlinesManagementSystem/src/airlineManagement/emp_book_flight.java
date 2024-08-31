package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class emp_book_flight extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int i, q;

    public emp_book_flight() {
        initComponents();
        flightCode();
        genrateRandom();
    }
    
    public void genrateRandom(){
        Random r = new Random();
        txt_ticketId.setText("FT" + r.nextInt(1000000));
    }

    @SuppressWarnings("unchecked")
    public void flightCode() {
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flights");
            rs = pst.executeQuery();
            while (rs.next()) {
                txt_flightCode.addItem(rs.getString("flight_code"));
            }
        } catch (Exception e) {

        }
    }

    private boolean bookTicketValidateForm() {
        // flight validation below
        String user = txt_username.getText();
        if (user.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter username");
            return false;
        }
        String flight_code = String.valueOf(txt_flightCode.getSelectedIndex());
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
        String class_name = String.valueOf(txt_class.getSelectedIndex());
        if (class_name.equals("0")) {
            JOptionPane.showMessageDialog(null, "Please select class");
            return false;
        }
        Date date = txt_date.getDate();
        if (date == null) {
            JOptionPane.showMessageDialog(null, "Please enter date");
            return false;
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txt_flightCode = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txt_flightName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_destination = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txt_source = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txt_class = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_depart_time = new javax.swing.JTextField();
        txt_arrival_time = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_bookFlight = new javax.swing.JButton();
        btn_cancleFlight = new javax.swing.JButton();
        txt_ticketId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Book Flight Ticket");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 6, 248, 42));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, 33));

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usernameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 215, 36));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Passenger Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 170, 33));

        txt_name.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_name.setEnabled(false);
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 280, 36));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1180, 70));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Flight Code");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 130, 35));

        txt_flightCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        txt_flightCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_flightCodeItemStateChanged(evt);
            }
        });
        txt_flightCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flightCodeActionPerformed(evt);
            }
        });
        jPanel3.add(txt_flightCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 240, 35));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 255));
        jLabel18.setText("Flight Name");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 120, 35));

        txt_flightName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_flightName.setEnabled(false);
        txt_flightName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_flightNameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_flightName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 270, 36));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Destination");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, 33));

        txt_destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select destination" }));
        txt_destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_destinationActionPerformed(evt);
            }
        });
        jPanel3.add(txt_destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 240, 35));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Source");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 33));

        txt_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select source" }));
        txt_source.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_sourceItemStateChanged(evt);
            }
        });
        txt_source.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sourceActionPerformed(evt);
            }
        });
        jPanel3.add(txt_source, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Class Type");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 100, 33));

        txt_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select class", "Normal", "Economy", "Fisrt Class", "Business" }));
        txt_class.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txt_classItemStateChanged(evt);
            }
        });
        txt_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_classActionPerformed(evt);
            }
        });
        jPanel3.add(txt_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 240, 35));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Ticket Price");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 120, 35));

        txt_price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_price.setEnabled(false);
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        jPanel3.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 240, 36));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Journey Date");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 160, 35));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("Departure Time");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 35));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Arrival Time");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 150, 35));
        jPanel3.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 270, 35));

        txt_depart_time.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_depart_time.setEnabled(false);
        txt_depart_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_depart_timeActionPerformed(evt);
            }
        });
        jPanel3.add(txt_depart_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 270, 36));

        txt_arrival_time.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_arrival_time.setEnabled(false);
        txt_arrival_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_arrival_timeActionPerformed(evt);
            }
        });
        jPanel3.add(txt_arrival_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 270, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Ticket Id");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 100, 37));

        btn_bookFlight.setBackground(new java.awt.Color(0, 51, 255));
        btn_bookFlight.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_bookFlight.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookFlight.setText("Book Ticket");
        btn_bookFlight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_bookFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookFlightActionPerformed(evt);
            }
        });
        jPanel3.add(btn_bookFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 260, 40));

        btn_cancleFlight.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancleFlight.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btn_cancleFlight.setText("Cancel");
        btn_cancleFlight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_cancleFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancleFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleFlightActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cancleFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 122, 40));

        txt_ticketId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_ticketId.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(txt_ticketId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 240, 30));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 1180, 460));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1240, 650));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed


    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_sourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sourceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_sourceActionPerformed

    private void txt_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_classActionPerformed

    private void txt_destinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_destinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_destinationActionPerformed

    private void txt_flightCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flightCodeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_flightCodeActionPerformed

    private void btn_cancleFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleFlightActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancleFlightActionPerformed

    private void txt_flightCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_flightCodeItemStateChanged
        // TODO add your handling code here:
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flights join flightDetails on flights.flight_code=flightDetails.flight_code where flightDetails.flight_code=?");
            pst.setString(1, txt_flightCode.getSelectedItem().toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                txt_flightName.setText(rs.getString("flight_name"));
                txt_depart_time.setText(rs.getString("depart_time"));
                txt_arrival_time.setText(rs.getString("arrival_time"));

                String source = rs.getString("source");
                boolean exists = false;
                for (i = 0; i < txt_source.getItemCount(); i++) {
                    if (txt_source.getItemAt(i).equals(source)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    txt_source.addItem(source);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_flightCodeItemStateChanged

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyTyped
        
        try {
            String user = txt_username.getText();
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from passenger where userid=?");
            pst.setString(1, user);
            rs = pst.executeQuery();

            while (rs.next()) {
                txt_name.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_usernameKeyTyped

    private void txt_flightNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_flightNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_flightNameActionPerformed

    private void txt_classItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_classItemStateChanged
        // TODO add your handling code here:
        try {
            String flight_code = txt_flightCode.getSelectedItem().toString();
            String class_name = txt_class.getSelectedItem().toString();
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from flightDetails where flight_code=? and class_name=?");
            pst.setString(1, flight_code);
            pst.setString(2, class_name);
            rs = pst.executeQuery();

            while (rs.next()) {
                txt_price.setText(rs.getString("price"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_txt_classItemStateChanged

    private void txt_sourceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txt_sourceItemStateChanged
        // TODO add your handling code here:
        try {
            String source = txt_source.getSelectedItem().toString();
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select *  from flightDetails where source=?");
            pst.setString(1, source);
            rs = pst.executeQuery();

            while (rs.next()) {
//                txt_destination.addItem(rs.getString("destination"));
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

    private void btn_bookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookFlightActionPerformed
        // TODO add your handling code here:
        if (bookTicketValidateForm() == true) {
            try {
                Date d = txt_date.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String date = sdf.format(d);
                conn = DriverManager.getConnection(host, username, password);
                pst = conn.prepareStatement("insert into bookFlight(ticket_id, user_id, name, flight_code, flight_name, source,"
                        + " destination, class, price, journey_date,  status, depart_time, arrival_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, txt_ticketId.getText());
                pst.setString(2, txt_username.getText());
                pst.setString(3, txt_name.getText());
                pst.setString(4, txt_flightCode.getSelectedItem().toString());
                pst.setString(5, txt_flightName.getText());
                pst.setString(6, txt_source.getSelectedItem().toString());
                pst.setString(7, txt_destination.getSelectedItem().toString());
                pst.setString(8, txt_class.getSelectedItem().toString());
                pst.setString(9, txt_price.getText());
                pst.setString(10, date);
                pst.setString(11, "Booked");
                pst.setString(12, txt_depart_time.getText());
                pst.setString(13, txt_arrival_time.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Ticket Booked Successfully");
                dispose();
                emp_print_booked_ticket print = new emp_print_booked_ticket();
                print.txt_user.setText(txt_username.getText());
                print.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_bookFlightActionPerformed

    private void txt_depart_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_depart_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_depart_timeActionPerformed

    private void txt_arrival_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_arrival_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_arrival_timeActionPerformed

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
            java.util.logging.Logger.getLogger(emp_book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_book_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_book_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookFlight;
    private javax.swing.JButton btn_cancleFlight;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_arrival_time;
    private javax.swing.JComboBox<String> txt_class;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_depart_time;
    private javax.swing.JComboBox<String> txt_destination;
    private javax.swing.JComboBox<String> txt_flightCode;
    private javax.swing.JTextField txt_flightName;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JComboBox<String> txt_source;
    private javax.swing.JLabel txt_ticketId;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
