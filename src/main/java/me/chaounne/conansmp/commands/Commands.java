package me.chaounne.conansmp.commands;

import me.chaounne.conansmp.conancard.inv.Request;
import me.chaounne.conansmp.conancard.packopening.Booster;
import me.chaounne.conansmp.inv.Commun;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Commands implements CommandExecutor {

    private Inventory commun;

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

        if(command.getName().equalsIgnoreCase("duel")){
            if(args.length < 1){
                player.sendMessage("Usage: /duel <player>");
                return true;
            }
            Player target = player.getServer().getPlayer(args[0]);
            if(target == null){
                player.sendMessage("Player not found!");
                return true;
            }
            player.sendMessage("Vous avez provoqué " + target.getName() + " en duel !");
            target.sendMessage(player.getName() + " veux vous affronter !");
            new Request(player.getName()).open(target);
        }
        if(command.getName().equalsIgnoreCase("inv")){
            commun = Commun.getInstance();
            player.openInventory(commun);
        }
        if(command.getName().equalsIgnoreCase("packopen")){
            System.out.println("packopen");
            Booster booster = Booster.getInstance();
            System.out.println("booster");
            booster.open(player);
        }
        return true;
    }
}
