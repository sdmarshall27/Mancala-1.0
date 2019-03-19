/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mancala.pkg1.pkg0;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Dung T Nguyen
 */
public class GameBoardPanel extends javax.swing.JPanel {

    private MainFrame mainFrame;
    private MancalaGame mancalaGame;
    private int scoreP1;
    private int scoreP2;
    
    private final GameSettings gameSettings = GameSettings.getInstance();

    
    public GameBoardPanel(MainFrame mainFrame) 
    {
        initComponents();
        boolean firstMove;
                
        this.mainFrame = mainFrame;
        mancalaGame = new MancalaGame();
        
        if(gameSettings.getDoRandomGame()) {
            Random random = new Random();
            firstMove = random.nextBoolean();
        } else {
            firstMove = gameSettings.getFirstMove();
        }
        
        updatePlayerOneButtonState(firstMove);
        updatePlayerTwoButtonState(!firstMove);
        
        initializeDisplay();
        
    }
    
    public void setMainFrame(MainFrame mainFrame)
    {
        this.mainFrame = mainFrame;
        
    }
    
    public Boolean displayWinner(){
        Boolean success = false;
        if(mancalaGame.getPlayerOne().getEndGame() || mancalaGame.getPlayerTwo().getEndGame()){
            success = true;
            
            if(this.scoreP1 > this.scoreP2){
                this.winnerLabel.setText("A Winner is PLAYER ONE");
                this.winnerLabel.setForeground(gameSettings.getPlayerOneColor());
            } else if(this.scoreP1 < this.scoreP2){
                this.winnerLabel.setText("A Winner is PLAYER TWO");
                this.winnerLabel.setForeground(gameSettings.getPlayerTwoColor());
            } else {
                this.winnerLabel.setText("Draw Game");
            }
            
            updatePlayerOneButtonState(false);
            updatePlayerTwoButtonState(false);            
        }
        return success;
    }
    
    
    public void updatePlayerOneButtonState(Boolean isEnabled){
        this.p1PickButton0.setEnabled(isEnabled);
        this.p1PickButton1.setEnabled(isEnabled);
        this.p1PickButton2.setEnabled(isEnabled);
        this.p1PickButton3.setEnabled(isEnabled);
        this.p1PickButton4.setEnabled(isEnabled);
        this.p1PickButton5.setEnabled(isEnabled);
    }
    
    public void updatePlayerTwoButtonState(Boolean isEnabled){
        this.p2PickButton0.setEnabled(isEnabled);
        this.p2PickButton1.setEnabled(isEnabled);
        this.p2PickButton2.setEnabled(isEnabled);
        this.p2PickButton3.setEnabled(isEnabled);
        this.p2PickButton4.setEnabled(isEnabled);
        this.p2PickButton5.setEnabled(isEnabled);
    }
    
    public void updateStonesForPlayerOne(){
        this.p1PickButton0.setText("" + mancalaGame.getPlayerOne().slots.get(0).countStones());
        this.p1PickButton1.setText("" + mancalaGame.getPlayerOne().slots.get(1).countStones());
        this.p1PickButton2.setText("" + mancalaGame.getPlayerOne().slots.get(2).countStones());
        this.p1PickButton3.setText("" + mancalaGame.getPlayerOne().slots.get(3).countStones());
        this.p1PickButton4.setText("" + mancalaGame.getPlayerOne().slots.get(4).countStones());
        this.p1PickButton5.setText("" + mancalaGame.getPlayerOne().slots.get(5).countStones());
        this.p1Slot6.setText("" + mancalaGame.getPlayerOne().slots.get(6).countStones());
    }
    
    public void updateStonesForPlayerTwo(){
        this.p2PickButton0.setText("" + mancalaGame.getPlayerTwo().slots.get(0).countStones());
        this.p2PickButton1.setText("" + mancalaGame.getPlayerTwo().slots.get(1).countStones());
        this.p2PickButton2.setText("" + mancalaGame.getPlayerTwo().slots.get(2).countStones());
        this.p2PickButton3.setText("" + mancalaGame.getPlayerTwo().slots.get(3).countStones());
        this.p2PickButton4.setText("" + mancalaGame.getPlayerTwo().slots.get(4).countStones());
        this.p2PickButton5.setText("" + mancalaGame.getPlayerTwo().slots.get(5).countStones());
        this.p2Slot6.setText("" + mancalaGame.getPlayerTwo().slots.get(6).countStones());
    }
    
