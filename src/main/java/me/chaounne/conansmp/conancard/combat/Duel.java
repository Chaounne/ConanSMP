package me.chaounne.conansmp.conancard.combat;

import me.chaounne.conansmp.conancard.player.GamePlayer;
import org.bukkit.entity.Player;

public class Duel {

    GamePlayer j1;
    GamePlayer j2;
    boolean isFinished;

    public Duel(GamePlayer j1, GamePlayer j2){
        this.j1 = j1;
        this.j2 = j2;
        this.isFinished = false;
    }

    public void removePv(Player player, int pv){
        if(player == j1){
            j1.setPv(j1.getPv() - pv);
        }else if(player == j2){
            j2.setPv(j2.getPv() - pv);
        }
        if(j1.getPv() <= 0 || j2.getPv() <= 0){
            isFinished = true;
        }
    }

    public boolean isFinished(){
        return isFinished;
    }

    public GamePlayer getWinner(){
        if(j2.getPv() <= 0){
            return j1;
        }else{
            return j2;
        }
    }

    public GamePlayer getLoser(){
        if(j2.getPv() <= 0){
            return j2;
        }else{
            return j1;
        }
    }

    public GamePlayer getJ1(){
        return j1;
    }

    public GamePlayer getJ2(){
        return j2;
    }
}
