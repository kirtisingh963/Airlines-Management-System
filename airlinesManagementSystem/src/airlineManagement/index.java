package airlineManagement;
import javax.swing.JOptionPane;

public class index extends javax.swing.JFrame {
    public index() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_count = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Welcome To");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 297, 52));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 52)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Airlines Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 674, -1));

        txt_count.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_count.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(txt_count, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 180, 30));

        progressbar.setBackground(new java.awt.Color(255, 255, 255));
        progressbar.setForeground(new java.awt.Color(102, 255, 0));
        progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(progressbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 700, 470, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/airport ams.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -40, 1560, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        index my = new index();
        my.setVisible(true);
        try {
            for(int i=0; i<=100; i+=2){
                Thread.sleep(100);
                my.progressbar.setValue(i);
                my.txt_count.setText("Loading..."+i + "%");
            }
            new welcome().setVisible(true);
            my.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error occured"+e.getMessage());
        }

            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel txt_count;
    // End of variables declaration//GEN-END:variables
}
