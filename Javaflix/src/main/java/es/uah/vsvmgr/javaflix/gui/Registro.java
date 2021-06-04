package es.uah.vsvmgr.javaflix.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcostuf
 */

import es.uah.vsvmgr.javaflix.app.TarjetaCredito;
import es.uah.vsvmgr.javaflix.app.Usuario;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileWriter;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class Registro extends javax.swing.JFrame {
    

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        File imagenFile = new File(".\\javaflix.jpg");
        BufferedImage imagen = null;
        try{
        imagen = ImageIO.read(imagenFile);
        }catch (IOException ioe){
        ioe.printStackTrace();
        }
        Image imagenResized = imagen.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(imagenResized);
        jLabel3.setIcon(icono);
        jLabel3.setVisible(true);
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 4, 5));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jTextField1.setText("DNI");
        jTextField1.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(112, 25));

        jTextField2.setText("Nombre");
        jTextField2.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField2.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(112, 25));

        jTextField3.setText("Correo");
        jTextField3.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField3.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(112, 25));

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setMaximumSize(new java.awt.Dimension(112, 20));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(112, 20));

        jTextField4.setText("Numero de la tarjeta");
        jTextField4.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField4.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(112, 25));

        jTextField5.setText("Fecha de caducidad");
        jTextField5.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField5.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField5.setPreferredSize(new java.awt.Dimension(112, 25));

        jTextField6.setText("Saldo");
        jTextField6.setMaximumSize(new java.awt.Dimension(112, 20));
        jTextField6.setMinimumSize(new java.awt.Dimension(112, 20));
        jTextField6.setPreferredSize(new java.awt.Dimension(112, 25));

        jButton1.setText("Registrarse");
        jButton1.setMaximumSize(new java.awt.Dimension(112, 20));
        jButton1.setMinimumSize(new java.awt.Dimension(112, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(112, 20));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Clave");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *Quita los acentos de la string que se le pase como argumento y la devuelve
     * @param s String
     * @return String s
     */
    public static String quitarAcentos(String s) 
{
    s = Normalizer.normalize(s, Normalizer.Form.NFD);
    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    return s;
}  
    /**
     * Comprueba que los datos introducidos en los jTextFields sean válidos y, de ser así, guarda la información del usuario en un archivo txt con su dni como nombre en la carpeta usuarios y lanza la subscripción
     * El numero de la tarjeta ha de tener 16 dígitos
     * El dni ha de tener 8 dígitos y una letra al final
     * Un nombre no puede tener números
     * Un correo ha de tener un "@"
     * Una fecha ha de ser un int de 3 o 4 dígitos
     * Un saldo no puede contener letras
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        boolean numTarjetaCorrecto = true;
        boolean dniCorrecto = true;
        boolean nombreCorrecto = true;
        boolean correoCorrecto = true;
        boolean fechaCorrecta = true;
        boolean saldoCorrecto = true;
        boolean claveCorrecta = true;
        
        jLabel2.setText("");
        
        String pass=new String(jPasswordField1.getPassword());
        if (pass.equals("") || jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("")){
        jLabel2.setText("Introduzca todos los datos");
        jTextField1.setText("DNI");
        jTextField2.setText("Nombre");
        jTextField3.setText("Correo");
        jTextField4.setText("Numero de la tarjeta");
        jTextField5.setText("Fecha de caducidad");
        jTextField6.setText("Saldo");
        jPasswordField1.setText("**********");
        }
        
        if (pass.equals("")){
        claveCorrecta=false;
        }
        
        //TARJETA
        if(!(jTextField4.getText().length()==16)){
            numTarjetaCorrecto=false;
                }
        for (int j=0; j<jTextField4.getText().length();++j){
            if (!("1234567890".contains(Character.toString(jTextField4.getText().charAt(j))))){
                  numTarjetaCorrecto=false;
        }
        }
        //DNI
        char[] dniArray = jTextField1.getText().toCharArray();
        for (int i = 0; i<jTextField1.getText().length(); ++i){
            if (i<jTextField1.getText().length()-1) {
                if (!("1234567890".contains(Character.toString(dniArray[i])))){
                dniCorrecto=false;
                }
            }
            else {
            if (!("abcdefghijklmnopqrstuvwxyz".contains(Character.toString(dniArray[i]).toLowerCase()))){
                dniCorrecto=false;
            }
            }
        }
        if(!(jTextField1.getText().length()==9)){
                dniCorrecto=false;
        }
        File cuenta = new File(".\\usuarios\\"+jTextField1.getText()+".txt");
        if (cuenta.isFile()){
                dniCorrecto=false;
        }
        
        //NOMBRE
        for (int j=0; j<jTextField2.getText().length();++j){
            if (!("abcdefghijklmnopqrstuvwxyz ".contains((quitarAcentos(Character.toString(jTextField2.getText().charAt(j)))).toLowerCase()))){
                  nombreCorrecto=false;   
            }
        }
        //CORREO
        if (!(jTextField3.getText().contains("@"))){
        correoCorrecto=false;
        }
        //FECHA
        if (!(jTextField5.getText().length()==4 || jTextField5.getText().length()==3)) {
        fechaCorrecta=false;
        }
        
        for (int j=0; j<jTextField5.getText().length();++j){
            if (!("1234567890".contains(Character.toString(jTextField5.getText().charAt(j))))){
                  fechaCorrecta=false;
        }
        }
        
        //SALDO
            for (int j=0; j<jTextField6.getText().length();++j){
            if (!("1234567890.,".contains(Character.toString(jTextField6.getText().charAt(j))))){
                  saldoCorrecto=false;
        }
        }
        //MENSAJE DE ERROR
        if (dniCorrecto==false) {
        jLabel2.setText("|DNI INVALIDO|");
        }
        if (nombreCorrecto==false) {
        jLabel2.setText(jLabel2.getText()+" |NOMBRE INVALIDO|");
        }
        if (correoCorrecto==false) {
        jLabel2.setText(jLabel2.getText()+" |CORREO INVALIDO|");
        }
        if (numTarjetaCorrecto==false) {
        jLabel2.setText(jLabel2.getText()+" |TARJETA INVALIDA|");
        }
        if (fechaCorrecta==false) {
        jLabel2.setText(jLabel2.getText()+" |FECHA INVALIDA|");
        }
        if (saldoCorrecto==false) {
        jLabel2.setText(jLabel2.getText()+" |SALDO INVALIDO|");
        } 
        
        //ALMACENAMIENTO DE DATOS Y LANZADOR DE CLASE Suscripcion 
        if (dniCorrecto && nombreCorrecto && correoCorrecto && numTarjetaCorrecto && fechaCorrecta && saldoCorrecto && claveCorrecta) {
        TarjetaCredito tarjeta = new TarjetaCredito(jTextField4.getText(), Integer.parseInt(jTextField5.getText()), Double.parseDouble(jTextField6.getText()));
        Usuario usuario = new Usuario(jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), pass, tarjeta, false);
            
   
            try { 
                PrintWriter data = new PrintWriter(new BufferedWriter(new FileWriter(".\\usuarios\\"+usuario.getDni()+".txt")));
                data.println(usuario.toString()+"-[]");
                data.close();
                
            } catch (IOException ioe) {
              System.out.println("Error IO: "+ioe.toString());
}
        this.dispose();
        Suscripcion subscripcion = new Suscripcion();
        subscripcion.setDni(usuario.getDni());
        subscripcion.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
