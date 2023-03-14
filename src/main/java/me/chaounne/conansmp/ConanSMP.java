package me.chaounne.conansmp;

import me.chaounne.conansmp.commands.Commands;
import me.chaounne.conansmp.conancard.cards.*;
import me.chaounne.conansmp.conancard.cards.flowersextension.*;
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
        getCommand("cartesinfo").setExecutor(com);
        instance = this;

        //create all cards
        //saison 1
        Villageois villageois = new Villageois();
        TorcheAme torcheAme = new TorcheAme();
        PoissonGlobe poissonGlobe = new PoissonGlobe();
        Morue morue = new Morue();
        LanterneAme lanterneAme = new LanterneAme();
        Lanterne lanterne = new Lanterne();
        GolemFer golemFer = new GolemFer();
        Citrouille citrouille = new Citrouille();
        BlockFer blockFer = new BlockFer();
        CanneAPeche canneAPeche = new CanneAPeche();
        DisqueMusiqueBleu disqueMusiqueBleu = new DisqueMusiqueBleu();
        DisqueMusiqueNoir disqueMusiqueNoir = new DisqueMusiqueNoir();
        Entonnoir entonnoir = new Entonnoir();
        PiocheDiamant piocheDiamant = new PiocheDiamant();
        Porte porte = new Porte();
        Bouclier bouclier = new Bouclier();
        Arc arc = new Arc();
        Arbalete arbalete = new Arbalete();
        CasqueTortue casqueTortue = new CasqueTortue();
        Wither wither = new Wither();
        Glowstone glowstone = new Glowstone();
        PoudreGlowstone poudreGlowstone = new PoudreGlowstone();
        Torche torche = new Torche();
        Shroomlight shroomlight = new Shroomlight();
        Seaudeau seaudeau = new Seaudeau();
        LampeDesMers lampeDesMers = new LampeDesMers();
        BlackDie blackDie = new BlackDie();
        EnderDragon enderDragon = new EnderDragon();
        TableCraft tableCraft = new TableCraft();

        //Flowers Extension
        ColorantBlanc colorantBlanc = new ColorantBlanc();
        ColorantBleu colorantBleu = new ColorantBleu();
        ColorantJaune colorantJaune = new ColorantJaune();
        ColorantRouge colorantRouge = new ColorantRouge();
        Pissenlit pissenlit = new Pissenlit();
        Rose rose = new Rose();
        Rosier rosier = new Rosier();
        Bleuet bleuet = new Bleuet();
        Shears shears = new Shears();
        TerreLabourree terreLabourree = new TerreLabourree();

        Booster booster = Booster.getInstance();
        //add all cards to booster
        //booster saison 1
        booster.addToBooster(villageois);
        booster.addToBooster(torcheAme);
        booster.addToBooster(poissonGlobe);
        booster.addToBooster(morue);
        booster.addToBooster(lanterneAme);
        booster.addToBooster(lanterne);
        booster.addToBooster(golemFer);
        booster.addToBooster(citrouille);
        booster.addToBooster(blockFer);
        booster.addToBooster(canneAPeche);
        booster.addToBooster(disqueMusiqueBleu);
        booster.addToBooster(disqueMusiqueNoir);
        booster.addToBooster(entonnoir);
        booster.addToBooster(piocheDiamant);
        booster.addToBooster(porte);
        booster.addToBooster(bouclier);
        booster.addToBooster(arc);
        booster.addToBooster(arbalete);
        booster.addToBooster(casqueTortue);
        booster.addToBooster(wither);
        booster.addToBooster(glowstone);
        booster.addToBooster(poudreGlowstone);
        booster.addToBooster(torche);
        booster.addToBooster(shroomlight);
        booster.addToBooster(seaudeau);
        booster.addToBooster(lampeDesMers);
        booster.addToBooster(blackDie);
        booster.addToBooster(enderDragon);
        booster.addToBooster(tableCraft);

        //Flowers Extension
        booster.addToBooster(colorantBlanc);
        booster.addToBooster(colorantBleu);
        booster.addToBooster(colorantJaune);
        booster.addToBooster(colorantRouge);
        booster.addToBooster(pissenlit);
        booster.addToBooster(rose);
        booster.addToBooster(rosier);
        booster.addToBooster(bleuet);
        booster.addToBooster(shears);
        booster.addToBooster(terreLabourree);

        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.AQUA + event.getPlayer().getName() + ChatColor.GOLD + " a rejoint le serveur dinguerie wsh");
        event.getPlayer().sendMessage("Mise a jour Conan Cards : Ajout de la flower extension + Mise en place de la saison 1 (pas encore finalisée)");
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
