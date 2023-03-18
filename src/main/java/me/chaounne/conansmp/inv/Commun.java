package me.chaounne.conansmp.inv;

import me.chaounne.fastinv.FastInv;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;

public class Commun {

    private static Inventory sharedInventory;
    private static File configFile = new File("plugins/ConansMP/config.yml");
    private static YamlConfiguration config = YamlConfiguration.loadConfiguration(configFile);

    private Commun() {
    }

    public static Inventory getInstance() {
        if (sharedInventory == null) {
            sharedInventory = Bukkit.createInventory(null, 27, "Inventaire commun");
            loadItemsFromConfig();
        }
        return sharedInventory;
    }

    private static void loadItemsFromConfig() {
        if (config.contains("shared_inventory")) {
            sharedInventory.clear();
            for (String slotString : config.getConfigurationSection("shared_inventory").getKeys(false)) {
                int slot = Integer.parseInt(slotString);
                ItemStack item = config.getItemStack("shared_inventory." + slot);
                sharedInventory.setItem(slot, item);
            }
        }
    }

    public static void saveItemsToConfig() {
        config.set("shared_inventory", null);
        for (int i = 0; i < sharedInventory.getSize(); i++) {
            ItemStack item = sharedInventory.getItem(i);
            if (item != null) {
                config.set("shared_inventory." + i, item);
            }
        }
        try {
            config.save(configFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openInventory(Player player) {
        player.openInventory(sharedInventory);
    }
}
