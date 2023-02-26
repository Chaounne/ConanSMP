package me.chaounne.conansmp.conancard.inv;

import me.chaounne.conansmp.utils.ItemStackBuilder;
import me.chaounne.fastinv.FastInv;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;

public class TerrainInv extends FastInv {

    public TerrainInv() {
        super(27, "Combat");

        ItemStackBuilder chainL = new ItemStackBuilder(Material.CHAIN).setLore("Délimitation du terrain").setName("Barrière");
        ItemStack limit = chainL.getItemStack();

        setItem(4, limit, e -> {
            e.setCancelled(true);
        });
        setItem(13, limit, e -> {
            e.setCancelled(true);
        });
        setItem(22, limit, e -> {
            e.setCancelled(true);
        });
    }

    @Override
    public void onOpen(InventoryOpenEvent e){
        e.getPlayer().sendMessage("Le duel a commencé !");
    }
}
