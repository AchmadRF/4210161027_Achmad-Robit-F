/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;
import java.io.Serializable;
/**
 *
 * @author Lenovo
 */

public class Player implements Serializable{
    private int ID_Player;
    private int X_position;
    private int Y_position;
    private float time;
    
    Player(int ID_Player, int X_position, int Y_position, float time){
        this.ID_Player = ID_Player;
        this.X_position = X_position;
        this.Y_position = Y_position;
        this.time = time;
    }
    public int getID(){
        return ID_Player;
    }
    public int getPosX(){
        return X_position;
    }
    public int getPosY(){
        return Y_position;
    }
    public float getTime(){
        return time;
    }  
}
