package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class LanterneAme extends SampleCard{

    public LanterneAme(){
        super(6,"LanterneAme", Type.LUMIERE, Type.AMES, 100, 100, new ItemStackBuilder(Material.LANTERN).setName("Lanterne des âmes").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 100 / Défense 100").getItemStack(), Rarete.EPIC);
    }
}
