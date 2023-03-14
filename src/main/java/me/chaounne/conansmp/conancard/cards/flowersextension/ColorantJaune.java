package me.chaounne.conansmp.conancard.cards.flowersextension;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class ColorantJaune extends SampleCard{

    public ColorantJaune(){
        super(31, "Colorant Jaune", Type.BOIS, 0, 0, new ItemStackBuilder(Material.YELLOW_DYE).setName("Colorant Jaune").setLore("Attaque 0 / Défense 0 | ATK Pissenlit + 10 / DEF Pissenlit + 10").addEnchant(Enchantment.LUCK,1).addFlag(ItemFlag.HIDE_ENCHANTS).getItemStack(), Rarete.RARE);
    }
}
