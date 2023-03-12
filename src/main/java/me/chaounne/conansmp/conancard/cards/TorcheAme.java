package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class TorcheAme extends SampleCard{

    public TorcheAme(){
        super(5,"Torche des âmes", Type.AMES, 50, 50, new ItemStackBuilder(Material.SOUL_TORCH).setName("Torche des âmes").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 50 / Défense 50").getItemStack(), Rarete.RARE);
    }
}
