package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class BlackDie extends SampleCard{

    public BlackDie(){
        super(24,"Black Die", TypeCarte.MAGIE, Rarete.RARE, new ItemStackBuilder(Material.BLACK_DYE).setName("Black Die").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Permet de fusionner des monstres non invocable par Table de craft.").getItemStack());
    }
}
