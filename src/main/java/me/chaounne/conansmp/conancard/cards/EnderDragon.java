package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class EnderDragon extends SampleCard{

    public EnderDragon(){
        super(25, "Ender Dragon", Type.MONSTRE, 200, 0, new ItemStackBuilder(Material.DRAGON_HEAD).setName("Ender Dragon").setLore("Attaque 200 / Défense 0 | Obtient la somme des points de défense des monstres sacrifiés.").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.LEGENDAIRE);
    }
}
