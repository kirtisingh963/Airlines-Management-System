package airlineManagement;
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

public class emp_print_booked_ticket extends javax.swing.JFrame {

    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int i, q, id = 0;
    String billId = "";

    public emp_print_booked_ticket() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        txt_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Print your flight ticket.");

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelBtn.setText("Cancle");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        printBtn.setBackground(new java.awt.Color(0, 0, 255));
        printBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print");
        printBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        txt_user.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cancelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
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

    public String getUniqueId(String prifix) {
        return prifix + System.nanoTime();

    }
    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        long l = System.currentTimeMillis();
        Date d = new Date(l);
        billId = getUniqueId("Bill-");
        billId = getUniqueId("Bill-");

        //genderate bill
        Document doc = new Document();
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select *  from bookFlight join passenger on bookFlight.user_id = passenger.userid where user_id=?");
            pst.setString(1, txt_user.getText());
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();

            while (rs.next()) {
                PdfWriter.getInstance(doc, new FileOutputStream(GarmentUtils.billPath + "" + billId + ".pdf"));
                doc.open();
                Paragraph garmentName = new Paragraph("                                                      Airlines Management System\n");
                doc.add(garmentName);
                Paragraph newline = new Paragraph("\n");
                Paragraph startLine = new Paragraph("----------------------------------------------------------------------------------------------------------------------------------\n");
                doc.add(startLine);
                
                Paragraph details = new Paragraph("Ticket No. : " + rs.getString("ticket_id") + "                                               Booking Date : " + new Date());
                doc.add(details);
                Paragraph details1 = new Paragraph("Name : " + rs.getString("name") + "\nPhone Number : " + rs.getString("phone") + "\nEmail Id : " + rs.getString("email") + "\nGender: " + rs.getString("gender") + "\nAddress: " + rs.getString("address"));
                doc.add(details1);
                doc.add(startLine);
                doc.add(newline);
                Paragraph FlightDetails = new Paragraph("From : " + rs.getString("source") + "                                   To : " + rs.getString("destination") + "                                 Flight Code : " + rs.getString("flight_code"));
                doc.add(FlightDetails);
                doc.add(newline);
                doc.add(newline);
                Paragraph FlightDetails1 = new Paragraph("Arrival Time : " + rs.getString("arrival_time") + "                         Departure Time : " + rs.getString("depart_time") + "             Journey Date : " + rs.getString("journey_date"));
                doc.add(FlightDetails1);
                doc.add(newline);
                doc.add(newline);
                Paragraph FlightDetail2 = new Paragraph("Class : " + rs.getString("class") + "                               Price : " +  rs.getString("price") + "                             Status : " +  rs.getString("status"));
                doc.add(FlightDetail2);
                doc.add(newline);
//                PdfPTable tbl = new PdfPTable(9);
//                tbl.addCell("Ticket ID");
//                tbl.addCell("Flight Code");
//                tbl.addCell("Flight Name");
//                tbl.addCell("Source");
//                tbl.addCell("Destination");
//                tbl.addCell("Arrival Time");
//                tbl.addCell("Departure Time");
//                tbl.addCell("Class");
//                tbl.addCell("Ticket Price");
//                for (i = 1; i < 2; i++) {
//                    String a = rs.getString("ticket_id");
//                    String b = rs.getString("flight_code");
//                    String c = rs.getString("flight_name");
//                    String dd = rs.getString("source");
//                    String e = rs.getString("destination");
//                    String f = rs.getString("arrival_time");
//                    String g = rs.getString("depart_time");
//                    String h = rs.getString("class");
//                    String ii = rs.getString("price");
//                    tbl.addCell(a);
//                    tbl.addCell(b);
//                    tbl.addCell(c);
//                    tbl.addCell(dd);
//                    tbl.addCell(e);
//                    tbl.addCell(f);
//                    tbl.addCell(g);
//                    tbl.addCell(h);
//                    tbl.addCell(ii);
//                }
//                doc.add(tbl);
                doc.add(startLine);
                doc.add(newline);
                Paragraph thanksmsg = new Paragraph("Thank you, Please visit again");
                doc.add(thanksmsg);
                openPdf.openById(String.valueOf(billId));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        


    }//GEN-LAST:event_printBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(emp_print_booked_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp_print_booked_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp_print_booked_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp_print_booked_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp_print_booked_ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printBtn;
    public javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
