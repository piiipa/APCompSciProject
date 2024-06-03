package net.brandonkim.dungeonmod.loot;

import net.brandonkim.dungeonmod.DungeonMod;
import net.brandonkim.dungeonmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DungeonMod.MOD_ID, existingFileHelper);
    }
    protected void registerModels() {
        handheldItem(ModItems.POOLIUM_SWORD);
        handheldItem(ModItems.POOLIUM_PICKAXE);
        handheldItem(ModItems.POOLIUM_AXE);
        handheldItem(ModItems.POOLIUM_SHOVEL);
        handheldItem(ModItems.POOLIUM_HOE);
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DungeonMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
