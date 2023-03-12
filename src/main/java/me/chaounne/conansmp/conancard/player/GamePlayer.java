package me.chaounne.conansmp.conancard.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.HashMap;
import java.util.UUID;

public class GamePlayer{

    private GamePlayer instance;

    private Player player;

    private int pv;

    private static HashMap<UUID, GamePlayer> players = new HashMap<>();

    private GamePlayer(Player player) {
        this.pv = 100;
        this.player = player;
    }

    public static GamePlayer getInstance(Player p) {
        UUID playerUUID = p.getUniqueId();
        if (!players.containsKey(playerUUID)) {

            players.put(playerUUID, new GamePlayer(p));
        }
        return players.get(playerUUID);
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
