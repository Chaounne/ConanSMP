package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class LampeDesMers extends SampleCard{

    public LampeDesMers(){
        super(23,"Lampe des Mers", Type.LUMIERE, Type.EAU, 100, 100, new ItemStackBuilder(Material.SEA_LANTERN).setName("Lampe des Mers").setLore("Attaque 100 / Défense 100 | Invoque terrain aquatique").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.EPIC);
    }
}
