package org.dexflex.item.custom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.GameMode;
import org.dexflex.BasicallyCharter;
public class LesserDivinityItem extends Item {
    public LesserDivinityItem(Settings settings) {
        super(settings);
    }
    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (entity instanceof ServerPlayerEntity serverPlayer) {
            user.getWorld().playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), BasicallyCharter.LESSER_DIVINITY_BLAST, SoundCategory.PLAYERS, .25F, 1.0F / (user.getWorld().getRandom().nextFloat() * 0.3F + 1.0F));
            serverPlayer.changeGameMode(GameMode.SPECTATOR);
            user.getStackInHand(hand).damage(1, user,
                    playerEntity -> playerEntity.sendToolBreakStatus(hand));
        } else {
            BasicallyCharter.LOGGER.info("non player entity!!!");
        }

        return ActionResult.CONSUME;
    }
}