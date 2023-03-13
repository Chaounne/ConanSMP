package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class CanneAPeche extends SampleCard{

        public CanneAPeche(){
            super(9,"Canne à pêche", TypeCarte.MAGIE, Rarete.COMMUNE, new ItemStackBuilder(Material.FISHING_ROD).setName("Canne à pêche").addEnchant(Enchantment.LUCK, 0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Permet de voler un monstre adverse et le mettre dans votre camp pour 1 tour.").getItemStack());
        }
}
