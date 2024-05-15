package net.spark.TaP.datagen.loot;

import net.spark.TaP.block.ModBlocks;
import net.spark.TaP.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FUXU_BLOCK.get());

        this.add(ModBlocks.FUXU_ORE.get(),
                block -> createOreDrop(ModBlocks.FUXU_ORE.get(), ModItems.RAW_FUXU.get()));
        this.add(ModBlocks.DEEPSLATE_FUXU_ORE.get(),
                block -> createCustomOreDrop(ModBlocks.DEEPSLATE_FUXU_ORE.get(), ModItems.RAW_FUXU.get(), 1.0F, 2.0F));
        this.add(ModBlocks.NETHER_FUXU_ORE.get(),
                block -> createCustomOreDrop(ModBlocks.NETHER_FUXU_ORE.get(), ModItems.RAW_FUXU.get(), 1.0F, 3.0F));
        this.add(ModBlocks.END_FUXU_ORE.get(),
                block -> createCustomOreDrop(ModBlocks.END_FUXU_ORE.get(), ModItems.RAW_FUXU.get(),2.0F, 4.0F));

    }

    protected LootTable.Builder createCustomOreDrop(Block pBlock, Item item, float min, float max) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
