
package mancala.pkg1.pkg0;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public  List <Slot> slots;
    private Player opponent;
    private Boolean bonusTurn;
    private Boolean endGame;

    public Player(){
        this.slots = new ArrayList();
        this.bonusTurn = false;
        this.endGame = false;
        initializeSlots();
        this.slots.get(6).cleanStones();
    }
    
    public void initializeSlots(){
        for(int i = 0; i < 7; i++){
            Slot slot = new Slot();
            this.slots.add(slot);
        }
    }
    
//    public void addSlot(Slot slot){
//        this.slots.add(slot);
//    }
       
    public void setOpponent(Player opponent){
        this.opponent = opponent;
    }

    public Boolean getEndGame() {
        return endGame;
    }

    public void addStoneToSlot(int indexSlot, Stone stone){
        this.slots.get(indexSlot).addStone(stone);
    }
    
    public void moveStonesAround(int position, Slot slot){
        int opponentPosition = 0;
        Slot tempSlot = new Slot();
        tempSlot.cleanStones();
        for(int i = 0; i < slot.countStones(); i++){
            Stone stone = new Stone();
            tempSlot.addStone(stone);
        }
        if(this.slots.get(position).countStones() != 0){
            slot.cleanStones();
            for (int i = 0; i < tempSlot.countStones(); i++){
                if(position < 6){
                    position++;
                    addStoneToSlot(position, tempSlot.getStoneByIndex(i));
                    setBonusTurn(i, tempSlot.countStones(), position);
                } else if(position == 6) {
                    if(opponentPosition < 6){
                        opponent.addStoneToSlot(opponentPosition, tempSlot.getStoneByIndex(i));
                        opponentPosition++;
                    } else if(opponentPosition == 6) {
                        position = 0;
                        addStoneToSlot(position, tempSlot.getStoneByIndex(i));
                    }    
                }
                
            }
            winningStones(position);
            isEndGame();
            
        } else bonusTurn = true;

        
    }
    
    public void isEndGame(){
        Integer emptySlotsP1 = 0;
        Integer emptySlotsP2 = 0;
        for(int i = 0; i < 6; i++){
            if(this.slots.get(i).countStones() == 0){
                emptySlotsP1++;
            } else;
        }
        for (int j = 0; j < 6; j++){
            if (this.opponent.slots.get(j).countStones() == 0){
                emptySlotsP2++;
            }else;  
        } 
        if(emptySlotsP1 == 6 || emptySlotsP2 == 6){
            this.endGame = true;
        }
        
    }
    
    public void winningStones(int position){
        if (position != 6 && this.slots.get(position).countStones() == 1
            && this.opponent.slots.get(5-position).countStones() != 0){
                addStoneToSlot(6, this.slots.get(position).getStoneByIndex(0));
                takingStonesFromOpponent(position);
                this.slots.get(position).cleanStones();
                this.opponent.slots.get(5-position).cleanStones();
        } 
    }
    
    public  void setBonusTurn(int index, int count, int position){
        isEndGame();
        if(!getEndGame()){
            if(index == count - 1 && position == 6){
            this.bonusTurn = true;
            }else this.bonusTurn = false; 
        }

    }

    public Boolean getBonusTurn() {
        return this.bonusTurn;
    }
    
    public void takingStonesFromOpponent(int position){
        for(int j = 0; j < this.opponent.slots.get(5-position).countStones(); j++ ){
            addStoneToSlot(6, this.opponent.slots.get(5-position).getStoneByIndex(j));
        }
    }
}
