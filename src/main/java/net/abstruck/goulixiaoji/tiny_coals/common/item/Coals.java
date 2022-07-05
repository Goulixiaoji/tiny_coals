package net.abstruck.goulixiaoji.tiny_coals.common.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

/**
 * @author Goulixiaoji
 */
public class Coals extends Item {

    private final int burnTime;

    public Coals(int burnTime) {
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @org.jetbrains.annotations.Nullable RecipeType<?> recipeType) {
        return burnTime;
    }

}
