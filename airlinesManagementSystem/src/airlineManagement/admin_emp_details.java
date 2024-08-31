
package airlineManagement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Vector;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import airlineManagement.admin_update_emp;

public class admin_emp_details extends javax.swing.JFrame {
    admin_update_emp update_emp = new admin_update_emp();
    String host = "jdbc:mysql://localhost:3306/airlinesManagementSystem";
    String username = "root";
    String password = "admin@123";
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int i, q;
    String gender = "";
    
    public admin_emp_details() {
        initComponents();
        showData();
    }
    
    public void showData(){
        try {
            conn = DriverManager.getConnection(host, username, password);
            pst = conn.prepareStatement("select * from employee");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            q = rsmd.getColumnCount();
            DefaultTableModel model = (DefaultTableModel) empDetailsTable.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                for(i = 1; i < q; i++){
                    v.add(rs.getInt("id"));
                    v.add(rs.getString("username"));
                    v.add(rs.getString("empname"));
                    v.add(rs.getString("email"));
                    v.add(rs.getString("phone"));
                    v.add(rs.getString("gender"));
                    v.add(rs.getString("dob"));
             }
                model.addRow(v);
        }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empDetailsTable = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        empDetailsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "User Name", "Emp. Name", "Email", "Phone No", "Gender", "DOB"
            }
        ));
        empDetailsTable.setColorBordeFilas(new java.awt.Color(102, 102, 102));
        empDetailsTable.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        empDetailsTable.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        empDetailsTable.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        empDetailsTable.setColorSelBackgound(new java.awt.Color(102, 102, 255));
        empDetailsTable.setFuenteHead(new java.awt.Font("Serif", 1, 18)); // NOI18N
        empDetailsTable.setRowHeight(30);
        empDetailsTable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        empDetailsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empDetailsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empDetailsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 1060, 540));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 370, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 290, 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Refresh Page");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 130, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 40, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg-cloud.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empDetailsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empDetailsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)empDetailsTable.getModel();
        int sr = empDetailsTable.getSelectedRow();
        
        try{
            String username = model.getValueAt(sr, 1).toString();
            String empname = model.getValueAt(sr, 2).toString();
            String email = model.getValueAt(sr, 3).toString();
            String phone = model.getValueAt(sr, 4).toString();
            String gen = model.getValueAt(sr, 5).toString();
            gender = gen;
            switch (gen) {
                case "Male":
                    update_emp.male.setSelected(true);
                    break;
                case "Female":
                    update_emp.female.setSelected(true);
                    break;
                case "Other":
                    update_emp.other.setSelected(true);
                    break;
                default:
                    break;
            }
            
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            d = sdf.parse(model.getValueAt(sr, 6).toString());
            
            
            update_emp.setVisible(true);
            update_emp.pack();
            update_emp.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
            update_emp.txt_username.setText(username);
            update_emp.txt_empName.setText(empname);
            update_emp.txt_email.setText(email);
            update_emp.txt_phone.setText(phone);
            update_emp.txt_dob.setDate(d);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          
    }//GEN-LAST:event_empDetailsTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_emp_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_emp_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro empDetailsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
