package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Bleuet extends SampleCard{
    public Bleuet(){
        super(34, "Bleuet", Type.BOIS, Type.EAU, 10, 51, new ItemStackBuilder(Material.BLUE_DYE).setName("Bleuet").setLore("Attaque 10 / Défense 51 | +10 ATK aux fleurs adjacentes (+20 ATK si terrain fertile)").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.EPIC);
    }
}
