package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Arbalete extends SampleCard{

    public Arbalete(){
        super(17,"Arbalete", TypeCarte.OBJET, Rarete.RARE, new ItemStackBuilder(Material.CROSSBOW).setName("Arbalete").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Donne 50 points d’attaque. Si le monstre est de type JOUEUR alors le monstre obtient 100 points d’attaque.").getItemStack());
    }
}
