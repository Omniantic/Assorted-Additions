package net.omni.assortedadditions.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.omni.assortedadditions.AssortedAdditions;
import net.omni.assortedadditions.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ASSORTED_ADDITIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AssortedAdditions.MOD_ID, "assorted_additions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.assorted_additions"))
                    .icon(() -> new ItemStack(ModItems.STEEL_PLATE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_PLATE);
                        entries.add(ModItems.IRON_SCRAPS);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.GOLDEN_TOMATO);

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.STEEL_PLATE_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        AssortedAdditions.LOGGER.info("Registering Item Groups for " + AssortedAdditions.MOD_ID);
    }
}
