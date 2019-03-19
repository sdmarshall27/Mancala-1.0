/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mancala.pkg1.pkg0;

/**
 *
 * @author Dung T Nguyen
 */
public class Game extends javax.swing.JPanel {

    private MainFrame mainBoard;
    private MancalaGame mancalaGame;
    private int scoreP1;
    private int scoreP2;

    
    public Game() 
    {
        initComponents();
    }
    
    public void setMainBoard(MainFrame mainBoard)
    {
        this.mainBoard = mainBoard;
        
    }
    
    public void setMancalaGame(MancalaGame mancalaGame)
    {
        this.mancalaGame = mancalaGame;
    }
    
    
    public Boolean getWinner(){
        Boolean success = false;
        if(mancalaGame.getPlayerOne().getEndGame() || mancalaGame.getPlayerTwo().getEndGame()){
            success = true;
            
            if(this.scoreP1 > this.scoreP2){
                this.winner.setText("Winner: Player One");
                updateButtonsP1(false);
                updateButtonsP2(false);
            } else if(this.scoreP1 < this.scoreP2){
                this.winner.setText("Winner: Player Two");
                updateButtonsP1(false);
                updateButtonsP2(false);
            } else if(this.scoreP1 == this.scoreP2){
                this.winner.setText("Draw Game");
                updateButtonsP1(false);
                updateButtonsP2(false);
            }
        }
        return success;
    }
    
    
    public void updateButtonsP1(Boolean success){
        this.p1PickButton0.setEnabled(success);
        this.p1PickButton1.setEnabled(success);
        this.p1PickButton2.setEnabled(success);
        this.p1PickButton3.setEnabled(success);
        this.p1PickButton4.setEnabled(success);
        this.p1PickButton5.setEnabled(success);
    }
    
    public void updateButtonsP2(Boolean success){
        this.p2PickButton0.setEnabled(success);
        this.p2PickButton1.setEnabled(success);
        this.p2PickButton2.setEnabled(success);
        this.p2PickButton3.setEnabled(success);
        this.p2PickButton4.setEnabled(success);
        this.p2PickButton5.setEnabled(success);
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
        this.p1Score.setText("" + this.scoreP1);
    }
    
