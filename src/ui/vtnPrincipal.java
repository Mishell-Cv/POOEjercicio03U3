/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author labctr
 */
public class vtnPrincipal extends javax.swing.JFrame {

    public static void verMensaje(String mensaje, int tipo, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipo);
    }
    
    /**
     * Creates new form vtnPrincipal
     */
    public vtnPrincipal() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mnuMatricula = new javax.swing.JMenu();
        mniRegistroMatriculas = new javax.swing.JMenuItem();
        mniRegistroCalificaciones = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuEstudiantes = new javax.swing.JMenu();
        mniNuevoEstudiante = new javax.swing.JMenuItem();
        mniReporteCalificaciones = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuMatricula.setMnemonic('f');
        mnuMatricula.setText("Matricula");

        mniRegistroMatriculas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mniRegistroMatriculas.setMnemonic('o');
        mniRegistroMatriculas.setText("Registro de Matriculas");
        mniRegistroMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistroMatriculasActionPerformed(evt);
            }
        });
        mnuMatricula.add(mniRegistroMatriculas);

        mniRegistroCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mniRegistroCalificaciones.setMnemonic('s');
        mniRegistroCalificaciones.setText("Registro de Calificaciones");
        mniRegistroCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistroCalificacionesActionPerformed(evt);
            }
        });
        mnuMatricula.add(mniRegistroCalificaciones);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        mnuMatricula.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        mnuMatricula.add(exitMenuItem);

        menuBar.add(mnuMatricula);

        mnuEstudiantes.setMnemonic('e');
        mnuEstudiantes.setText("Estudiante");
        mnuEstudiantes.setToolTipText("");

        mniNuevoEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mniNuevoEstudiante.setMnemonic('t');
        mniNuevoEstudiante.setText("Nuevo ");
        mniNuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoEstudianteActionPerformed(evt);
            }
        });
        mnuEstudiantes.add(mniNuevoEstudiante);

        mniReporteCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mniReporteCalificaciones.setMnemonic('y');
        mniReporteCalificaciones.setText("Reporte de Calificaciones");
        mniReporteCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReporteCalificacionesActionPerformed(evt);
            }
        });
        mnuEstudiantes.add(mniReporteCalificaciones);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        mnuEstudiantes.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        mnuEstudiantes.add(deleteMenuItem);

        menuBar.add(mnuEstudiantes);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mniRegistroMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistroMatriculasActionPerformed
        frmRegistroMatricula miFrmMatricula = new frmRegistroMatricula();
        this.desktopPane.add(miFrmMatricula);
        miFrmMatricula.show();
    }//GEN-LAST:event_mniRegistroMatriculasActionPerformed

    private void mniNuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoEstudianteActionPerformed
        frmRegistroEstudiante miFrmEstudiante = new frmRegistroEstudiante();
        this.desktopPane.add(miFrmEstudiante);
        miFrmEstudiante.show();
    }//GEN-LAST:event_mniNuevoEstudianteActionPerformed

    private void mniRegistroCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistroCalificacionesActionPerformed
        frmRegistroCalificaciones miFrmCalificaciones = new frmRegistroCalificaciones();
        this.desktopPane.add(miFrmCalificaciones);
        miFrmCalificaciones.show();
    }//GEN-LAST:event_mniRegistroCalificacionesActionPerformed

    private void mniReporteCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReporteCalificacionesActionPerformed
        frmReporteCalificaciones miFrmReporte = new frmReporteCalificaciones();
        this.desktopPane.add(miFrmReporte);
        miFrmReporte.show();
    }//GEN-LAST:event_mniReporteCalificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniNuevoEstudiante;
    private javax.swing.JMenuItem mniRegistroCalificaciones;
    private javax.swing.JMenuItem mniRegistroMatriculas;
    private javax.swing.JMenuItem mniReporteCalificaciones;
    private javax.swing.JMenu mnuEstudiantes;
    private javax.swing.JMenu mnuMatricula;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    // End of variables declaration//GEN-END:variables

}