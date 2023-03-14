package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class CasqueTortue extends SampleCard{

    public CasqueTortue(){
        super(14,"Casque de Tortue", TypeCarte.OBJET, Rarete.EPIC, new ItemStackBuilder(Material.TURTLE_HELMET).setName("Casque de tortue").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Si le monstre est un monstre EAU, le monstre obtient 50 points d’attaque et 100 points de défense. Sinon le monstre obtient 25 points de défense.").getItemStack());
    }
}
