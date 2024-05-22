package net.spark.TaP.datagen;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
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

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_PICKAXE_BASE.get())
                .pattern("FFF")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FUXU.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_AXE_BASE.get())
                .pattern("FF ")
                .pattern("FS ")
                .pattern(" S ")
                .define('F', ModItems.FUXU.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SHOVEL_BASE.get())
                .pattern(" F ")
                .pattern(" S ")
                .pattern(" S ")
                .define('F', ModItems.FUXU.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SWORD_BASE.get())
                .pattern(" F ")
                .pattern(" F ")
                .pattern(" S ")
                .define('F', ModItems.FUXU.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_BIGSWORD_BASE.get())
                .pattern("FFF")
                .pattern("FFF")
                .pattern(" S ")
                .define('F', ModItems.FUXU.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_P1.get())
                .pattern("SCS")
                .pattern("COC")
                .pattern("SCS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('C', Items.COBBLESTONE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_P2.get())
                .pattern("SNS")
                .pattern("NDN")
                .pattern("SNS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('N', Items.NETHER_BRICKS)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_P1.get()), has(ModItems.FUXU_P1.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_P3.get())
                .pattern("SES")
                .pattern("EDE")
                .pattern("SES")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('E', Items.END_STONE_BRICKS)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_P2.get()), has(ModItems.FUXU_P2.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SHOV1.get())
                .pattern("SXS")
                .pattern("XOX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.SAND)
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SHOV2.get())
                .pattern("SXS")
                .pattern("XDX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.SOUL_SOIL)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_SHOV1.get()), has(ModItems.FUXU_SHOV1.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SHOV3.get())
                .pattern("SYS")
                .pattern("XDX")
                .pattern("SYS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.SAND)
                .define('Y',Items.END_STONE)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_SHOV2.get()), has(ModItems.FUXU_SHOV2.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_A1.get())
                .pattern("SXS")
                .pattern("XOX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.OAK_PLANKS)
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_A2.get())
                .pattern("SXS")
                .pattern("XDX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.CRIMSON_PLANKS)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_A1.get()), has(ModItems.FUXU_A1.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_A3.get())
                .pattern("SYS")
                .pattern("XDX")
                .pattern("SYS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.WARPED_PLANKS)
                .define('Y',Items.END_STONE)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_A2.get()), has(ModItems.FUXU_A2.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SWORD1.get())
                .pattern("SXS")
                .pattern("XOX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.BONE)
                .define('O', Items.OBSIDIAN)
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SWORD2.get())
                .pattern("SXS")
                .pattern("XDX")
                .pattern("SXS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.BLAZE_ROD)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_SWORD1.get()), has(ModItems.FUXU_SWORD1.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FUXU_SWORD3.get())
                .pattern("SYS")
                .pattern("XDX")
                .pattern("SYS")
                .define('S', ModItems.FUXU_SHARD.get())
                .define('X', Items.ENDER_EYE)
                .define('Y',Items.END_STONE)
                .define('D', Items.DIAMOND)
                .unlockedBy(getHasName(ModItems.FUXU_SWORD2.get()), has(ModItems.FUXU_SWORD2.get()))
                .save(pWriter);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU.get(), 9)
                .requires(ModBlocks.FUXU_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.FUXU_BLOCK.get()), has(ModBlocks.FUXU_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SHARD.get(), 4)
                .requires(ModItems.FUXU.get())
                .unlockedBy(getHasName(ModItems.FUXU.get()), has(ModItems.FUXU.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SWORDI1.get(), 1)
                .requires(ModItems.FUXU_SWORD_BASE.get())
                .requires(ModItems.FUXU_SWORD1.get())
                .unlockedBy(getHasName(ModItems.FUXU_SWORD_BASE.get()), has(ModItems.FUXU_SWORD_BASE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SWORDI2.get(), 1)
                .requires(ModItems.FUXU_SWORDI1.get())
                .requires(ModItems.FUXU_SWORD2.get())
                .unlockedBy(getHasName(ModItems.FUXU_SWORDI1.get()), has(ModItems.FUXU_SWORDI1.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SWORDI3.get(), 1)
                .requires(ModItems.FUXU_SWORDI2.get())
                .requires(ModItems.FUXU_SWORD3.get())
                .unlockedBy(getHasName(ModItems.FUXU_SWORDI2.get()), has(ModItems.FUXU_SWORDI2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_BIGSWORD1.get(), 1)
                .requires(ModItems.FUXU_BIGSWORD_BASE.get())
                .requires(ModItems.FUXU_SWORD1.get())
                .unlockedBy(getHasName(ModItems.FUXU_BIGSWORD_BASE.get()), has(ModItems.FUXU_BIGSWORD_BASE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_BIGSWORD2.get(), 1)
                .requires(ModItems.FUXU_BIGSWORD2.get())
                .requires(ModItems.FUXU_SWORD2.get())
                .unlockedBy(getHasName(ModItems.FUXU_BIGSWORD1.get()), has(ModItems.FUXU_BIGSWORD1.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_BIGSWORD3.get(), 1)
                .requires(ModItems.FUXU_BIGSWORD2.get())
                .requires(ModItems.FUXU_SWORD3.get())
                .unlockedBy(getHasName(ModItems.FUXU_BIGSWORD2.get()), has(ModItems.FUXU_BIGSWORD2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SHOVEL1.get(), 1)
                .requires(ModItems.FUXU_SHOVEL_BASE.get())
                .requires(ModItems.FUXU_SHOV1.get())
                .unlockedBy(getHasName(ModItems.FUXU_SHOVEL_BASE.get()), has(ModItems.FUXU_SHOVEL_BASE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SHOVEL2.get(), 1)
                .requires(ModItems.FUXU_SHOVEL1.get())
                .requires(ModItems.FUXU_SHOV2.get())
                .unlockedBy(getHasName(ModItems.FUXU_SHOVEL1.get()), has(ModItems.FUXU_SHOVEL1.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_SHOVEL3.get(), 1)
                .requires(ModItems.FUXU_SHOVEL2.get())
                .requires(ModItems.FUXU_SHOV3.get())
                .unlockedBy(getHasName(ModItems.FUXU_SHOVEL2.get()), has(ModItems.FUXU_SHOVEL2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_PICKAXE1.get(), 1)
                .requires(ModItems.FUXU_PICKAXE_BASE.get())
                .requires(ModItems.FUXU_P1.get())
                .unlockedBy(getHasName(ModItems.FUXU_PICKAXE_BASE.get()), has(ModItems.FUXU_PICKAXE_BASE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_PICKAXE2.get(), 1)
                .requires(ModItems.FUXU_PICKAXE1.get())
                .requires(ModItems.FUXU_P2.get())
                .unlockedBy(getHasName(ModItems.FUXU_PICKAXE1.get()), has(ModItems.FUXU_PICKAXE1.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_PICKAXE3.get(), 1)
                .requires(ModItems.FUXU_PICKAXE2.get())
                .requires(ModItems.FUXU_P3.get())
                .unlockedBy(getHasName(ModItems.FUXU_PICKAXE2.get()), has(ModItems.FUXU_PICKAXE2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_AXE1.get(), 1)
                .requires(ModItems.FUXU_AXE_BASE.get())
                .requires(ModItems.FUXU_A1.get())
                .unlockedBy(getHasName(ModItems.FUXU_AXE_BASE.get()), has(ModItems.FUXU_AXE_BASE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_AXE2.get(), 1)
                .requires(ModItems.FUXU_AXE1.get())
                .requires(ModItems.FUXU_A2.get())
                .unlockedBy(getHasName(ModItems.FUXU_AXE1.get()), has(ModItems.FUXU_AXE1.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_AXE3.get(), 1)
                .requires(ModItems.FUXU_AXE2.get())
                .requires(ModItems.FUXU_A3.get())
                .unlockedBy(getHasName(ModItems.FUXU_AXE2.get()), has(ModItems.FUXU_AXE2.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FUXU_MULTITOOL.get(), 1)
                .requires(ModItems.FUXU_AXE3.get())
                .requires(ModItems.FUXU_PICKAXE3.get())
                .requires(ModItems.FUXU_SWORD3.get())
                .requires(ModItems.FUXU_SHOVEL3.get())
                .unlockedBy(getHasName(ModItems.FUXU_PICKAXE3.get()), has(ModItems.FUXU_PICKAXE3.get()))
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
