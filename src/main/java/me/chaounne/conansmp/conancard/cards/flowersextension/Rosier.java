package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Rosier extends SampleCard {

    public Rosier(){
        super(27, "Rosier", Type.BOIS, 0, 100, new ItemStackBuilder(Material.ROSE_BUSH).setName("Rosier").setLore("Attaque 0 / Défense 100 | Invincible si terrain fertile + fait apparaître une rose tous les 2 tours si terrain fertile"  ).addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.RARE);
    }
}
