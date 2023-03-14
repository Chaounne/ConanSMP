package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;

public class Porte extends SampleCard{

    public Porte(){
        super(18,"Porte", TypeCarte.OBJET, Rarete.COMMUNE, new ItemStackBuilder(Material.OAK_DOOR).setName("Porte").addEnchant(Enchantment.LUCK, 1).addFlag(ItemFlag.HIDE_ENCHANTS).setLore("Protège un monstre ou le joueur d’une attaque puis se détruit sauf présence d’une autre carte porte sur le terrain, si une autre carte porte est présente sur le terrain,cela redonne une utilisation à la porte qui devait être détruite qui peut alors être retournée face cachée.").getItemStack());
    }
}