    public void updateP1Score(){
        this.scoreP1 = 0;
        for(int i = 0; i < 7; i++ ){
            scoreP1 += mancalaGame.getPlayerOne().slots.get(i).countStones();
        }
        this.playerOneScoreLabel.setText("" + this.scoreP1);
    }
    
    public void updateP2Score(){
        this.scoreP2 = 0;
        for(int i = 0; i < 7; i++ ){
            scoreP2 += mancalaGame.getPlayerTwo().slots.get(i).countStones();
        }
        this.playerTwoScoreLabel.setText("" + this.scoreP2);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headsUpDisplayPanel = new javax.swing.JPanel();
        scorePanel = new javax.swing.JPanel();
        playerTwoTextLabel = new javax.swing.JLabel();
        playerTwoScoreLabel = new javax.swing.JLabel();
        playerOneScoreLabel = new javax.swing.JLabel();
        playerOneTextLabel = new javax.swing.JLabel();
        winnerPanel = new javax.swing.JPanel();
        winnerLabel = new javax.swing.JLabel();
        playerOneBank = new javax.swing.JPanel();
        p1Slot6 = new javax.swing.JLabel();
        playerTwoBank = new javax.swing.JPanel();
        p2Slot6 = new javax.swing.JLabel();
        playerSlots = new javax.swing.JPanel();
        playerTwoButtonsPanel = new javax.swing.JPanel();
        p2PickButton5 = new javax.swing.JButton();
        p2PickButton4 = new javax.swing.JButton();
        p2PickButton3 = new javax.swing.JButton();
        p2PickButton2 = new javax.swing.JButton();
        p2PickButton1 = new javax.swing.JButton();
        p2PickButton0 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        playerOneButtonsPanel = new javax.swing.JPanel();
        p1PickButton0 = new javax.swing.JButton();
        p1PickButton1 = new javax.swing.JButton();
        p1PickButton2 = new javax.swing.JButton();
        p1PickButton3 = new javax.swing.JButton();
        p1PickButton4 = new javax.swing.JButton();
        p1PickButton5 = new javax.swing.JButton();
        gameActionPanel = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel2 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        newGameButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new java.awt.BorderLayout());

        headsUpDisplayPanel.setLayout(new java.awt.GridLayout(2, 4));

        scorePanel.setBackground(new java.awt.Color(153, 153, 153));
        scorePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        scorePanel.setLayout(new java.awt.GridLayout(1, 4));

        playerTwoTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerTwoTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTwoTextLabel.setText("PLAYER TWO");
        scorePanel.add(playerTwoTextLabel);

        playerTwoScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerTwoScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTwoScoreLabel.setText("0");
        scorePanel.add(playerTwoScoreLabel);

        playerOneScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        playerOneScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerOneScoreLabel.setText("0");
        scorePanel.add(playerOneScoreLabel);

        playerOneTextLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerOneTextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerOneTextLabel.setText("PLAYER ONE");
        scorePanel.add(playerOneTextLabel);

        headsUpDisplayPanel.add(scorePanel);

        winnerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        winnerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout winnerPanelLayout = new javax.swing.GroupLayout(winnerPanel);
        winnerPanel.setLayout(winnerPanelLayout);
        winnerPanelLayout.setHorizontalGroup(
            winnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winnerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        winnerPanelLayout.setVerticalGroup(
            winnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winnerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        headsUpDisplayPanel.add(winnerPanel);

        add(headsUpDisplayPanel, java.awt.BorderLayout.PAGE_START);

        playerOneBank.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerOneBank.setPreferredSize(new java.awt.Dimension(73, 29));
        playerOneBank.setLayout(new java.awt.GridLayout(1, 1));

        p1Slot6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p1Slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Slot6.setText("bank1");
        playerOneBank.add(p1Slot6);

        add(playerOneBank, java.awt.BorderLayout.LINE_END);

        playerTwoBank.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playerTwoBank.setPreferredSize(new java.awt.Dimension(73, 29));
        playerTwoBank.setLayout(new java.awt.GridLayout(1, 1));

        p2Slot6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p2Slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Slot6.setText("jLabel2");
        playerTwoBank.add(p2Slot6);

        add(playerTwoBank, java.awt.BorderLayout.LINE_START);

        playerSlots.setLayout(new java.awt.GridLayout(3, 1));

        playerTwoButtonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        p2PickButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton5.setText("Pick");
        p2PickButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton5ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton5);

        p2PickButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton4.setText("Pick");
        p2PickButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton4ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton4);

