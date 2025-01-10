package org.dexflex.item;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.dexflex.BasicallyCharter;
public class ModItemGroups {
    public static final ItemGroup BASICALLY_CHARTER = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BasicallyCharter.MOD_ID, "basically_charter"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.basically_charter"))
                    .icon(()-> new ItemStack(ModItems.LESSER_DIVINITY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LESSER_DIVINITY);
                        entries.add(ModItems.SIGNED_CONTRACT);
                        entries.add(ModItems.LESSER_INGOT);
                        entries.add(ModItems.LESSER_DIVINITY_FRAGMENT);
                    }).build());
    public static void registerItemGroups(){
        BasicallyCharter.LOGGER.info("Registering Item Groups For "+BasicallyCharter.MOD_ID);
    }
}