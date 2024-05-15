package net.spark.TaP.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.spark.TaP.SparkTaP;
import net.spark.TaP.block.ModBlocks;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, SparkTaP.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.FUXU_BLOCK.get(),
                        ModBlocks.FUXU_ORE.get(),
                        ModBlocks.DEEPSLATE_FUXU_ORE.get(),
                        ModBlocks.NETHER_FUXU_ORE.get(),
                        ModBlocks.END_FUXU_ORE.get());


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FUXU_BLOCK.get(),
                        ModBlocks.FUXU_ORE.get(),
                        ModBlocks.DEEPSLATE_FUXU_ORE.get(),
                        ModBlocks.NETHER_FUXU_ORE.get(),
                        ModBlocks.END_FUXU_ORE.get());
    }
}

