package net.spark.TaP.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.spark.TaP.SparkTaP;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SparkTaP.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SPARKTAP_TAB = CREATIVE_MODE_TABS.register("sparktap_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FUXU.get()))
                    .title(Component.translatable("creativetab.sparktap_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FUXU.get());
                        pOutput.accept(ModItems.RAW_FUXU.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
