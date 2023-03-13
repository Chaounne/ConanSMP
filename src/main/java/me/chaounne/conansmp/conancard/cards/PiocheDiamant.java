package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class PiocheDiamant extends SampleCard{
    //carte piege
    public PiocheDiamant(){
        super(13,"Pioche Diamant", TypeCarte.PIEGE, Rarete.COMMUNE, new ItemStackBuilder(Material.DIAMOND_PICKAXE).setName("Pioche en diamant").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Renvoie les dégâts à l’adversaire.").getItemStack());
    }
}
