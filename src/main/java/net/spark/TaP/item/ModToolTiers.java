package net.spark.TaP.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.spark.TaP.SparkTaP;
import net.spark.TaP.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier FUXU_1 = TierSortingRegistry.registerTier(
            new ForgeTier(2, 300, 6f, 2f, 16,
                    ModTags.Blocks.NEEDS_FUXU1_TOOL, () -> Ingredient.of(ModItems.FUXU.get())),
            new ResourceLocation(SparkTaP.MOD_ID, "fuxu1"), List.of(Tiers.IRON), List.of());
    public static final Tier FUXU_2 = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1800, 8.5f, 3f, 16,
                    ModTags.Blocks.NEEDS_FUXU2_TOOL, () -> Ingredient.of(ModItems.FUXU.get())),
            new ResourceLocation(SparkTaP.MOD_ID, "fuxu2"), List.of(Tiers.DIAMOND), List.of());
    public static final Tier FUXU_3 = TierSortingRegistry.registerTier(
            new ForgeTier(5, 8100, 10f, 5f, 20,
                    ModTags.Blocks.NEEDS_FUXU3_TOOL, () -> Ingredient.of(ModItems.FUXU.get())),
            new ResourceLocation(SparkTaP.MOD_ID, "fuxu3"), List.of(Tiers.NETHERITE), List.of());
}
