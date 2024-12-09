package net.omni.assortedadditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.omni.assortedadditions.block.ModBlocks;
import net.omni.assortedadditions.block.custom.TomatoCropBlock;
import net.omni.assortedadditions.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_PLATE_BLOCK);
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_PLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SCRAPS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SCYTHE, Models.GENERATED);
    }
}
