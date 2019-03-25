/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karaoke.ui;

import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LoginFrame extends javax.swing.JFrame {
    int i = 0; //biến đếm số lần đăng nhập sai
    public LoginFrame() {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        txtUsername.requestFocus();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/karaoke/images/icon/iconFrame.png")));
        getRootPane().setDefaultButton(btnLogin);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeft = new javax.swing.JPanel();
        lblLOGO = new javax.swing.JLabel();
        pnlRight = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblCopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeft.setBackground(new java.awt.Color(204, 204, 255));
        pnlLeft.setForeground(new java.awt.Color(0, 102, 51));
        pnlLeft.setMaximumSize(new java.awt.Dimension(450, 550));
        pnlLeft.setMinimumSize(new java.awt.Dimension(450, 550));
        pnlLeft.setPreferredSize(new java.awt.Dimension(450, 550));
        pnlLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/karaoke/images/icon/Karaoke_Logo.png"))); // NOI18N
        lblLOGO.setName(""); // NOI18N
        pnlLeft.add(lblLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        getContentPane().add(pnlLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlRight.setBackground(new java.awt.Color(51, 51, 51));
        pnlRight.setForeground(new java.awt.Color(0, 102, 51));
        pnlRight.setMaximumSize(new java.awt.Dimension(450, 550));
        pnlRight.setMinimumSize(new java.awt.Dimension(450, 550));
        pnlRight.setPreferredSize(new java.awt.Dimension(450, 550));
        pnlRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(51, 51, 51));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ĐĂNG NHẬP HỆ THỐNG");
        pnlRight.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, -1));

        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 0));
        pnlRight.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 300, 40));

        lblPassword.setBackground(new java.awt.Color(51, 51, 51));
        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        pnlRight.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 450, -1));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 0));
        pnlRight.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 300, 40));

        btnCancel.setBackground(new java.awt.Color(51, 51, 51));
        btnCancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/karaoke/images/icon/icons8_Cancel_32px_1.png"))); // NOI18N
        btnCancel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCancel.setMaximumSize(new java.awt.Dimension(32, 32));
        btnCancel.setMinimumSize(new java.awt.Dimension(32, 32));
        btnCancel.setPreferredSize(new java.awt.Dimension(32, 32));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlRight.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        btnLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRight.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 40));

        lblUsername.setBackground(new java.awt.Color(51, 51, 51));
        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("USERNAME");
        pnlRight.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 450, -1));

        lblCopyright.setBackground(new java.awt.Color(51, 51, 51));
        lblCopyright.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCopyright.setForeground(new java.awt.Color(102, 102, 102));
        lblCopyright.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCopyright.setText("Ver 1.0 - Copyright © 2018. All rights reserved");
        pnlRight.add(lblCopyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 270, -1));

        getContentPane().add(pnlRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    private void login() {
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCopyright;
    private javax.swing.JLabel lblLOGO;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
