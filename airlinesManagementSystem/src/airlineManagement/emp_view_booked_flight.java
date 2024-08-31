package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import common.openPdf;
import java.io.FileOutputStream;
import dcc.GarmentUtils;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.openPdf;
import java.awt.event.ItemEvent;

public class emp_view_booked_flight extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int i, q;
    String gender = "";
    String billId;

    public emp_view_booked_flight() {
        initComponents();
        showData();
    }

    public void showData() {
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from bookFlight where status = ?");
            pst.setString(1, "booked");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) tbl_viewBookedFlight.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                for (i = 1; i < q; i++) {
                    v.add(rs.getString("ticket_id"));
                    v.add(rs.getString("user_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("flight_code"));
                    v.add(rs.getString("flight_name"));
                    v.add(rs.getString("source"));
                    v.add(rs.getString("destination"));
                    v.add(rs.getString("class"));
                    v.add(rs.getString("price"));
                    v.add(rs.getString("journey_date"));
                    v.add(rs.getString("arrival_time"));
                    v.add(rs.getString("depart_time"));
                    v.add(rs.getString("status"));
                }
                model.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_viewBookedFlight = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        printbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_viewBookedFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket Id", "Username", "Passenger Name", "FlightCode", "Flight Name", "Source", "Destination", "Class", "Price", "Journey Date", "Arrival Time", "Depart Time", "Status"
            }
        ));
        tbl_viewBookedFlight.setColorBackgoundHead(new java.awt.Color(51, 102, 255));
        tbl_viewBookedFlight.setFuenteHead(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_viewBookedFlight.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_viewBookedFlight);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1510, 610));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 28)); // NOI18N
        jLabel1.setText("Booked Ticket Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 320, 40));

        closeBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(220, 0, 4));
        closeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn.setText("X");
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        jPanel2.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 0, 30, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Search by username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 140, 30));

        txt_search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 42, 210, 30));

        printbtn.setBackground(new java.awt.Color(0, 0, 255));
        printbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setText("Print");
        printbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });
        jPanel2.add(printbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 43, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1510, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        try {
            String s = txt_search.getText() + "%";
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from bookFlight where user_id like '" + s + "'");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) tbl_viewBookedFlight.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                for (i = 1; i < q; i++) {
                    v.add(rs.getString("ticket_id"));
                    v.add(rs.getString("user_id"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("flight_code"));
                    v.add(rs.getString("flight_name"));
                    v.add(rs.getString("source"));
                    v.add(rs.getString("destination"));
                    v.add(rs.getString("class"));
                    v.add(rs.getString("price"));
                    v.add(rs.getString("journey_date"));
                    v.add(rs.getString("arrival_time"));
                    v.add(rs.getString("depart_time"));
                    v.add(rs.getString("status"));
                }
                model.addRow(v);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    public String getUniqueId(String prifix) {
        return prifix + System.nanoTime();

    }

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_viewBookedFlight.getModel();
        int sr = tbl_viewBookedFlight.getSelectedRow();
        if (sr == 0) {
            long l = System.currentTimeMillis();
            Date d = new Date(l);
            billId = getUniqueId("Bill-");
            billId = getUniqueId("Bill-");

            //genderate bill
            Document doc = new Document();

            String ticketid = model.getValueAt(sr, 0).toString();
            String username = model.getValueAt(sr, 1).toString();
            String passengername = model.getValueAt(sr, 2).toString();
            String flightcode = model.getValueAt(sr, 3).toString();
            String flightname = model.getValueAt(sr, 4).toString();
            String source = model.getValueAt(sr, 5).toString();
            String destination = model.getValueAt(sr, 6).toString();
            String classname = model.getValueAt(sr, 7).toString();
            String price = model.getValueAt(sr, 8).toString();
            String journeydate = model.getValueAt(sr, 9).toString();
            String arrivaltime = model.getValueAt(sr, 10).toString();
            String departtime = model.getValueAt(sr, 11).toString();
            String status = model.getValueAt(sr, 12).toString();

            try {

                PdfWriter.getInstance(doc, new FileOutputStream(GarmentUtils.billPath + "" + billId + ".pdf"));
                doc.open();
                Paragraph garmentName = new Paragraph("                                                      Airlines Ticket\n");
                doc.add(garmentName);
                Paragraph newline = new Paragraph("\n");
                Paragraph startLine = new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n");
                doc.add(startLine);
                doc.add(newline);
                Paragraph details = new Paragraph("Ticket No : " + ticketid + "                                     Ticket Date : " + new Date());
                doc.add(details);
                doc.add(startLine);
                doc.add(newline);
                Paragraph PassengerDetails = new Paragraph("Passenger Name : " + passengername);
                doc.add(PassengerDetails);
                doc.add(newline);
                doc.add(startLine);
                Paragraph FlightDetails = new Paragraph("From : " + source + "                                   To : " + destination + "                                 Flight Code : " + flightcode);
                doc.add(FlightDetails);
                doc.add(newline);
                doc.add(newline);
                Paragraph FlightDetails1 = new Paragraph("Arrival Time : " + arrivaltime + "                           Departure Time : " + departtime + "             Journey Date : " + journeydate);
                doc.add(FlightDetails1);
                doc.add(newline);
                doc.add(newline);
                Paragraph FlightDetail2 = new Paragraph("Class : " + classname + "                                 Price : " + price + "                             Status : " + status);
                doc.add(FlightDetail2);
                doc.add(newline);
                doc.add(startLine);
                Paragraph thanksmsg = new Paragraph("Thank you, Please visit again");
                doc.add(thanksmsg);
                openPdf.openById(String.valueOf(billId));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select row");
        }

    }//GEN-LAST:event_printbtnActionPerformed

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
            java.util.logging.Logger.getLogger(emp_view_booked_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_view_booked_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_view_booked_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_view_booked_flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_view_booked_flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printbtn;
    private rojeru_san.complementos.RSTableMetro tbl_viewBookedFlight;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
