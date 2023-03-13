package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;

public class Wither extends SampleCard{

    public Wither(){
        super(19,"Wither", Type.AMES, Type.NETHER, 300, 200, new ItemStackBuilder(Material.WITHER_SKELETON_SKULL).setName("Wither").setLore("Attaque 300 / Défense 200").getItemStack(), Rarete.LEGENDAIRE);
    }
}
