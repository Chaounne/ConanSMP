package me.chaounne.conansmp;

import jdk.nashorn.internal.ir.Block;
import me.chaounne.conansmp.commands.Commands;
import me.chaounne.conansmp.conancard.cards.*;
import me.chaounne.conansmp.conancard.packopening.Booster;
import me.chaounne.conansmp.recipe.Recipe;
import me.chaounne.fastinv.FastInvManager;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConanSMP extends JavaPlugin implements Listener {

    ConanSMP instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Commands com = new Commands();
        Recipe.init();
        FastInvManager.register(this);
        getCommand("coords").setExecutor(com);
        getCommand("duel").setExecutor(com);
        getCommand("inv").setExecutor(com);
        getCommand("packopen").setExecutor(com);
        instance = this;

        //create all cards
        Villageois villageois = new Villageois();
        TorcheAme torcheAme = new TorcheAme();
        PoissonGlobe poissonGlobe = new PoissonGlobe();
        Morue morue = new Morue();
        LanterneAme lanterneAme = new LanterneAme();
        Lanterne lanterne = new Lanterne();
        GolemFer golemFer = new GolemFer();
        Citrouille citrouille = new Citrouille();
        BlockFer blockFer = new BlockFer();

        Booster booster = Booster.getInstance();
        //add all cards to booster
        booster.addToBooster(villageois);
        booster.addToBooster(torcheAme);
        booster.addToBooster(poissonGlobe);
        booster.addToBooster(morue);
        booster.addToBooster(lanterneAme);
        booster.addToBooster(lanterne);
        booster.addToBooster(golemFer);
        booster.addToBooster(citrouille);
        booster.addToBooster(blockFer);

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.AQUA + event.getPlayer().getName() + ChatColor.GOLD + " a rejoint le serveur dinguerie wsh");
        event.getPlayer().sendMessage("uwu");
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.AQUA + event.getPlayer().getName() + ChatColor.GOLD + " a quitté le serveur :c");
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        if(Math.random() >0.7){
            e.setFormat(e.getPlayer().getName() + ": " + e.getMessage() + "coubeh");
            e.getPlayer().sendTitle(e.getMessage().toUpperCase() + "COUBEH", "", 10, 40, 10);
        } else if (Math.random() > 0.9 && e.getPlayer().getName() != "Azrael_IV") {
            e.setFormat(e.getPlayer().getName() + ": " + "tg maceo");
        } else if (Math.random() > 0.9 && e.getPlayer().getName() == "Azrael_IV"){
            e.setFormat(e.getPlayer().getName() + ": " + "j'aime la bite");
        } else {
            e.setFormat(e.getPlayer().getName() + ": " + e.getMessage());
        }
        if(e.getMessage().contains("quoi") || e.getMessage().contains("QUOI")){
            if(Math.random()>0.5 && Math.random() < 0.75)
                e.getPlayer().sendTitle("QUOICOUBEH", "", 10, 40, 10);
            else if(Math.random() > 0.75 && Math.random() < 0.9)
                e.getPlayer().sendTitle("QUOI QU'EST QU'IL Y A", "", 10, 40, 10);
            else
                e.getPlayer().sendTitle("Feur", "", 10, 40, 10);
        }
    }

    public ConanSMP getInstance() {
    	return instance;
    }
}
