package me.chaounne.conansmp.conancard.cards;

import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import me.chaounne.conansmp.conancard.cards.type.Type;
import me.chaounne.conansmp.conancard.cards.type.TypeCarte;
import me.chaounne.conansmp.conancard.packopening.Booster;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class SampleCard {
    protected int id;
    protected Type type;

    protected Type secondType;

    protected String name;

    protected int atk;

    protected int def;

    protected ItemStack item;

    protected Rarete rare;

    protected TypeCarte typeCarte;



    //single type construtor
    protected SampleCard(int id, String _name, Type _type, int att, int dff, ItemStack item, Rarete rare){
        this.id = id;
        this.name = _name;
        this.type = _type;
        this.atk = att;
        this.def = dff;
        this.item = item;
        this.rare = rare;
        this.typeCarte = TypeCarte.MONSTRE;
    }


    //double type construtor
    protected SampleCard(int id, String _name, Type _type, Type _type2, int att, int dff, ItemStack item, Rarete rare){
        this.name = _name;
        this.type = _type;
        this.atk = att;
        this.def = dff;
        this.secondType = _type2;
        this.item = item;
        this.rare = rare;
        this.typeCarte = TypeCarte.MONSTRE;
    }

    //carte non monstre
    protected SampleCard(int id, String _name, TypeCarte typeCarte, Rarete rare, ItemStack item){
        this.id = id;
        this.name = _name;
        this.typeCarte = typeCarte;
        this.rare = rare;
        this.item = item;
    }


    public Rarete getRarete(){
        return rare;
    }

    public int getId() {
        return id;
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
