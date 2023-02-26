package me.chaounne.conansmp.conancard.player;

import org.bukkit.entity.Player;

public class GamePlayer {

    private GamePlayer instance;

    private Player player;

    private int pv;

    public GamePlayer(Player player) {
        this.pv = 100;
        this.player = player;
    }

    public GamePlayer getInstance(Player p) {
        if (instance == null) {
            instance = new GamePlayer(p);
        }
        return instance;
    }

    public void removePv(int pv){
        this.pv -= pv;
    }

    public int getPv(){
        return pv;
    }

    public Player getPlayer(){
        return player;
    }

    public void setPv(int pv){
        this.pv = pv;
    }

    public void resetPv(){
        this.pv = 100;
    }

    public boolean isDead(){
        return pv <= 0;
    }

    public void setDead(){
        this.pv = 0;
    }
}
