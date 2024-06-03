package net.brandonkim.dungeonmod.item;

import net.brandonkim.dungeonmod.DungeonMod;
import net.brandonkim.dungeonmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier POOLIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2400, 11f, 4f, 25,
                ModTags.Blocks.NEEDS_POOLIUM_TOOL, () -> Ingredient.of(ModItems.POOLIUM.get())),
            new ResourceLocation(DungeonMod.MOD_ID, "poolium"), List.of(Tiers.NETHERITE), List.of());


}

