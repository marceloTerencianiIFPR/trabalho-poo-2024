/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.marcelo;

/**
 *
 * @author Aluno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 350));
        setMinimumSize(new java.awt.Dimension(300, 350));
        setPreferredSize(new java.awt.Dimension(300, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 350));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(33, 217, 40));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(7, 0, 50, 10));
        jPanel1.add(jLabel4);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("E-mail");
        jPanel1.add(jLabel2);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("Digite seu e-mail");
        jPanel1.add(jTextField1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPanel1.add(jPasswordField1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 40, 230, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/marcelo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-360, -30, 710, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
