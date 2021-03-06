/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
//
//import edu.poly.atmjavanc.helper.databasehelper;
import dao.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LÊ VĂN THẮNG
 */
public class viewSoDu336 extends javax.swing.JFrame {
public static  String MaThe336;
    /**
     * Creates new form viewSoDu
     */
     
    public viewSoDu336() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        login331 lg = new login331();
        this.MaThe336= lg.MaThe;
        Showdatabase(this.MaThe336);
     
    }
private void Showdatabase(String Mathe336) throws SQLException{
        String sql = "SELECT * FROM Account where MaThe = ? ";
        try(
                 
                Connection con =SQLServerConnection.getSQLServerConnection();
                PreparedStatement pstmt= con.prepareStatement(sql);
             ){
            pstmt.setString(1, MaThe336);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                lbsotk336.setText("Mã Số Thẻ: "+rs.getString("MaThe"));
                lbhoten336.setText("Tên Tài Khoản: "+rs.getString("Tendangnhap"));
                lbsodu336.setText("Số Dư Khả Dụng: "+rs.getString("SoDu")+"    VND");
                 
            }
       
        } catch (SQLException ex) {
        }
        
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnShowtK = new javax.swing.JButton();
        lbhoten336 = new javax.swing.JLabel();
        lbsotk336 = new javax.swing.JLabel();
        lbsodu336 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xem Số Dư");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/viettin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel5.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xem Số Dư");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 10, 490, 29);

        btnThoat.setBackground(new java.awt.Color(255, 255, 0));
        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 102, 255));
        btnThoat.setText("Quay về");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel5.add(btnThoat);
        btnThoat.setBounds(90, 240, 90, 34);

        btnShowtK.setBackground(new java.awt.Color(255, 255, 0));
        btnShowtK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShowtK.setForeground(new java.awt.Color(0, 102, 255));
        btnShowtK.setText("Xem Chi tiết tài khoản");
        btnShowtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowtKActionPerformed(evt);
            }
        });
        jPanel5.add(btnShowtK);
        btnShowtK.setBounds(230, 240, 175, 34);

        lbhoten336.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbhoten336.setForeground(new java.awt.Color(255, 255, 255));
        lbhoten336.setText("Tên Tài Khoản");
        lbhoten336.setName("lbtentk"); // NOI18N
        jPanel5.add(lbhoten336);
        lbhoten336.setBounds(20, 110, 360, 40);

        lbsotk336.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbsotk336.setForeground(new java.awt.Color(255, 255, 255));
        lbsotk336.setText("Số Tài Khoản");
        lbsotk336.setName("lbMathe"); // NOI18N
        jPanel5.add(lbsotk336);
        lbsotk336.setBounds(20, 70, 360, 40);

        lbsodu336.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbsodu336.setForeground(new java.awt.Color(255, 255, 255));
        lbsodu336.setText("Số dư khả dụng");
        lbsodu336.setName("lbsodu"); // NOI18N
        jPanel5.add(lbsodu336);
        lbsodu336.setBounds(20, 160, 370, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lacovn.png"))); // NOI18N
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 2, 510, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        menu331 menu = new menu331();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnShowtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowtKActionPerformed
      XemVaCapNhatTK309 xcn = new XemVaCapNhatTK309();
        xcn.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnShowtKActionPerformed

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
            java.util.logging.Logger.getLogger(viewSoDu336.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSoDu336.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSoDu336.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSoDu336.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new viewSoDu336().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(viewSoDu336.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowtK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbhoten336;
    private javax.swing.JLabel lbsodu336;
    private javax.swing.JLabel lbsotk336;
    // End of variables declaration//GEN-END:variables
}
