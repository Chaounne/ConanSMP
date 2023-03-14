package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class TableCraft extends SampleCard{

    public TableCraft(){
        super(36, "Table de Craft", TypeCarte.MAGIE, Rarete.COMMUNE, new ItemStackBuilder(Material.CRAFTING_TABLE).setName("Table de Craft").setLore("Permet de combiner des monstres afin d’invoquer un monstre craftable.").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack());
    }
}
