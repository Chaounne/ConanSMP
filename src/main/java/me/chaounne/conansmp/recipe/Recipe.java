package me.chaounne.conansmp.recipe;

import me.chaounne.conansmp.utils.ItemStackBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Recipe implements Listener {
    private ItemStack nameTag = new ItemStackBuilder(Material.NAME_TAG).getItemStack();

    private ShapedRecipe nameTagRecipe = new ShapedRecipe(nameTag);

    private ShapedRecipe SaddleRecipe = new ShapedRecipe(new ItemStackBuilder(Material.SADDLE).getItemStack());

    public static void init(){
        Recipe recipe= new Recipe();
        recipe.addRecipe();

        Bukkit.getPluginManager().registerEvents(recipe, Bukkit.getPluginManager().getPlugin("ConanSMP"));
    }

    public void addRecipe(){
        Bukkit.getServer().addRecipe(nameTagRecipe);
        Bukkit.getServer().addRecipe(SaddleRecipe);
    }

    public Recipe(){
        nameTagRecipe.shape(" S ", "LLL", " S ");
        nameTagRecipe.setIngredient('S', Material.STRING);
        nameTagRecipe.setIngredient('L', Material.LEATHER);

        SaddleRecipe.shape("   ", "LLL", "I I");
        SaddleRecipe.setIngredient('L', Material.LEATHER);
        SaddleRecipe.setIngredient('I', Material.IRON_INGOT);
    }


}
