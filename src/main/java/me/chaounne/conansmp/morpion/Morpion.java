package me.chaounne.conansmp.morpion;

import me.chaounne.conansmp.conancard.player.GamePlayer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Morpion implements Listener {

    GamePlayer j1, j2;
    Inventory board;

    public Morpion(GamePlayer gp1, GamePlayer gp2) {
        j1 = gp1;
        j2 = gp2;

        // Créer un inventaire de taille 9x3 pour représenter la grille de morpion
        board = Bukkit.createInventory(null, 9 * 3, "Morpion");

        // Remplir l'inventaire avec des emplacements vides représentant la grille
        board.setItem(3 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(4 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(5 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(12 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(13 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(14 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(21 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(22 , new ItemStack(Material.WHITE_WOOL));
        board.setItem(23 , new ItemStack(Material.WHITE_WOOL));

        // Ajouter l'inventaire comme spectateur pour tous les joueurs
        j1.getPlayer().openInventory(board);
        j2.getPlayer().openInventory(board);

        // Écouter les événements de clic sur l'inventaire
        Bukkit.getPluginManager().registerEvents(this, Bukkit.getPluginManager().getPlugin("ConanSMP"));
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        if (event.getCurrentItem() == null) {
            return;
        }

        // Vérifier que l'inventaire cliqué est bien la grille de morpion
        if (!event.getInventory().equals(board)) {
            return;
        }

        // Vérifier que le joueur qui a cliqué est l'un des deux joueurs du morpion
        GamePlayer player = GamePlayer.getInstance((Player) event.getWhoClicked());
        if (!player.equals(j1) && !player.equals(j2)) {
            return;
        }

        // Vérifier que le joueur ne peut pas cliquer sur un emplacement déjà occupé
        if (!event.getCurrentItem().getType().equals(Material.WHITE_WOOL)) {
            event.setCancelled(true);
            return;
        }

        // Choisir le bon matériau pour le bloc du joueur
        Material blockType = Material.BLUE_WOOL;
        if (player.equals(j2)) {
            blockType = Material.RED_WOOL;
        }

        // Mettre à jour l'inventaire avec le bloc du joueur
        event.getCurrentItem().setType(blockType);

        // Vérifier si le joueur a gagné
        if (checkWin(player)) {
            player.getPlayer().sendMessage("Félicitations, vous avez gagné !");
            endGame();
            return;
        }

        // Vérifier si la grille est remplie et qu'aucun joueur n'a gagné
        if (board.getViewers().stream().allMatch(this::isFull) && !checkWin(j1) && !checkWin(j2)) {
            board.getViewers().forEach(p -> p.sendMessage("Match nul !"));
            endGame();
            return;
        }

        // Passer au joueur suivant
        if (player.equals(j1)) {
            j2.getPlayer().openInventory(board);
        } else {
            j1.getPlayer().openInventory(board);
        }
    }

    private boolean checkWin(GamePlayer player) {

        if(player == null) return false;

        //check si le block est nul
        if(board.getItem(0).getType().equals(null)) return false;


        Material blockType = Material.BLUE_WOOL;
        if (player.equals(j2)) {
            blockType = Material.RED_WOOL;
        }

        // Vérifie premier ligne 3 4 5
        if (board.getItem(3).getType().equals(blockType) && board.getItem(4).getType().equals(blockType) && board.getItem(5).getType().equals(blockType)) {
            return true;
        }
        // Vérifie deuxieme ligne 12 13 14
        if (board.getItem(12).getType().equals(blockType) && board.getItem(13).getType().equals(blockType) && board.getItem(14).getType().equals(blockType)) {
            return true;
        }

        // Vérifie troisieme ligne 21 22 23
        if (board.getItem(21).getType().equals(blockType) && board.getItem(22).getType().equals(blockType) && board.getItem(23).getType().equals(blockType)) {
            return true;
        }

        // Vérifie premiere colonne 3 12 21
        if (board.getItem(3).getType().equals(blockType) && board.getItem(12).getType().equals(blockType) && board.getItem(21).getType().equals(blockType)) {
            return true;
        }

        // Vérifie deuxieme colonne 4 13 22
        if (board.getItem(4).getType().equals(blockType) && board.getItem(13).getType().equals(blockType) && board.getItem(22).getType().equals(blockType)) {
            return true;
        }

        // Vérifie troisieme colonne 5 14 23
        if (board.getItem(5).getType().equals(blockType) && board.getItem(14).getType().equals(blockType) && board.getItem(23).getType().equals(blockType)) {
            return true;
        }

        // Vérifier les diagonales
        if (board.getItem(3).getType().equals(blockType) && board.getItem(13).getType().equals(blockType) && board.getItem(23).getType().equals(blockType)) {
            return true;
        }
        if (board.getItem(5).getType().equals(blockType) && board.getItem(13).getType().equals(blockType) && board.getItem(21).getType().equals(blockType)) {
            return true;
        }

        return false;
    }

    private boolean isFull(HumanEntity player) {
        Inventory inventory = player.getOpenInventory().getTopInventory();
        for (ItemStack item : inventory.getContents()) {
            if (item == null || item.getType() == Material.AIR) {
                return false;
            }
        }
        return true;
    }


    private void endGame() {
        HandlerList.unregisterAll(this);
        j1.getPlayer().closeInventory();
        j2.getPlayer().closeInventory();
    }



}
