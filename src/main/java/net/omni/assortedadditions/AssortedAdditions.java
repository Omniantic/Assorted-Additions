package net.omni.assortedadditions;

import net.fabricmc.api.ModInitializer;

import net.omni.assortedadditions.block.ModBlocks;
import net.omni.assortedadditions.item.ModItemGroups;
import net.omni.assortedadditions.item.ModItems;
import net.omni.assortedadditions.util.ModLootTablesModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssortedAdditions implements ModInitializer {
	public static final String MOD_ID = "assorted-additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTablesModifiers.modifyLootTables();
	}
}