/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.awt.Color;
import java.io.*;
import java.nio.file.Files;
import java.util.logging.*;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Ramirez
 * Codigo: 20161020077
 * Ciencias de la computacion 3
 */
public class FrmAnalizador extends javax.swing.JFrame {
    public String Archivo;


    /**
     * Creates new form FrmAnalizador
     */
    public FrmAnalizador() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtALex = new javax.swing.JTextArea();
        btnAnalisis = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtACod = new javax.swing.JTextArea();
        btnSintactico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtASin = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtALex.setColumns(20);
        txtALex.setRows(5);
        jScrollPane1.setViewportView(txtALex);
        txtALex.getAccessibleContext().setAccessibleName("JtextAnalisis");

        btnAnalisis.setText("Lexico");
        btnAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisActionPerformed(evt);
            }
        });

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        txtACod.setColumns(20);
        txtACod.setRows(5);
        jScrollPane2.setViewportView(txtACod);

        btnSintactico.setText("Sintactico");
        btnSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintacticoActionPerformed(evt);
            }
        });

        txtASin.setColumns(20);
        txtASin.setRows(5);
        jScrollPane3.setViewportView(txtASin);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSintactico)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAbrir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(173, 173, 173)
                                        .addComponent(btnAnalisis))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalisis)
                    .addComponent(btnAbrir)
                    .addComponent(btnGuardar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSintactico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAnalisis.getAccessibleContext().setAccessibleName("BtnAnalisis");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void analizarLexico() throws IOException{
    
        int cont = 1;
        String expr = (String) txtACod.getText();
        Lexer lexicos =new Lexer(new StringReader(expr));
        String result= "LINEA " + cont + "\t\tSIMBOLO\n";
        while(true){
            Tokens tokens= lexicos.yylex();
            if (tokens==null){
                result+= "Final";
                txtALex.setText(result);
                return;
            }
            switch(tokens) {
                case Linea:
                cont++;
                result += "LINEA " + cont + "\n";
                break;
                case Comillas:
                result += " <Comillas>\t\t" + lexicos.lexeme + "\n";
                break;
                case Comillas_S:
                result += " <Comillas simples>\t\t" + lexicos.lexeme + "\n";
                break;
                case Cadena:
                result += " <Tipo de dato>\t\t" + lexicos.lexeme + "\n";
                break;
                case T_datoN:
                result += " <Tipo de dato>\t\t" + lexicos.lexeme + "\n";
                break;
                case Vacio:
                result += " <Tipo de dato vacio>\t\t" + lexicos.lexeme + "\n";
                break;
                case Nulo:
                result += " <Tipo de dato nulo>\t\t" + lexicos.lexeme + "\n";
                break;
                case Include:
                result += " <Reservada include>\t\t" + lexicos.lexeme + "\n";
                break;
                case If:
                result += " <Reservada if>\t" + lexicos.lexeme + "\n";
                break;
                case Else:
                result += " <Reservada else>\t" + lexicos.lexeme + "\n";
                break;
                case Do:
                result += " <Reservada do>\t" + lexicos.lexeme + "\n";
                break;
                case While:
                result += " <Reservada while>\t" + lexicos.lexeme + "\n";
                break;
                case For:
                result += " <Reservada while>\t" + lexicos.lexeme + "\n";
                break;
                case Switch:
                result += " <Reservada switch>\t" + lexicos.lexeme + "\n";
                break;    
                case Case:
                result += " <Reservada case>\t" + lexicos.lexeme + "\n";
                break;    
                case Break:
                result += " <Reservada break>\t" + lexicos.lexeme + "\n";
                break;
                case Default:
                result += " <Reservada default>\t" + lexicos.lexeme + "\n";
                break;
                case Print:
                result += " <Reservada printf>\t" + lexicos.lexeme + "\n";
                break;
                case Scan:
                result += " <Reservada scan>\t" + lexicos.lexeme + "\n";
                break;
                case Gets:
                result += " <Reservada gets>\t" + lexicos.lexeme + "\n";
                break;
                case Return:
                result += " <Reservada return>\t" + lexicos.lexeme + "\n";
                break;
                case Unsigned:
                result += " <Reservada unsigned>\t" + lexicos.lexeme + "\n";
                break;
                case Sistema:
                result += " <Reservada system>\t" + lexicos.lexeme + "\n";
                break;
                case SizeOf:
                result += " <Reservada sizeOf>\t" + lexicos.lexeme + "\n";
                break;
                case Igual:
                result += " <Operador igual>\t" + lexicos.lexeme + "\n";
                break;
                case Suma:
                result += " <Operador suma>\t" + lexicos.lexeme + "\n";
                break;
                case Resta:
                result += " <Operador resta>\t" + lexicos.lexeme + "\n";
                break;
                case Multiplicacion:
                result += " <Operador multiplicacion>\t" + lexicos.lexeme + "\n";
                break;
                case Division:
                result += " <Operador division>\t" + lexicos.lexeme + "\n";
                break;
                case Modulo:
                result += " <Operador modulo>\t" + lexicos.lexeme + "\n";
                break;
                case Op_logico:
                result += " <Operador logico>\t" + lexicos.lexeme + "\n";
                break;
                case Op_incremento:
                result += " <Operador incremento>\t" + lexicos.lexeme + "\n";
                break;
                case Op_relacional:
                result += " <Operador relacional>\t" + lexicos.lexeme + "\n";
                break;
                case Op_atribucion:
                result += " <Operador atribucion>\t" + lexicos.lexeme + "\n";
                break;
                case Op_booleano:
                result += " <Operador booleano>\t" + lexicos.lexeme + "\n";
                break;
                case Numeral:
                result += " <Numeral>\t" + lexicos.lexeme + "\n";
                break;
                case Parentesis_a:
                result += " <Parentesis de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Parentesis_c:
                result += " <Parentesis de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Llave_a:
                result += " <Llave de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Llave_c:
                result += " <Llave de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Corchete_a:
                result += " <Corchete de apertura>\t" + lexicos.lexeme + "\n";
                break;
                case Corchete_c:
                result += " <Corchete de cierre>\t" + lexicos.lexeme + "\n";
                break;
                case Main:
                result += " <Reservada main>\t" + lexicos.lexeme + "\n";
                break;
                case P_coma:
                result += " <Punto y coma>\t" + lexicos.lexeme + "\n";
                break;
                case Dos_P:
                result += " <Dos puntos>\t" + lexicos.lexeme + "\n";
                break;
                case Punto:
                result += " <Punto>\t" + lexicos.lexeme + "\n";
                break;
                case Identificador:
                result += " <Identificador>\t\t" + lexicos.lexeme + "\n";
                break;
                case Numero:
                result += " <Numero>\t\t" + lexicos.lexeme + "\n";
                break;
                case ERROR:
                result += " <Simbolo no definido>\n";
                break;
                default:
                result += " < " + lexicos.lexeme + " >\n";
                break;
            }
        }
        
    }
    
    private void btnAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisActionPerformed
        // TODO add your handling code here:
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
}
        
    }//GEN-LAST:event_btnAnalisisActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        JFileChooser escoger=new JFileChooser();
        escoger.showOpenDialog(null);
        File arc = new File(escoger.getSelectedFile().getAbsolutePath());
        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            txtACod.setText(ST);
            }catch (FileNotFoundException ex){
                Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE,null,ex);
            }catch (IOException ex){
                Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed
    
    private void btnSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintacticoActionPerformed
        String ST = txtACod.getText();
        System.out.println(ST);
        Sintaxis s = new Sintaxis(new LexicoCup(new StringReader(ST)));
        try {
            s.parse();
            txtASin.setText("Analisis realizado correctamente");
            txtASin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtASin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtASin.setForeground(Color.red);
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSintacticoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        FileWriter guardar = null;
        try {
            if(Archivo.equals("")){
                Archivo="./archivo.c";
            }
            guardar = new FileWriter(Archivo);
            guardar.write(txtACod.getText());
            guardar.close();
            JOptionPane.showMessageDialog(null, "Guardado en: "+Archivo);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                guardar.close();
            } catch (IOException ex) {
                Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalisis;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtACod;
    private javax.swing.JTextArea txtALex;
    private javax.swing.JTextArea txtASin;
    // End of variables declaration//GEN-END:variables
}