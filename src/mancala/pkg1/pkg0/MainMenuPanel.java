/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mancala.pkg1.pkg0;

import mancala.pkg1.pkg0.MainFrame;

/**
 *
 * @author Dung T Nguyen
 */
public class MainMenuPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    
    public MainMenuPanel(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }
    
    public void setMainFrame(MainFrame mainFrame){
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutMancalaDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        rulesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        applicationInfoPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        menuTitlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        menuButtonsPanel = new javax.swing.JPanel();
        playGameButton = new javax.swing.JButton();
        aboutMancalaButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        aboutMancalaDialog.setTitle("About THE MANCALA EFFECT");
        aboutMancalaDialog.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        aboutMancalaDialog.setResizable(false);
        aboutMancalaDialog.setSize(500, 400);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        rulesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "RULES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        rulesPanel.setLayout(new java.awt.GridLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Mancala is one of the oldest games still played today. Click on one of the pockets to move rocks counterclockwise throughout the board. If the rocks end in your bank, you get another turn. If the last rock is placed in an empty pocket on your side, you get to steal the rocks in the slot across from it. Go forth and save the world through the power of Mancala!");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        rulesPanel.add(jScrollPane1);

        jPanel1.add(rulesPanel);

        applicationInfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "About", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        applicationInfoPanel.setLayout(new java.awt.GridLayout());

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("The Mancala Effect v1.0\n\nDeveloped By:\n\nTuan Dung, Glenn Gray, Nicholas Hazelton, Aniket Singh, Subham Singh, Steven Marshall, Sam Bartrug");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea2);

        applicationInfoPanel.add(jScrollPane2);

        jPanel1.add(applicationInfoPanel);

        aboutMancalaDialog.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setLayout(new java.awt.BorderLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("The Mancala Effect");

        javax.swing.GroupLayout menuTitlePanelLayout = new javax.swing.GroupLayout(menuTitlePanel);
        menuTitlePanel.setLayout(menuTitlePanelLayout);
        menuTitlePanelLayout.setHorizontalGroup(
            menuTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        menuTitlePanelLayout.setVerticalGroup(
            menuTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );

        add(menuTitlePanel, java.awt.BorderLayout.PAGE_START);

        menuButtonsPanel.setLayout(new java.awt.GridLayout(4, 1));

        playGameButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playGameButton.setText("Play Game");
        playGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playGameButtonActionPerformed(evt);
            }
        });
        menuButtonsPanel.add(playGameButton);

        aboutMancalaButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aboutMancalaButton.setText("About Mancala");
        aboutMancalaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMancalaButtonActionPerformed(evt);
            }
        });
        menuButtonsPanel.add(aboutMancalaButton);

        optionsButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        optionsButton.setText("Options");
        menuButtonsPanel.add(optionsButton);

        exitButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        menuButtonsPanel.add(exitButton);

        add(menuButtonsPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void playGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playGameButtonActionPerformed
        this.mainFrame.playGame();
    }//GEN-LAST:event_playGameButtonActionPerformed

    private void aboutMancalaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMancalaButtonActionPerformed
        aboutMancalaDialog.setVisible(true);
    }//GEN-LAST:event_aboutMancalaButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutMancalaButton;
    private javax.swing.JDialog aboutMancalaDialog;
    private javax.swing.JPanel applicationInfoPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel menuButtonsPanel;
    private javax.swing.JPanel menuTitlePanel;
    private javax.swing.JButton optionsButton;
    private javax.swing.JButton playGameButton;
    private javax.swing.JPanel rulesPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables


}
