package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class ColorantBleu extends SampleCard{

    public ColorantBleu(){
        super(29, "Colorant Bleu", Type.BOIS, 0, 0, new ItemStackBuilder(Material.BLUE_DYE).setName("Colorant Bleu").setLore("Attaque 0 / Défense 0 | ATK Cornflower + 10 / DEF Cornflower + 10").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.RARE);
    }
}
