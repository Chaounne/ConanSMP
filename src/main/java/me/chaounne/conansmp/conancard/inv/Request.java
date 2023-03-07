package me.chaounne.conansmp.conancard.inv;

import me.chaounne.conansmp.conancard.combat.Duel;
import me.chaounne.conansmp.conancard.player.GamePlayer;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import me.chaounne.fastinv.FastInv;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Request extends FastInv {

    public Request(String playerName) {
        super(9, "Acceptez vous le duel de " + playerName + " ?");

        ItemStackBuilder yes = new ItemStackBuilder(Material.GREEN_WOOL).setLore("Accepter").setName("Oui");
        ItemStackBuilder no = new ItemStackBuilder(Material.RED_WOOL).setLore("Refuser").setName("Non");
        ItemStack yesItem = yes.getItemStack();
        ItemStack noItem = no.getItemStack();

        setItem(2, yesItem, e -> {
            e.getWhoClicked().closeInventory();
            Player p1 = Bukkit.getPlayer(playerName);
            Player p2 = Bukkit.getPlayer(e.getWhoClicked().getName());
            GamePlayer gp1 = new GamePlayer(p1);
            GamePlayer gp2 = new GamePlayer(p2);
            Duel duel = new Duel(gp1, gp2);
            TerrainInv inv = new TerrainInv(gp1, gp2);
            Inventory inv1 = inv.getInventory();
            p1.openInventory(inv1);
            p2.openInventory(inv1);
            });

        setItem(6, noItem, e -> {
            e.getWhoClicked().closeInventory();
            Player p = Bukkit.getPlayer(playerName);
            p.sendMessage("Le duel a été refusé");
        });

    }

}
