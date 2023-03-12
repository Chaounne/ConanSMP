package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Morue extends SampleCard{

    public Morue(){
        super(8,"Morue", Type.EAU, 10, 10, new ItemStackBuilder(Material.COD).setName("Morue").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 10 / Défense 10").getItemStack(), Rarete.COMMUNE);
    }
}
