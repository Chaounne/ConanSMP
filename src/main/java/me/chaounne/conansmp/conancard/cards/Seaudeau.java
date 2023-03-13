package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Seaudeau extends SampleCard{

    public Seaudeau(){
        super(22,"Seau d'eau", Type.EAU, 50, 50, new ItemStackBuilder(Material.WATER_BUCKET).setName("Seau d'eau").setLore("Attaque 100 / Défense 100").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.COMMUNE);
    }
}
