package net.spark.TaP.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spark.TaP.SparkTaP;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SparkTaP.MOD_ID);

    public static final RegistryObject<Item> FUXU = ITEMS.register("fuxu",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_FUXU = ITEMS.register("raw_fuxu",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
