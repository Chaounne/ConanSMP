package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Torche extends SampleCard{

    public Torche(){
        super(20,"Torche", Type.LUMIERE, 50, 50, new ItemStackBuilder(Material.TORCH).setName("Torche").setLore("Attaque 50 / Défense 50").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.COMMUNE);
    }
}
