package net.brandonkim.dungeonmod.item;

import net.brandonkim.dungeonmod.DungeonMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DungeonMod.MOD_ID);

    public static final RegistryObject<Item> POOLIUM = ITEMS.register("poolium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POOLIUM_SWORD = ITEMS.register("poolium_sword",
            () -> new SwordItem(ModToolTiers.POOLIUM, 4, -2, new Item.Properties()));

    public static final RegistryObject<Item> POOLIUM_PICKAXE = ITEMS.register("poolium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.POOLIUM, 1, -3, new Item.Properties()));

    public static final RegistryObject<Item> POOLIUM_AXE = ITEMS.register("poolium_axe",
            () -> new AxeItem(ModToolTiers.POOLIUM, 9, -3, new Item.Properties()));

    public static final RegistryObject<Item> POOLIUM_SHOVEL = ITEMS.register("poolium_shovel",
            () -> new ShovelItem(ModToolTiers.POOLIUM, 0, -3, new Item.Properties()));

    public static final RegistryObject<Item> POOLIUM_HOE = ITEMS.register("poolium_hoe",
            () -> new HoeItem(ModToolTiers.POOLIUM, 0, 0, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
