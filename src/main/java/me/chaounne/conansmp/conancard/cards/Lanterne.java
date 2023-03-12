package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Lanterne extends SampleCard{

    public Lanterne(){
        super(4,"Lanterne", Type.LUMIERE, 50, 50, new ItemStackBuilder(Material.LANTERN).setName("Lanterne").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 50 / Défense 50").getItemStack(), Rarete.COMMUNE);
    }
}
