package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class PoudreGlowstone extends SampleCard{

    public PoudreGlowstone(){
        super(19,"Poudre de Glowstone", Type.LUMIERE, Type.NETHER, 25, 25, new ItemStackBuilder(Material.GLOWSTONE_DUST).setName("Poudre de Glowstone").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 25 / Défense 25").getItemStack(), Rarete.COMMUNE);
    }
}
