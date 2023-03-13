package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class DisqueMusiqueNoir extends SampleCard{

    public DisqueMusiqueNoir(){
        super(11,"Disque musique noir", TypeCarte.MAGIE, Rarete.COMMUNE, new ItemStackBuilder(Material.MUSIC_DISC_13).setName("Disque musique noir").addEnchant(Enchantment.LUCK,0).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Appeur le GOLEM DE FER.").getItemStack());
    }

}
