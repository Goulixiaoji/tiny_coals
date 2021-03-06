package net.abstruck.goulixiaoji.tiny_coals.registry;

import net.abstruck.goulixiaoji.tiny_coals.TinyCoals;
import net.abstruck.goulixiaoji.tiny_coals.common.item.Coals;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CoalRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TinyCoals.MOD_ID);

    public static final RegistryObject<Item> Tiny_Coal = ITEMS.register("tiny_coal",() -> new Coals(200));
    public static final RegistryObject<Item> Tiny_Charcoal = ITEMS.register("tiny_charcoal",() -> new Coals(200));
}
