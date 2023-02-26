package me.chaounne.conansmp.conancard.inv;

import me.chaounne.conansmp.utils.ItemStackBuilder;
import me.chaounne.fastinv.FastInv;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Request extends FastInv {

    public Request(String playerName) {
        super(5, "Acceptez vous le duel de " + playerName + " ?");

        ItemStackBuilder yes = new ItemStackBuilder(Material.GREEN_WOOL).setLore("Accepter").setName("Oui");
        ItemStackBuilder no = new ItemStackBuilder(Material.RED_WOOL).setLore("Refuser").setName("Non");
        ItemStack yesItem = yes.getItemStack();
        ItemStack noItem = no.getItemStack();

        setItem(1, yesItem, e -> {
            e.setCancelled(true);
            Player p1 = Bukkit.getPlayer(playerName);
            Player p2 = Bukkit.getPlayer(e.getWhoClicked().getName());
            TerrainInv inv = new TerrainInv();
            inv.open(p1);
            inv.open(p2);
            });

        setItem(3, noItem, e -> {
            e.setCancelled(true);
            Player p = Bukkit.getPlayer(playerName);
            e.getWhoClicked().closeInventory();
            p.sendMessage("Le duel a été refusé");
        });

    }

}
