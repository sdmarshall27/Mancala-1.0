/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mancala.pkg1.pkg0;

import java.awt.Color;

/**
 *
 * @author mario
 */
public class GameSettings {
    
    private static GameSettings INSTANCE;
    
    private Color playerOneColor;
    private Color playerTwoColor;
    
    private GameSettings() {
        playerOneColor = new Color(204,255,255);
        playerTwoColor = new Color(255,204,204);
    }

    public Color getPlayerOneColor() {
        return playerOneColor;
    }

    public void setPlayerOneColor(Color playerOneColor) {
        this.playerOneColor = playerOneColor;
    }

    public Color getPlayerTwoColor() {
        return playerTwoColor;
    }

    public void setPlayerTwoColor(Color playerTwoColor) {
        this.playerTwoColor = playerTwoColor;
    }
    
    public static GameSettings getInstance() {
        
        if(INSTANCE == null) {
            INSTANCE = new GameSettings();
        }
        
        return INSTANCE;
    }
}
