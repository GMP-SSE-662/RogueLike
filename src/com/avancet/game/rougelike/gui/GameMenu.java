/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GameMenu.java
 *
 * Created on 22.08.2011, 18:54:38
 */
package com.avancet.game.rougelike.gui;

import javax.swing.JFrame;

import com.avancet.game.rougelike.basic.GameObjectFactory;
import com.avancet.game.rougelike.helper.GameLogger;

/**
 *
 * @author marian
 */
public class GameMenu extends JFrame {

    /** Creates new form GameMenu */
    public GameMenu() {
        initComponents();
        GameLogger.getLogger().info("Init the GameMenu");
        versionNumber.setText(GameObjectFactory.getVersionNumber());
        versionCodename.setText(GameObjectFactory.getVersionCodename());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        menuGrid = new javax.swing.JPanel();
        gameName = new javax.swing.JLabel();
        gameVersion = new javax.swing.JPanel();
        versionNumber = new javax.swing.JLabel();
        versionCodename = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        credits = new javax.swing.JPanel();
        license = new javax.swing.JLabel();
        from = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 48)); // NOI18N
        jLabel1.setText("LogoPlaceHolder");
        logo.add(jLabel1);

        getContentPane().add(logo, java.awt.BorderLayout.PAGE_START);

        menu.setBorder(new javax.swing.border.MatteBorder(null));
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.Y_AXIS));

        menuGrid.setLayout(new java.awt.GridLayout(5, 1));

        gameName.setFont(new java.awt.Font("DejaVu Sans", 1, 36)); // NOI18N
        gameName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameName.setText("RougeLike");
        gameName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuGrid.add(gameName);

        gameVersion.setLayout(new java.awt.GridLayout(1, 2));

        versionNumber.setText("versionNumber");
        versionNumber.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gameVersion.add(versionNumber);

        versionCodename.setText("versionCodename");
        versionCodename.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gameVersion.add(versionCodename);

        menuGrid.add(gameVersion);

        jButton1.setText("Start");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuGrid.add(jButton1);

        jButton2.setText("Options");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuGrid.add(jButton2);

        jButton3.setText("Quit");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuGrid.add(jButton3);

        menu.add(menuGrid);

        getContentPane().add(menu, java.awt.BorderLayout.CENTER);

        credits.setLayout(new javax.swing.BoxLayout(credits, javax.swing.BoxLayout.PAGE_AXIS));

        license.setText("License under the GPL Version 3.");
        credits.add(license);

        from.setText("from Marian Sievers, made with Java, Swing, log4j, Eclipse, git, Gimp, Xubuntu");
        credits.add(from);

        getContentPane().add(credits, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GameMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel credits;
    private javax.swing.JLabel from;
    private javax.swing.JLabel gameName;
    private javax.swing.JPanel gameVersion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel license;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuGrid;
    private javax.swing.JLabel versionCodename;
    private javax.swing.JLabel versionNumber;
    // End of variables declaration//GEN-END:variables
}
