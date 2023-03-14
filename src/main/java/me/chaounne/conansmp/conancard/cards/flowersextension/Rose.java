package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Rose extends SampleCard{

    public Rose(){
        super(28, "Rose", Type.BOIS, 20, 10, new ItemStackBuilder(Material.POPPY).setName("Rose").setLore("Attaque 20 / Défense 10").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.COMMUNE);
    }


}
