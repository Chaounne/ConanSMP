package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Arc extends SampleCard{

    public Arc(){
        super(16,"Arc", TypeCarte.OBJET, Rarete.COMMUNE, new ItemStackBuilder(Material.BOW).setName("Arc").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Si le monstre est un squelette alors le squelette obtient 50 points d’attaques supplémentaires\net peut attaquer directement les points de vie de l’adversaire.\nSinon donne 50 points d’attaque").getItemStack());
    }
}
