package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class DisqueMusiqueBleu extends SampleCard {

    public DisqueMusiqueBleu(){
        super(10,"Disque musique bleu", TypeCarte.MAGIE, Rarete.RARE, new ItemStackBuilder(Material.MUSIC_DISC_11).setName("Disque musique bleu").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Endort la cible.").getItemStack());
    }
}