    public void updateP2Score(){
        this.scoreP2 = 0;
        for(int i = 0; i < 7; i++ ){
            scoreP2 += mancalaGame.getPlayerTwo().slots.get(i).countStones();
        }
        this.p2Score.setText("" + this.scoreP2);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Score = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        p1Score = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        p2Score = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        winner = new javax.swing.JLabel();
        playerOneBank = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        p1Slot6 = new javax.swing.JLabel();
        playerTwoBank = new javax.swing.JPanel();
        p2Slot6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        playerSlots = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        p2PickButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        p2PickButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        p2PickButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        p2PickButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        p2PickButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        p2PickButton0 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        p1PickButton0 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        p1PickButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        p1PickButton2 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        p1PickButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        p1PickButton4 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        p1PickButton5 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        Score.setLayout(new java.awt.GridLayout(2, 4));

        jPanel15.setLayout(new java.awt.GridLayout(1, 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PLAYER ONE");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel20);

        p1Score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Score.setText("0");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1Score, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1Score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel19);

        p2Score.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Score.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2Score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p2Score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel18);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLAYER TWO");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel17);

        Score.add(jPanel15);

        winner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        winner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(winner, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        Score.add(jPanel13);

        add(Score, java.awt.BorderLayout.PAGE_START);

        playerOneBank.setLayout(new java.awt.GridLayout(2, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        playerOneBank.add(jPanel1);

        p1Slot6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p1Slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1Slot6.setText("bank1");
        p1Slot6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        playerOneBank.add(p1Slot6);

        add(playerOneBank, java.awt.BorderLayout.LINE_END);

        playerTwoBank.setLayout(new java.awt.GridLayout(2, 1));

        p2Slot6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p2Slot6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2Slot6.setText("jLabel2");
        p2Slot6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        playerTwoBank.add(p2Slot6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        playerTwoBank.add(jPanel8);

        add(playerTwoBank, java.awt.BorderLayout.LINE_START);

        playerSlots.setLayout(new java.awt.GridLayout(2, 6));

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton5.setText("Pick");
        p2PickButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(p2PickButton5);

        playerSlots.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton4.setText("Pick");
        p2PickButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(p2PickButton4);

        playerSlots.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton3.setText("Pick");
        p2PickButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(p2PickButton3);

        playerSlots.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton2.setText("Pick");
        p2PickButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(p2PickButton2);

        playerSlots.add(jPanel5);

        jPanel7.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton1.setText("Pick");
        p2PickButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(p2PickButton1);

        playerSlots.add(jPanel7);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        p2PickButton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p2PickButton0.setText("Pick");
        p2PickButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2PickButton0ActionPerformed(evt);
            }
        });
        jPanel6.add(p2PickButton0);

        playerSlots.add(jPanel6);

        jPanel9.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton0.setText("Pick");
        p1PickButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton0ActionPerformed(evt);
            }
        });
        jPanel9.add(p1PickButton0);

        playerSlots.add(jPanel9);

        jPanel10.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton1.setText("Pick");
        p1PickButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(p1PickButton1);

        playerSlots.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton2.setText("Pick");
        p1PickButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton2ActionPerformed(evt);
            }
        });
        jPanel11.add(p1PickButton2);

        playerSlots.add(jPanel11);

        jPanel12.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton3.setText("Pick");
        p1PickButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(p1PickButton3);

        playerSlots.add(jPanel12);

        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton4.setText("Pick");
        p1PickButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(p1PickButton4);

        playerSlots.add(jPanel14);

        jPanel16.setLayout(new java.awt.GridLayout(2, 1));

        p1PickButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p1PickButton5.setText("Pick");
        p1PickButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1PickButton5ActionPerformed(evt);
            }
        });
        jPanel16.add(p1PickButton5);

        playerSlots.add(jPanel16);

        add(playerSlots, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void p1PickButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton0ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(0, mancalaGame.getPlayerOne().slots.get(0));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton0ActionPerformed

    private void p1PickButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton1ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(1, mancalaGame.getPlayerOne().slots.get(1));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton1ActionPerformed

    private void p1PickButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton2ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(2, mancalaGame.getPlayerOne().slots.get(2));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton2ActionPerformed

    private void p1PickButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton3ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(3, mancalaGame.getPlayerOne().slots.get(3));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton3ActionPerformed

    private void p1PickButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton4ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(4, mancalaGame.getPlayerOne().slots.get(4));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton4ActionPerformed

    private void p1PickButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1PickButton5ActionPerformed
        mancalaGame.getPlayerOne().moveStonesAround(5, mancalaGame.getPlayerOne().slots.get(5));
        getWinner();
        if(!getWinner()){
            updateButtonsP1(mancalaGame.getPlayerOne().getBonusTurn());
            updateButtonsP2(!mancalaGame.getPlayerOne().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p1PickButton5ActionPerformed

    private void p2PickButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton0ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(0, mancalaGame.getPlayerTwo().slots.get(0));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton0ActionPerformed

    private void p2PickButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton1ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(1, mancalaGame.getPlayerTwo().slots.get(1));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton1ActionPerformed

    private void p2PickButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton2ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(2, mancalaGame.getPlayerTwo().slots.get(2));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton2ActionPerformed

    private void p2PickButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton3ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(3, mancalaGame.getPlayerTwo().slots.get(3));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton3ActionPerformed

    private void p2PickButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton4ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(4, mancalaGame.getPlayerTwo().slots.get(4));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton4ActionPerformed

    private void p2PickButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2PickButton5ActionPerformed
        mancalaGame.getPlayerTwo().moveStonesAround(5, mancalaGame.getPlayerTwo().slots.get(5));
        getWinner();
        if(!getWinner()){    
            updateButtonsP1(!mancalaGame.getPlayerTwo().getBonusTurn());
            updateButtonsP2(mancalaGame.getPlayerTwo().getBonusTurn());
            updateStonesForPlayerOne();
            updateStonesForPlayerTwo();
            updateP1Score();
            updateP2Score();
        }
        
    }//GEN-LAST:event_p2PickButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Score;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton p1PickButton0;
    private javax.swing.JButton p1PickButton1;
    private javax.swing.JButton p1PickButton2;
    private javax.swing.JButton p1PickButton3;
    private javax.swing.JButton p1PickButton4;
    private javax.swing.JButton p1PickButton5;
    private javax.swing.JLabel p1Score;
    private javax.swing.JLabel p1Slot6;
    private javax.swing.JButton p2PickButton0;
    private javax.swing.JButton p2PickButton1;
    private javax.swing.JButton p2PickButton2;
    private javax.swing.JButton p2PickButton3;
    private javax.swing.JButton p2PickButton4;
    private javax.swing.JButton p2PickButton5;
    private javax.swing.JLabel p2Score;
    private javax.swing.JLabel p2Slot6;
    private javax.swing.JPanel playerOneBank;
    private javax.swing.JPanel playerSlots;
    private javax.swing.JPanel playerTwoBank;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
