package org.dexflex.item;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.dexflex.BasicallyCharter;
import org.dexflex.item.custom.DuskEpitaphItem;
import org.dexflex.item.custom.LesserDivinityItem;
public class ModItems {
// Items
    public static final Item LESSER_INGOT = registerItem("lesser_ingot", new Item(new FabricItemSettings()));
    public static final Item LESSER_DIVINITY_FRAGMENT = registerItem("lesser_divinity_fragment", new Item(new FabricItemSettings().maxCount(16)));
    public static final Item SIGNED_CONTRACT  = registerItem("signed_contract", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item LESSER_DIVINITY  = registerItem("lesser_divinity", new LesserDivinityItem(new FabricItemSettings().maxCount(1).maxDamage(3)));
    public static final Item DUSK_EPITAPH  = registerItem("dusk_epitaph", new DuskEpitaphItem(ToolMaterials.NETHERITE, 7, -2.8f, new FabricItemSettings()));
// registry methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BasicallyCharter.MOD_ID, name),item);
    }
    public static void registerModItems(){
        BasicallyCharter.LOGGER.info("Registering Mod Items For"+BasicallyCharter.MOD_ID);
    }
}