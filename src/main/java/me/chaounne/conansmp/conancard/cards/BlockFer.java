package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class BlockFer extends SampleCard{

    public BlockFer(){
        super(2,"Block de Fer", Type.FER, 0, 100, new ItemStackBuilder(Material.IRON_BLOCK).setName("Block de Fer").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 0 / Défense 100").getItemStack(), Rarete.RARE);
    }
}
