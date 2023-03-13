package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Bouclier extends SampleCard{

    public Bouclier(){
        super(15,"Bouclier", TypeCarte.OBJET, Rarete.RARE, new ItemStackBuilder(Material.SHIELD).setName("Bouclier").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Absorbe les dégâts d’une attaque et disparaît.").getItemStack());
    }
}
