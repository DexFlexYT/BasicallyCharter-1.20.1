package org.dexflex;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.dexflex.datagen.*;

public class BasicallyCharterDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableProv::new);
		pack.addProvider(ModModelProv::new);
		pack.addProvider(ModBlockTagProv::new);
		pack.addProvider(ModItemTagProv::new);
		pack.addProvider(ModRecipeProv::new);

	}
}
