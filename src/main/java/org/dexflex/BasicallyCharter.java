package org.dexflex;
import net.fabricmc.api.ModInitializer;
import org.dexflex.block.ModBlocks;
import org.dexflex.item.ModItemGroups;
import org.dexflex.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class BasicallyCharter implements ModInitializer {
	public static final String MOD_ID = "basicallycharter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}