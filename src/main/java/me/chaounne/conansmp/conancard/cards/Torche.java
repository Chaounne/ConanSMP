package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;

public class Torche extends SampleCard{

    public Torche(){
        super(20,"Torche", Type.LUMIERE, 50, 50, new ItemStackBuilder(Material.TORCH).setName("Torche").setLore("Attaque 50 / Défense 50").getItemStack(), Rarete.COMMUNE);
    }
}
