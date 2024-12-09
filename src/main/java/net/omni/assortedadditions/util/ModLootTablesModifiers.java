package net.omni.assortedadditions.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.omni.assortedadditions.item.ModItems;

public class ModLootTablesModifiers {
    private static final Identifier ABANDONED_MINESHAFT_ID =
            new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier SIMPLE_DUNGEON_ID =
            new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier WOODLAND_MANSION_ID =
            new Identifier("minecraft", "chests/woodland_mansion");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {
            if(ABANDONED_MINESHAFT_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());

                builder.pool(poolBuilder.build());
            }
            if(SIMPLE_DUNGEON_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());

                builder.pool(poolBuilder.build());
            }
            if(WOODLAND_MANSION_ID.equals(identifier)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TOMATO_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 4.0f)).build());

                builder.pool(poolBuilder.build());
            }


        });
    }
}
