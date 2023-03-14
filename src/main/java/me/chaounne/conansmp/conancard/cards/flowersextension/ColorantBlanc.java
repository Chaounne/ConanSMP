package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class ColorantBlanc extends SampleCard{

    public ColorantBlanc(){
        super(32, "Colorant Blanc", Type.BOIS, 0, 0, new ItemStackBuilder(Material.WHITE_DYE).setName("Colorant Blanc").setLore("Attaque 0 / Défense 0 | Lors de l’invocation l’utilisateur peut choisir le nombre de colorant présent dans la main et sur son terrain il veut sacrifier. + 15 ATK + 15 DEF Par colorant sacrifiés").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.EPIC);
    }
}
