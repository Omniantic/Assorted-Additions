package net.omni.assortedadditions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.omni.assortedadditions.AssortedAdditions;
import net.omni.assortedadditions.block.ModBlocks;

import java.awt.*;

public class ModItems {
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_SCRAPS = registerItem("iron_scraps", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item GOLDEN_TOMATO = registerItem("golden_tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_TOMATO).rarity(Rarity.RARE)));
    public static final Item SCYTHE = registerItem("scythe",
            new SwordItem(ModToolMaterial.STEEL, 9, -2.7f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AssortedAdditions.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        AssortedAdditions.LOGGER.info("Registering Mod Items for " + AssortedAdditions.MOD_ID);
    }
}
