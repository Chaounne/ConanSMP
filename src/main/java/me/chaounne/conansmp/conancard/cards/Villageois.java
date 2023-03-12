package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Villageois extends SampleCard{

        public Villageois(){
            super("Villageois", Type.VILLAGE, 50, 50, new ItemStackBuilder(Material.VILLAGER_SPAWN_EGG).setName("Villageois").addEnchant(Enchantment.LUCK, 0).setLore("Attaque 50 / Défense 50").getItemStack());
        }


}
