package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Glowstone extends SampleCard{

    public Glowstone(){
        super(19,"Glowstone", Type.LUMIERE, Type.NETHER, 100, 100, new ItemStackBuilder(Material.GLOWSTONE).setName("Glowstone").setLore("Attaque 100 / Défense 100").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.RARE);
    }
}
