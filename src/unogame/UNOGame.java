/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import uno.game;
import uno.player;

/**
 *
 * @author Administrator
 */
public class UNOGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         game UNO = new game();
        player P1 = new player("P1");
        player P2 = new player("P2");
        player P3 = new player("P3");
        player P4 = new player("P4");
        player P5 = new player("P5");
        UNO.AddPlayer(P1);
        UNO.AddPlayer(P2);
        UNO.AddPlayer(P3);
        UNO.AddPlayer(P4);
        UNO.AddPlayer(P5);
        
        for(int i=0;i<7;i++){
            for(player e:UNO.getGamePlayer()){
                UNO.TakeCard(e);
            }
        }
        
        for(player e:UNO.getGamePlayer()){
            e.PlayerInfo();
        }
        
        System.out.println("Rest CardNumber = "+ UNO.CardNumber());

        
        // TODO code application logic here
    }
    
}
