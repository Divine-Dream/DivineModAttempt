package com.divinedream.divinemod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.world.NoteBlockEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class EightBallItem extends Item {
    public EightBallItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            //Output random number
            outputRandomNumber(player);
            //set a cooldown
            player.getCooldowns().addCooldown(this, 20);

       //     if (getRandomNumber() == 1) {
       //         player.hurt(DamageSource.ANVIL, 25F);
       //     } else if (getRandomNumber() == 2) {
       //
       //     }

            //if(getRandomNumber() == 1) {
            //    EntityType.PIGLIN_BRUTE.spawn();


            //level.addFreshEntity()
            //}
        }

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if(Screen.hasShiftDown()) {
            components.add(Component.literal("Right click for a surprise!").withStyle(ChatFormatting.RED));
        } else {
            components.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.AQUA));
        }


        super.appendHoverText(stack, level, components, flag);
    }

    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("You rolled: " + getRandomNumber()));
    }

    private int getRandomNumber() {
        return RandomSource.createNewThreadLocalInstance().nextInt(10)+1;
    }
}
