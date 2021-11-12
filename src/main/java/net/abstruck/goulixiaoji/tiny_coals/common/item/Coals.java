package net.abstruck.goulixiaoji.tiny_coals.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;

import javax.annotation.Nullable;

public class Coals extends Item {

    private final int burnTime;

    public Coals(int burnTime) {
        super(new Properties().tab(ItemGroup.TAB_MISC));
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable IRecipeType<?> recipeType) {
        return burnTime;
    }
}
