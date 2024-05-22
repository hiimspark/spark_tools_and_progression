package net.spark.TaP.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.spark.TaP.SparkTaP;
import net.spark.TaP.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SparkTaP.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPARKTAP_TAB = CREATIVE_MODE_TABS.register("sparktap_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FUXU.get()))
                    .title(Component.translatable("creativetab.sparktap_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.FUXU_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_FUXU_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_FUXU_ORE.get());
                        pOutput.accept(ModBlocks.END_FUXU_ORE.get());
                        pOutput.accept(ModBlocks.FUXU_BLOCK.get());
                        pOutput.accept(ModItems.FUXU.get());
                        pOutput.accept(ModItems.RAW_FUXU.get());
                        pOutput.accept(ModItems.FUXU_A1.get());
                        pOutput.accept(ModItems.FUXU_A2.get());
                        pOutput.accept(ModItems.FUXU_A3.get());
                        pOutput.accept(ModItems.FUXU_P1.get());
                        pOutput.accept(ModItems.FUXU_P2.get());
                        pOutput.accept(ModItems.FUXU_P3.get());
                        pOutput.accept(ModItems.FUXU_SHOV1.get());
                        pOutput.accept(ModItems.FUXU_SHOV2.get());
                        pOutput.accept(ModItems.FUXU_SHOV3.get());
                        pOutput.accept(ModItems.FUXU_SWORD1.get());
                        pOutput.accept(ModItems.FUXU_SWORD2.get());
                        pOutput.accept(ModItems.FUXU_SWORD3.get());
                        pOutput.accept(ModItems.FUXU_SHARD.get());
                        pOutput.accept(ModItems.FUXU_PICKAXE_BASE.get());
                        pOutput.accept(ModItems.FUXU_PICKAXE1.get());
                        pOutput.accept(ModItems.FUXU_PICKAXE2.get());
                        pOutput.accept(ModItems.FUXU_PICKAXE3.get());
                        pOutput.accept(ModItems.FUXU_AXE_BASE.get());
                        pOutput.accept(ModItems.FUXU_AXE1.get());
                        pOutput.accept(ModItems.FUXU_AXE2.get());
                        pOutput.accept(ModItems.FUXU_AXE3.get());
                        pOutput.accept(ModItems.FUXU_SWORD_BASE.get());
                        pOutput.accept(ModItems.FUXU_SWORDI1.get());
                        pOutput.accept(ModItems.FUXU_SWORDI2.get());
                        pOutput.accept(ModItems.FUXU_SWORDI3.get());
                        pOutput.accept(ModItems.FUXU_BIGSWORD_BASE.get());
                        pOutput.accept(ModItems.FUXU_BIGSWORD1.get());
                        pOutput.accept(ModItems.FUXU_BIGSWORD2.get());
                        pOutput.accept(ModItems.FUXU_BIGSWORD3.get());
                        pOutput.accept(ModItems.FUXU_SHOVEL_BASE.get());
                        pOutput.accept(ModItems.FUXU_SHOVEL1.get());
                        pOutput.accept(ModItems.FUXU_SHOVEL2.get());
                        pOutput.accept(ModItems.FUXU_SHOVEL3.get());
                        pOutput.accept(ModItems.FUXU_MULTITOOL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
