package net.spark.TaP.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.spark.TaP.SparkTaP;
import net.spark.TaP.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SparkTaP.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FUXU);
        simpleItem(ModItems.RAW_FUXU);
        simpleItem(ModItems.FUXU_A1);
        simpleItem(ModItems.FUXU_A2);
        simpleItem(ModItems.FUXU_A3);
        simpleItem(ModItems.FUXU_P1);
        simpleItem(ModItems.FUXU_P2);
        simpleItem(ModItems.FUXU_P3);
        simpleItem(ModItems.FUXU_SHOV1);
        simpleItem(ModItems.FUXU_SHOV2);
        simpleItem(ModItems.FUXU_SHOV3);
        simpleItem(ModItems.FUXU_SWORD1);
        simpleItem(ModItems.FUXU_SWORD2);
        simpleItem(ModItems.FUXU_SWORD3);
        simpleItem(ModItems.FUXU_SHARD);

        handheldItem(ModItems.FUXU_PICKAXE_BASE);
        handheldItem(ModItems.FUXU_PICKAXE1);
        handheldItem(ModItems.FUXU_PICKAXE2);
        handheldItem(ModItems.FUXU_PICKAXE3);
        handheldItem(ModItems.FUXU_AXE_BASE);
        handheldItem(ModItems.FUXU_AXE1);
        handheldItem(ModItems.FUXU_AXE2);
        handheldItem(ModItems.FUXU_AXE3);
        handheldItem(ModItems.FUXU_SWORD_BASE);
        handheldItem(ModItems.FUXU_SWORDI1);
        handheldItem(ModItems.FUXU_SWORDI2);
        handheldItem(ModItems.FUXU_SWORDI3);
        handheldItem(ModItems.FUXU_BIGSWORD_BASE);
        handheldItem(ModItems.FUXU_BIGSWORD1);
        handheldItem(ModItems.FUXU_BIGSWORD2);
        handheldItem(ModItems.FUXU_BIGSWORD3);
        handheldItem(ModItems.FUXU_SHOVEL_BASE);
        handheldItem(ModItems.FUXU_SHOVEL1);
        handheldItem(ModItems.FUXU_SHOVEL2);
        handheldItem(ModItems.FUXU_SHOVEL3);
        handheldItem(ModItems.FUXU_MULTITOOL);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SparkTaP.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(SparkTaP.MOD_ID,"item/" + item.getId().getPath()));
    }
}
