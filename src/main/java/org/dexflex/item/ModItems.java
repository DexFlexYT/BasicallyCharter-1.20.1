package org.dexflex.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.dexflex.BasicallyCharter;

public class ModItems {






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BasicallyCharter.MOD_ID, name),item);
    }
    public static void registerModItems(){
        BasicallyCharter.LOGGER.info("Registering Mod Items For"+BasicallyCharter.MOD_ID);
    }
}
