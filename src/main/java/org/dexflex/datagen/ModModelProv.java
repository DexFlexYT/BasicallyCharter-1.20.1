package org.dexflex.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import org.dexflex.item.ModItems;

public class ModModelProv extends FabricModelProvider {
    public ModModelProv(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //add block models here

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //add item models here
        itemModelGenerator.register(ModItems.LESSER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESSER_DIVINITY_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SIGNED_CONTRACT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUSK_EPITAPH, Models.HANDHELD);

    }
}