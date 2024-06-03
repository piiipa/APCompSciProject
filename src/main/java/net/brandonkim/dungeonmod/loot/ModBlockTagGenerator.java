package net.brandonkim.dungeonmod.loot;

import net.brandonkim.dungeonmod.DungeonMod;
import net.brandonkim.dungeonmod.block.ModBlocks;
import net.brandonkim.dungeonmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DungeonMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.POOLIUM_BLOCK.get());



        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.POOLIUM_BLOCK.get());

        this.tag(ModTags.Blocks.NEEDS_POOLIUM_TOOL)
                .add(ModBlocks.POOLIUM_BLOCK.get());



    }
}
