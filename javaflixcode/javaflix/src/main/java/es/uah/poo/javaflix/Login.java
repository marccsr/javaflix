/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.poo.javaflix;


import java.io.FileReader;
import javax.swing.JOptionPane;
        

/**
 *
 * @author MARCOSTUF
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        loginboton = new javax.swing.JButton();
        javaflixtit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        user.setText("Usuario");

        pass.setText("Contraseña");

        loginboton.setText("LOGIN");
        loginboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbotonActionPerformed(evt);
            }
        });

        javaflixtit.setText("BIENVENIDO A JAVAFLIX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userfield)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginboton, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(passfield)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(javaflixtit)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(javaflixtit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(loginboton)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbotonActionPerformed
        char contrasena[]=passfield.getPassword();
        
        String contrasenadef=new String(contrasena);
        
        if (userfield.getText().equals(FileReader f (datos/datos.txt)) && passfield.equals(FileReader f (datos/passwords.txt))){
        
    
            this.dispose();
            JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "+ "satisfactoriamente a JavaFlix.", "Mensaje de bienvenida", JOptionPane.INFORMATION_MESSAGE);
        
            Formulario1 formformulario1= new Formulario1();
        
            formformulario1.setVisible(true);
        
            else {
                JOptionPane.showMessageDialog(null, "Acceso denegado.\n"+"Por favor, ingrese un usuario y/o contraseña correctos.",
                JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginbotonActionPerformed
        
            
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
    private javax.swing.JLabel javaflixtit;
    private javax.swing.JButton loginboton;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel user;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
