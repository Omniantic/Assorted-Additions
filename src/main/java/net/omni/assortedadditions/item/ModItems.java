package net.omni.assortedadditions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omni.assortedadditions.AssortedAdditions;

public class ModItems {
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_PLATE = registerItem("steel_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_SCRAPS = registerItem("iron_scraps", new Item(new FabricItemSettings()));
    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item GOLDEN_TOMATO = registerItem("golden_tomato", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_TOMATO)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AssortedAdditions.MOD_ID, name), item);
    }

    public static void  registerModItems() {
        AssortedAdditions.LOGGER.info("Registering Mod Items for " + AssortedAdditions.MOD_ID);
    }
}
