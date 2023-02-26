package me.chaounne.conansmp.conancard.inv;

import me.chaounne.conansmp.conancard.combat.Duel;
import me.chaounne.conansmp.conancard.player.GamePlayer;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import me.chaounne.fastinv.FastInv;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.ItemStack;

public class TerrainInv extends FastInv implements Listener {

    Duel duel;

    public TerrainInv(GamePlayer p1, GamePlayer p2) {
        super(27, "Combat");
        duel = new Duel(p1, p2);

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
