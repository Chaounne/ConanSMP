package me.chaounne.conansmp.conancard.packopening;

import me.chaounne.conansmp.conancard.cards.SampleCard;
import me.chaounne.conansmp.conancard.cards.rare.Rarete;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class Booster implements Listener {

    private static Booster instance;
    public ArrayList<SampleCard> commonCards = new ArrayList<>();
    public ArrayList<SampleCard> rareCards = new ArrayList<>();
    public ArrayList<SampleCard> epicCards = new ArrayList<>();
    public ArrayList<SampleCard> legendaryCards = new ArrayList<>();

    private long lastOpenedTime = 0;
    private Inventory displayBooster;

    private SampleCard rareCard;
    private SampleCard epicOrLegendaryCard;
    private HashMap<UUID, Long> cooldowns = new HashMap<>();


    private Booster() {
        displayBooster = Bukkit.createInventory(null, 9, "Booster");
        Bukkit.getPluginManager().registerEvents(this, Bukkit.getPluginManager().getPlugin("ConanSMP"));
    }

    public void addToBooster(SampleCard card){
        if(card.getRarete() == Rarete.COMMUNE){
            commonCards.add(card);
        }
        if(card.getRarete() == Rarete.RARE){
            rareCards.add(card);
        }
        if(card.getRarete() == Rarete.EPIC){
            epicCards.add(card);
        }
        if(card.getRarete() == Rarete.LEGENDAIRE){
            legendaryCards.add(card);
        }
    }

    //singleton
    public static Booster getInstance() {
        if (instance == null) {
            instance = new Booster();
        }
        return instance;
    }

    private void shuffle() {
        if (!rareCards.isEmpty()) {
            rareCard = rareCards.get(new Random().nextInt(rareCards.size()));
        } else {
            System.out.println("rareCards list is empty");
        }
        if (Math.random() > 0.2) {
            if(epicCards.isEmpty()){
                System.out.println("epicCards list is empty");
            } else {
                epicOrLegendaryCard = epicCards.get(new Random().nextInt(epicCards.size()));
            }
        } else {
            if (legendaryCards.isEmpty()) {
                System.out.println("legendaryCards list is empty");
            } else {
                epicOrLegendaryCard = legendaryCards.get(new Random().nextInt(legendaryCards.size()));
            }
        }
    }

    public void open(Player player) {
        UUID uuid = player.getUniqueId();
        long currentTime = System.currentTimeMillis();
        if (cooldowns.containsKey(uuid) && currentTime - cooldowns.get(uuid) < 300000) {
            player.sendMessage("Veuillez patienter " + ((300000 - (currentTime - cooldowns.get(uuid))) / 60000) + " minutes avant de pouvoir ouvrir un autre booster.");
            return;
        }
        cooldowns.put(uuid, currentTime);
        this.displayBooster.clear();
        shuffle();
        for (int i = 0; i < 3; i++) {
            SampleCard commonCard = commonCards.get(new Random().nextInt(commonCards.size()));
            displayBooster.setItem(i+2, commonCard.getItem());
        }
        displayBooster.setItem(5, rareCard.getItem());
        displayBooster.setItem(6, epicOrLegendaryCard.getItem());
        player.openInventory(displayBooster);
        player.playSound(player.getLocation(), "minecraft:entity.player.levelup", 1, 1);
    }


    @EventHandler
    public void onInventoryClose(InventoryCloseEvent event) {
        Player player = (Player) event.getPlayer();
        Inventory inventory = event.getInventory();

        if (inventory.equals(displayBooster)) {
            for (ItemStack item : displayBooster.getContents()) {
                if (item != null) {
                    player.getInventory().addItem(item);
                }
            }
        }
    }
}
