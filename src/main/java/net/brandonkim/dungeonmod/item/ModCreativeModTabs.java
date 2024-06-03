package net.brandonkim.dungeonmod.item;

import net.brandonkim.dungeonmod.DungeonMod;
import net.brandonkim.dungeonmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DungeonMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.POOLIUM.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.POOLIUM.get());
                        pOutput.accept(ModItems.POOLIUM_PICKAXE.get());
                        pOutput.accept(ModItems.POOLIUM_AXE.get());
                        pOutput.accept(ModItems.POOLIUM_SHOVEL.get());
                        pOutput.accept(ModItems.POOLIUM_SWORD.get());


                        pOutput.accept(Items.DIAMOND);

                        pOutput.accept(ModBlocks.POOLIUM_BLOCK.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
