package me.chaounne.conansmp.inv;

import me.chaounne.fastinv.FastInv;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Commun{

    private static Inventory sharedInventory;

    private Commun() {

    }

    public static Inventory getInstance() {
        if (sharedInventory == null) {
            sharedInventory = Bukkit.createInventory(null, 27, "Inventaire commun");
        }
        return sharedInventory;
    }

    public void openInventory(Player player) {
        player.openInventory(sharedInventory);
    }
}