        p2PickButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton3.setText("Pick");
        p2PickButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton3ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton3);

        p2PickButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton2.setText("Pick");
        p2PickButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton2ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton2);

        p2PickButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton1.setText("Pick");
        p2PickButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton1ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton1);

        p2PickButton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton0.setText("Pick");
        p2PickButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton0ActionPerformed(evt);
            }
        });
        playerTwoButtonsPanel.add(p2PickButton0);

        playerSlots.add(playerTwoButtonsPanel);
        playerSlots.add(filler3);

        playerOneButtonsPanel.setLayout(new java.awt.GridLayout(1, 0));

        p1PickButton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton0.setText("Pick");
        p1PickButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton0ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton0);

        p1PickButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton1.setText("Pick");
        p1PickButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton1ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton1);

        p1PickButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton2.setText("Pick");
        p1PickButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton2ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton2);

        p1PickButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton3.setText("Pick");
        p1PickButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton3ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton3);

        p1PickButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton4.setText("Pick");
        p1PickButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton4ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton4);

        p1PickButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton5.setText("Pick");
        p1PickButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton5ActionPerformed(evt);
            }
        });
        playerOneButtonsPanel.add(p1PickButton5);

        playerSlots.add(playerOneButtonsPanel);

        add(playerSlots, java.awt.BorderLayout.CENTER);

        gameActionPanel.setMinimumSize(new java.awt.Dimension(0, 126));
        gameActionPanel.setPreferredSize(new java.awt.Dimension(872, 126));
        gameActionPanel.setLayout(new java.awt.GridLayout(2, 0));
        gameActionPanel.add(filler4);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new java.awt.GridLayout(1, 3));
        jPanel2.add(filler2);

        newGameButton.setText("New Game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });
        jPanel2.add(newGameButton);

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });
        jPanel2.add(mainMenuButton);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton);
        jPanel2.add(filler1);

        gameActionPanel.add(jPanel2);

        add(gameActionPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void p1PickButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton0ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(0, mancalaGame.getPlayerOne().slots.get(0));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton0ActionPerformed

    private void p1PickButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton1ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(1, mancalaGame.getPlayerOne().slots.get(1));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton1ActionPerformed

    private void p1PickButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton2ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(2, mancalaGame.getPlayerOne().slots.get(2));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton2ActionPerformed

    private void p1PickButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton3ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(3, mancalaGame.getPlayerOne().slots.get(3));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton3ActionPerformed

    private void p1PickButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton4ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(4, mancalaGame.getPlayerOne().slots.get(4));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton4ActionPerformed

    private void p1PickButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton5ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(5, mancalaGame.getPlayerOne().slots.get(5));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(mancalaGame.getPlayerOne().getBonusTurn());
        updatePlayerTwoButtonState(!mancalaGame.getPlayerOne().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p1PickButton5ActionPerformed

    private void p2PickButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton0ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(0, mancalaGame.getPlayerTwo().slots.get(0));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
        
    }//GEN-LAST:event_p2PickButton0ActionPerformed

    private void p2PickButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton1ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(1, mancalaGame.getPlayerTwo().slots.get(1));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p2PickButton1ActionPerformed

    private void p2PickButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton3ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(3, mancalaGame.getPlayerTwo().slots.get(3));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p2PickButton3ActionPerformed

    private void p2PickButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton4ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(4, mancalaGame.getPlayerTwo().slots.get(4));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p2PickButton4ActionPerformed

    private void p2PickButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton5ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(5, mancalaGame.getPlayerTwo().slots.get(5));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p2PickButton5ActionPerformed

    private void p2PickButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton2ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(2, mancalaGame.getPlayerTwo().slots.get(2));
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerOneButtonState(!mancalaGame.getPlayerTwo().getBonusTurn());
        updatePlayerTwoButtonState(mancalaGame.getPlayerTwo().getBonusTurn());
        displayWinner();
    }//GEN-LAST:event_p2PickButton2ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        mainFrame.remove(this);
        mainFrame.setMainMenu();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        mainFrame.remove(this);
        mainFrame.playGame();
    }//GEN-LAST:event_newGameButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel gameActionPanel;
    private javax.swing.JPanel headsUpDisplayPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton p1PickButton0;
    private javax.swing.JButton p1PickButton1;
    private javax.swing.JButton p1PickButton2;
    private javax.swing.JButton p1PickButton3;
    private javax.swing.JButton p1PickButton4;
    private javax.swing.JButton p1PickButton5;
    private javax.swing.JLabel p1Slot6;
    private javax.swing.JButton p2PickButton0;
    private javax.swing.JButton p2PickButton1;
    private javax.swing.JButton p2PickButton2;
    private javax.swing.JButton p2PickButton3;
    private javax.swing.JButton p2PickButton4;
    private javax.swing.JButton p2PickButton5;
    private javax.swing.JLabel p2Slot6;
    private javax.swing.JPanel playerOneBank;
    private javax.swing.JPanel playerOneButtonsPanel;
    private javax.swing.JLabel playerOneScoreLabel;
    private javax.swing.JLabel playerOneTextLabel;
    private javax.swing.JPanel playerSlots;
    private javax.swing.JPanel playerTwoBank;
    private javax.swing.JPanel playerTwoButtonsPanel;
    private javax.swing.JLabel playerTwoScoreLabel;
    private javax.swing.JLabel playerTwoTextLabel;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JLabel winnerLabel;
    private javax.swing.JPanel winnerPanel;
    // End of variables declaration//GEN-END:variables

    private void updatePlayerColors() {
        Color playerTwoColor = gameSettings.getPlayerTwoColor();
        Color playerOneColor = gameSettings.getPlayerOneColor();
        
        
        updatePlayerTwoButtonColors(playerTwoColor);    
        playerTwoBank.setBackground(playerTwoColor);
        playerTwoTextLabel.setForeground(playerTwoColor);
        playerTwoScoreLabel.setForeground(playerTwoColor);
        
        updatePlayerOneButtonColors(playerOneColor);
        playerOneBank.setBackground(playerOneColor);
        playerOneTextLabel.setForeground(playerOneColor);
        playerOneScoreLabel.setForeground(playerOneColor);
    }

    private void updatePlayerTwoButtonColors(Color playerTwoColor) {
        p2PickButton0.setBackground(playerTwoColor);
        p2PickButton1.setBackground(playerTwoColor);
        p2PickButton2.setBackground(playerTwoColor);
        p2PickButton3.setBackground(playerTwoColor);
        p2PickButton4.setBackground(playerTwoColor);
        p2PickButton5.setBackground(playerTwoColor);
    }

    private void updatePlayerOneButtonColors(Color playerOneColor) {
        p1PickButton0.setBackground(playerOneColor);
        p1PickButton1.setBackground(playerOneColor);
        p1PickButton2.setBackground(playerOneColor);
        p1PickButton3.setBackground(playerOneColor);
        p1PickButton4.setBackground(playerOneColor);
        p1PickButton5.setBackground(playerOneColor);
    }
    
    private void initializeDisplay() {
        updateStonesForPlayerOne();
        updateStonesForPlayerTwo();
        updateP1Score();
        updateP2Score();
        updatePlayerColors();
    }
}
