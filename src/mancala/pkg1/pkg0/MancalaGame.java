
package mancala.pkg1.pkg0;

public class MancalaGame {
    private Player playerOne;
    private Player playerTwo;
    
    
//    public static void main(String[] args) {
//            Mancala mancala = new Mancala();
//            mancala.start();
//    }

    public void start() 
    {
        
    }
    
    public MancalaGame(){
        playerOne = new Player();
        playerTwo = new Player();
        
        playerOne.setOpponent(playerTwo);
        playerTwo.setOpponent(playerOne);
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }
    
}
