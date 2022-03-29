/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.Conexao;
import dao.DAOUsuario;
import java.util.ArrayList;
import model.Usuario;
import view.TelaPrincipal;
import dao.Conexao;
import java.sql.SQLException;
import java.sql.Connection;
import dao.DAOUsuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author admin
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("E-mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Senha:");
        jLabel2.setToolTipText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        txtEmail.setColumns(25);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        getContentPane().add(txtEmail, gridBagConstraints);

        txtSenha.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        getContentPane().add(txtSenha, gridBagConstraints);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(btnEntrar, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fornecedor.png"))); // NOI18N
        jLabel3.setText("LOGIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        getContentPane().add(jLabel3, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txtEmail.getText();
        String senha =  String.valueOf(txtSenha.getPassword());
        boolean verificado = false;
        
        //conferindo o email e senha
        
        Conexao c = new Conexao();
        System.out.println(c);
        
        DAOUsuario d = new DAOUsuario();
    
        ArrayList<Usuario> usuarios;
        try {
            usuarios = d.consultarUsuarios();
             if(!usuarios.isEmpty()){
                for(Usuario p : usuarios){
                    String pEmail = p.getEmail();
                    String pSenha = p.getSenha();
                    System.out.println("--------------------------------------");
                    System.out.printf("\n %s \n %s \n", pEmail, pSenha);
                    System.out.printf("\n %s \n %s \n", email, senha);
                    System.out.println("--------------------------------------");
                    
                }
        } 
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
    }//GEN-LAST:event_btnEntrarActionPerformed

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
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}