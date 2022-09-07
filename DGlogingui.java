
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DGlogingui extends javax.swing.JFrame {

    /**
     * Creates new form DGlogingui
     */
    public DGlogingui() {
        initComponents();
    }
//validation
    public boolean validatelogin(){           //validation for login
        String nic = txtnic.getText();
        String pwd =txtpw.getText();
        if (nic.equals("")){
            JOptionPane.showMessageDialog(this,"Enter NIC ");
            return false;
        }
        if (pwd.equals("")){
            JOptionPane.showMessageDialog(this,"Enter password");
            return false;
        }
        //if (nic.equls("")) && (pwd.equls("")){
        //JOptionPane.showMessageDialog(this,"Please Enter Details");
    //}
        return true;
    }
    //authentication
    public void login() {
        String nic= txtnic.getText();
        String  pw= txtpw.getText();
        
         try {
       Class.forName("com.mysql.jdbc.Driver");
            Connection conn;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hasthiwcms","root","");
            PreparedStatement pst= conn.prepareStatement("select * from department_officer where DONIC=? and DOPW=?");
    
         
         pst.setString(1,nic);
         pst.setString(2,pw);
         ResultSet rs= pst.executeQuery();
         if (rs.next()) {
             JOptionPane.showMessageDialog(this,"login sucessful");
             DEPOdashboard dodashgui = new DEPOdashboard();
             dodashgui.setVisible(true);
             this.dispose();
         } else {
             JOptionPane.showMessageDialog(this,"Incorrect password or username");
         }
         
         
         
         } catch (Exception e) {
             e.printStackTrace();
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 133, 139));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 248, 154));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(202, 150, 92));
        jLabel3.setText("NIC");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 220, 80));

        txtnic.setBackground(new java.awt.Color(255, 248, 154));
        txtnic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 40));

        jLabel4.setBackground(new java.awt.Color(255, 248, 154));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(202, 150, 92));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 220, 120));

        jLabel5.setBackground(new java.awt.Color(255, 248, 154));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(222, 189, 71));
        jLabel5.setText("Login");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 120));

        txtpw.setBackground(new java.awt.Color(255, 248, 154));
        txtpw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpwActionPerformed(evt);
            }
        });
        jPanel1.add(txtpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 180, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Account_50px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Secure_50px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 30));

        jButton1.setBackground(new java.awt.Color(222, 189, 71));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jButton2.setBackground(new java.awt.Color(240, 84, 84));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Close");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, -10, 380, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Untitled design (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 440, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void txtpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpwActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if  (validatelogin()) {
          login();
          DEPOdashboard dodashgui = new DEPOdashboard();
          dodashgui.setVisible(true);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(DGlogingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DGlogingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DGlogingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DGlogingui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DGlogingui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnic;
    private javax.swing.JPasswordField txtpw;
    // End of variables declaration//GEN-END:variables
}
