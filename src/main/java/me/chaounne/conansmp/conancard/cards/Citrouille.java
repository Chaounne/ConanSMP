package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Citrouille extends SampleCard{

    public Citrouille(){
        super(1,"Citrouille", Type.BOIS, 50, 50, new ItemStackBuilder(Material.PUMPKIN).setName("Citrouille").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 50 / Défense 50").getItemStack(), Rarete.COMMUNE);
    }
}
