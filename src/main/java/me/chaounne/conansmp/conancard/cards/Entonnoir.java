package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Entonnoir extends SampleCard {

    public Entonnoir(){
        super(12,"Entonnoir", TypeCarte.MAGIE, Rarete.EPIC, new ItemStackBuilder(Material.HOPPER).setName("Entonnoir").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Supprime du terrain adverse toutes les cartes qui ne sont pas des cartes monstres.").getItemStack());
    }
}
