package me.chaounne.conansmp.conancard.inv;

import me.chaounne.conansmp.conancard.combat.Duel;
import me.chaounne.conansmp.conancard.player.GamePlayer;
import me.chaounne.conansmp.morpion.Morpion;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import me.chaounne.fastinv.FastInv;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Request extends FastInv {

    public Request(String playerName, String typeRequest) {
        super(9, "Acceptez vous le duel de " + playerName + " ?");

        ItemStackBuilder yes = new ItemStackBuilder(Material.GREEN_WOOL).setLore("Accepter").setName("Oui");
        ItemStackBuilder no = new ItemStackBuilder(Material.RED_WOOL).setLore("Refuser").setName("Non");
        ItemStack yesItem = yes.getItemStack();
        ItemStack noItem = no.getItemStack();

        setItem(2, yesItem, e -> {
            if(typeRequest.equals("Duel")){
                e.getWhoClicked().sendMessage("Vous avez accepté le duel de " + playerName);
                e.getWhoClicked().closeInventory();
                Player p1 = Bukkit.getPlayer(playerName);
                Player p2 = Bukkit.getPlayer(e.getWhoClicked().getName());
                GamePlayer gp1 = GamePlayer.getInstance(p1);
                GamePlayer gp2 = GamePlayer.getInstance(p2);
                Duel duel = new Duel(gp1, gp2);
                duel.startGame();
                } else if (typeRequest.equals("Morpion")){
                e.getWhoClicked().sendMessage("Vous avez accepté le morpion de " + playerName);
                e.getWhoClicked().closeInventory();
                Player p1 = Bukkit.getPlayer(playerName);
                Player p2 = Bukkit.getPlayer(e.getWhoClicked().getName());
                GamePlayer gp1 = GamePlayer.getInstance(p1);
                GamePlayer gp2 = GamePlayer.getInstance(p2);
                Morpion morpion = new Morpion(gp1, gp2);
                }
            });

        setItem(6, noItem, e -> {
            e.getWhoClicked().closeInventory();
            Player p = Bukkit.getPlayer(playerName);
            p.sendMessage("Le duel a été refusé");
        });

    }

}
