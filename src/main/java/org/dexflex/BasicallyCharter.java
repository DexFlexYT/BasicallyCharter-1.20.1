package org.dexflex;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.dexflex.block.ModBlocks;
import org.dexflex.item.ModItemGroups;
import org.dexflex.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class BasicallyCharter implements ModInitializer {
	public static final String MOD_ID = "basicallycharter";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID

	);
	public static final DefaultParticleType CHARTER_ESSENCE = FabricParticleTypes.simple();



	//mod sounds
	public static final Identifier DUSK_EPITAPH_ATTACK_ID = Identifier.of("basicallycharter", "dusk_epitaph_attack");
	public static final Identifier LESSER_DIVINITY_BLAST_ID = Identifier.of("basicallycharter", "lesser_divinity_blast");
	public static SoundEvent DUSK_EPITAPH_ATTACK = SoundEvent.of(DUSK_EPITAPH_ATTACK_ID);
	public static SoundEvent LESSER_DIVINITY_BLAST = SoundEvent.of(LESSER_DIVINITY_BLAST_ID);






	@Override
	public void onInitialize() {

		Registry.register(Registries.PARTICLE_TYPE, new Identifier("basicallycharter", "green_flame"), CHARTER_ESSENCE);

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
	}
}