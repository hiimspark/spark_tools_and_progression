package net.spark.TaP.datagen;

import net.spark.TaP.item.ModItems;
import net.spark.TaP.block.ModBlocks;
import net.spark.TaP.SparkTaP;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> FUXU_SMELTABLES = List.of(ModItems.RAW_FUXU.get(),
            ModBlocks.FUXU_ORE.get(), ModBlocks.DEEPSLATE_FUXU_ORE.get(), ModBlocks.NETHER_FUXU_ORE.get(),
            ModBlocks.END_FUXU_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, FUXU_SMELTABLES, RecipeCategory.MISC, ModItems.FUXU.get(), 0.25f, 200, "fuxu");
        oreBlasting(pWriter, FUXU_SMELTABLES, RecipeCategory.MISC, ModItems.FUXU.get(), 0.25f, 100, "fuxu");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.FUXU_BLOCK.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern("FFF")
                .define('F', ModItems.FUXU.get())
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU.get(), 9)
                .requires(ModBlocks.FUXU_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.FUXU_BLOCK.get()), has(ModBlocks.FUXU_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  SparkTaP.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
