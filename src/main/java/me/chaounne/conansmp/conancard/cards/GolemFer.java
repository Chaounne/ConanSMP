package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class GolemFer extends SampleCard{

    public GolemFer(){
        super(3,"Golem de Fer", Type.FER, Type.VILLAGE, 200, 400, new ItemStackBuilder(Material.IRON_BLOCK).setName("Golem de Fer").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 200 / Défense 400").getItemStack(), Rarete.LEGENDAIRE);
    }
}
