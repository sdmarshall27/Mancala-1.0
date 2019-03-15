/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mancala.pkg1.pkg0;

/**
 *
 * @author mario
 */
public class GameBoardPanel extends javax.swing.JPanel {

    /**
     * Creates new form GameBoardPanel
     */
    public GameBoardPanel() {
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

        leftBankPanel = new javax.swing.JPanel();
        playerTwoBank = new javax.swing.JButton();
        rightBankPanel = new javax.swing.JPanel();
        playerOneBank = new javax.swing.JButton();
        pocketsPanel = new javax.swing.JPanel();
        playerTwoPocketsPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        playerOnePocketsPanel = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        leftBankPanel.setLayout(new java.awt.GridLayout(1, 0));

        playerTwoBank.setBackground(new java.awt.Color(255, 204, 204));
        playerTwoBank.setText("jButton1");
        leftBankPanel.add(playerTwoBank);

        add(leftBankPanel, java.awt.BorderLayout.LINE_START);

        rightBankPanel.setLayout(new java.awt.GridLayout(1, 0));

        playerOneBank.setBackground(new java.awt.Color(204, 255, 255));
        playerOneBank.setText("jButton2");
        playerOneBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerOneBankActionPerformed(evt);
            }
        });
        rightBankPanel.add(playerOneBank);

        add(rightBankPanel, java.awt.BorderLayout.LINE_END);

        pocketsPanel.setLayout(new java.awt.GridLayout(2, 1));

        playerTwoPocketsPanel.setLayout(new java.awt.GridLayout(1, 0));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setText("jButton3");
        playerTwoPocketsPanel.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setText("jButton4");
        playerTwoPocketsPanel.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setText("jButton5");
        playerTwoPocketsPanel.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setText("jButton6");
        playerTwoPocketsPanel.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setText("jButton7");
        playerTwoPocketsPanel.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 204, 204));
        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        playerTwoPocketsPanel.add(jButton8);

        pocketsPanel.add(playerTwoPocketsPanel);

        playerOnePocketsPanel.setLayout(new java.awt.GridLayout(1, 0));

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setText("jButton9");
        playerOnePocketsPanel.add(jButton9);

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setText("jButton13");
        playerOnePocketsPanel.add(jButton13);

        jButton12.setBackground(new java.awt.Color(204, 255, 255));
        jButton12.setText("jButton12");
        playerOnePocketsPanel.add(jButton12);

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setText("jButton10");
        playerOnePocketsPanel.add(jButton10);

        jButton14.setBackground(new java.awt.Color(204, 255, 255));
        jButton14.setText("jButton14");
        playerOnePocketsPanel.add(jButton14);

        jButton11.setBackground(new java.awt.Color(204, 255, 255));
        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        playerOnePocketsPanel.add(jButton11);

        pocketsPanel.add(playerOnePocketsPanel);

        add(pocketsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void playerOneBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerOneBankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerOneBankActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel leftBankPanel;
    private javax.swing.JButton playerOneBank;
    private javax.swing.JPanel playerOnePocketsPanel;
    private javax.swing.JButton playerTwoBank;
    private javax.swing.JPanel playerTwoPocketsPanel;
    private javax.swing.JPanel pocketsPanel;
    private javax.swing.JPanel rightBankPanel;
    // End of variables declaration//GEN-END:variables
}
