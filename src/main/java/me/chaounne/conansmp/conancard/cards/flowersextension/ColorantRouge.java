package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class ColorantRouge extends SampleCard {

    public ColorantRouge(){
        super(30, "Colorant Rouge", Type.BOIS, 0, 0, new ItemStackBuilder(Material.RED_DYE).setName("Colorant Rouge").setLore("Attaque 0 / Défense 0 | ATK Rose + 10 / DEF Rose + 10").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.RARE);
    }
}
