package me.chaounne.conansmp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("You must be a player to execute this command!");
            return true;
        }
        Player player = (Player) sender;
        if(command.getName().equalsIgnoreCase("coords")) {
            String message = player.getName() + " envoie ses coordonnées :\nX: " + (int) player.getLocation().getX() + "\nY: " + (int) player.getLocation().getY() + "\nZ: " + (int) player.getLocation().getZ();
            player.getServer().broadcastMessage(message);
        }
        return true;
    }
}
