package me.chaounne.conansmp.conancard.combat;

import me.chaounne.conansmp.conancard.cards.Villageois;
import me.chaounne.conansmp.conancard.player.GamePlayer;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Duel implements Listener {

    GamePlayer j1;
    GamePlayer j2;
    boolean isFinished;
    Inventory board;

    private int turn;
    private HashMap<GamePlayer, ItemStack> cards = new HashMap<GamePlayer, ItemStack>();

    public Duel(GamePlayer j1, GamePlayer j2){
        this.j1 = j1;
        this.j2 = j2;
        this.isFinished = false;
        this.turn = 0;
        board = Bukkit.createInventory(null, 27+9, j1.getPlayer().getName() + " vs " + j2.getPlayer().getName());
        board.setItem(4, new ItemStackBuilder(Material.CHAIN).setName("Délimitation").setLore("Limite du terrain").getItemStack());
        board.setItem(13, new ItemStackBuilder(Material.CHAIN).setName("Délimitation").setLore("Limite du terrain").getItemStack());
        board.setItem(22, new ItemStackBuilder(Material.CHAIN).setName("Délimitation").setLore("Limite du terrain").getItemStack());
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

    public void startGame (){
        j1.getPlayer().openInventory(board);
        j2.getPlayer().openInventory(board);
        isFinished = false;

        Bukkit.getPluginManager().registerEvents(this, Bukkit.getPluginManager().getPlugin("ConanSMP"));
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().equals(board)) { // check if the clicked inventory is the Duel board
            ItemStack clickedItem = event.getCurrentItem();
            if (clickedItem != null && clickedItem.getType() == Material.CHAIN) { // check if the clicked item is a chain
                event.setCancelled(true); // cancel the event to prevent the player from taking the chain
            }
        }
    }

    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        if (event.getInventory().equals(board)) {
            if(!isFinished){
                j1.getPlayer().closeInventory();
                j2.getPlayer().closeInventory();
                isFinished = true;
            }
        }
    }

    public void getMonsterCards(){
        cards.put(j1, board.getItem(2));
        cards.put(j1, board.getItem(11));
        cards.put(j1, board.getItem(20));
        cards.put(j2, board.getItem(6));
        cards.put(j2, board.getItem(15));
        cards.put(j2, board.getItem(24));
    }
}
