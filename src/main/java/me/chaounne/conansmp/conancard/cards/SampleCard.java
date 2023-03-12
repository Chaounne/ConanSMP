package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.type.Type;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class SampleCard {

    protected Type type;

    protected Type secondType;

    protected String name;

    protected int atk;

    protected int def;

    protected ItemStack item;


    //single type construtor
    protected SampleCard(String _name, Type _type, int att, int dff, ItemStack item){
        this.name = _name;
        this.type = _type;
        this.atk = att;
        this.def = dff;
        this.item = item;
    }


    //double type construtor
    protected SampleCard(String _name, Type _type, Type _type2, int att, int dff, ItemStack item){
        this.name = _name;
        this.type = _type;
        this.atk = att;
        this.def = dff;
        this.secondType = _type2;
        this.item = item;
    }

    public Type getType() {
        return type;
    }

    public Type getSecondType() {
        return secondType;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public ItemStack getItem() {
        return item;
    }

    public void givePlayer(Player player){
        player.getInventory().addItem(item);
    }

}
