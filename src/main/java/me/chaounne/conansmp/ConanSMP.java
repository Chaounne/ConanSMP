package me.chaounne.conansmp;

import me.chaounne.conansmp.commands.Commands;
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
        getCommand("coords").setExecutor(com);
        instance = this;
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
        e.setFormat(e.getPlayer().getName() + ": " + e.getMessage());
    }

    public ConanSMP getInstance() {
    	return instance;
    }
}
