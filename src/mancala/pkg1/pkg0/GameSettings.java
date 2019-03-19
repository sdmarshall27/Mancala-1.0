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
    
    public static Color DEFAULT_PLAYER_ONE_COLOR = new Color(153, 255, 255);
    public static Color DEFAULT_PLAYER_TWO_COLOR = new Color(255, 153, 153);
    
    private Color playerOneColor;
    private Color playerTwoColor;
    private Boolean doRandomGame = true;
    private Boolean firstMove = true;

    public Boolean getFirstMove() {
        return firstMove;
    }

    public void setFirstMove(Boolean firstMove) {
        this.firstMove = firstMove;
    }

    public Boolean getDoRandomGame() {
        return doRandomGame;
    }

    public void setDoRandomGame(Boolean doRandomGame) {
        this.doRandomGame = doRandomGame;
    }
    
    private GameSettings() {
        playerOneColor = DEFAULT_PLAYER_ONE_COLOR;
        playerTwoColor = DEFAULT_PLAYER_TWO_COLOR;
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
