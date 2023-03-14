package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Pissenlit extends SampleCard {

    public Pissenlit(){
        super(26, "Pissenlit", Type.BOIS, 10, 10, new ItemStackBuilder(Material.DANDELION).setName("Pissenlit").setLore("Attaque 10 / Défense 10 | + 50 ATK + 50 DEF Si terrain fertile"  ).addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.COMMUNE);
    }


}
