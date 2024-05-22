package net.spark.TaP.item;

import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> FUXU_P1 = ITEMS.register("fuxugemp1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_P2 = ITEMS.register("fuxugemp2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_P3 = ITEMS.register("fuxugemp3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_A1 = ITEMS.register("fuxugema1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_A2 = ITEMS.register("fuxugema2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_A3 = ITEMS.register("fuxugema3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOV1 = ITEMS.register("fuxugemshov1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOV2 = ITEMS.register("fuxugemshov2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOV3 = ITEMS.register("fuxugemshov3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SWORD1 = ITEMS.register("fuxugemsword1",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SWORD2 = ITEMS.register("fuxugemsword2",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SWORD3 = ITEMS.register("fuxugemsword3",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHARD = ITEMS.register("fuxushard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FUXU_SWORD_BASE = ITEMS.register("fuxuswordbase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_BIGSWORD_BASE = ITEMS.register("fuxubigswordbase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_PICKAXE_BASE = ITEMS.register("fuxupickaxebase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_AXE_BASE = ITEMS.register("fuxuaxebase",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOVEL_BASE = ITEMS.register("fuxushovelbase",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FUXU_SWORDI1 = ITEMS.register("fuxusword1",
            () -> new SwordItem(ModToolTiers.FUXU_1, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SWORDI2 = ITEMS.register("fuxusword2",
            () -> new SwordItem(ModToolTiers.FUXU_2, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SWORDI3 = ITEMS.register("fuxusword3",
            () -> new SwordItem(ModToolTiers.FUXU_3, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_PICKAXE1 = ITEMS.register("fuxupickaxe1",
            () -> new PickaxeItem(ModToolTiers.FUXU_1, 1, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_PICKAXE2 = ITEMS.register("fuxupickaxe2",
            () -> new PickaxeItem(ModToolTiers.FUXU_2, 1, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_PICKAXE3= ITEMS.register("fuxupickaxe3",
            () -> new PickaxeItem(ModToolTiers.FUXU_3, 1, -2.5f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_AXE1 = ITEMS.register("fuxuaxe1",
            () -> new AxeItem(ModToolTiers.FUXU_1, 6, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_AXE2 = ITEMS.register("fuxuaxe2",
            () -> new AxeItem(ModToolTiers.FUXU_2, 5, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_AXE3 = ITEMS.register("fuxuaxe3",
            () -> new AxeItem(ModToolTiers.FUXU_3, 5, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOVEL1 = ITEMS.register("fuxushov1",
            () -> new ShovelItem(ModToolTiers.FUXU_1, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOVEL2 = ITEMS.register("fuxushov2",
            () -> new ShovelItem(ModToolTiers.FUXU_2, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_SHOVEL3 = ITEMS.register("fuxushov3",
            () -> new ShovelItem(ModToolTiers.FUXU_3, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_MULTITOOL = ITEMS.register("fuxumultitool",
            () -> new MultitoolItem());
    public static final RegistryObject<Item> FUXU_BIGSWORD1 = ITEMS.register("fuxubigsword1",
            () -> new SwordItem(ModToolTiers.FUXU_1, 6, -2.9f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_BIGSWORD2 = ITEMS.register("fuxubigsword2",
            () -> new SwordItem(ModToolTiers.FUXU_2, 6, -2.9f, new Item.Properties()));
    public static final RegistryObject<Item> FUXU_BIGSWORD3 = ITEMS.register("fuxubigsword3",
            () -> new SwordItem(ModToolTiers.FUXU_3, 7, -2.9f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
