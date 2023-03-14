package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class TerreLabourree extends SampleCard{

    public TerreLabourree(){
        super(35, "Terre Labourée", Type.BOIS, 0, 130, new ItemStackBuilder(Material.DIRT).setName("Terre Labourée").setLore("Attaque 0 / Défense 130 | Invoque le terrain fertile").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.LEGENDAIRE);
    }
}
