package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class PoissonGlobe extends SampleCard{

    public PoissonGlobe(){
        super(7,"Poisson Globe", Type.EAU, 10, 70, new ItemStackBuilder(Material.PUFFERFISH).setName("Poisson Globe").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Attaque 10 / Défense 70").getItemStack(), Rarete.RARE);
    }
}
