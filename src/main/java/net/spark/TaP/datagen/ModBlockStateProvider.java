package net.spark.TaP.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.spark.TaP.SparkTaP;
import net.spark.TaP.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SparkTaP.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FUXU_BLOCK);

        blockWithItem(ModBlocks.FUXU_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_FUXU_ORE);
        blockWithItem(ModBlocks.END_FUXU_ORE);
        blockWithItem(ModBlocks.NETHER_FUXU_ORE);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
