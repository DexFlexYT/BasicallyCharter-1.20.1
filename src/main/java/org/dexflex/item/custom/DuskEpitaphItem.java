package org.dexflex.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import org.dexflex.BasicallyCharter;

public class DuskEpitaphItem extends SwordItem {
    public DuskEpitaphItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        attacker.getWorld().playSound((PlayerEntity)null, attacker.getX(), attacker.getY(), attacker.getZ(), BasicallyCharter.DUSK_EPITAPH_ATTACK, SoundCategory.PLAYERS, .25F, 1.0F / (attacker.getWorld().getRandom().nextFloat() * 0.3F + 1.0F));
        return super.postHit(stack, target, attacker);
    }
}
