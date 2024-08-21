package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.util.ResourceUtil;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.neoforged.neoforge.common.SimpleTier;

public class TierFactory {

    /**
     * Creates a sword tier based on the materials.
     *
     * This is ugly and I don't like it but it's the best I can do for now.
     *
     * @param bladeRes The material of the blade. (Controls damage / enchantability)
     * @param hiltRes The material of the hilt. (Controls durability)
     * @param rodRes The material of the handle. (Controls attack speed / special abilities)
     * @return The sword tier.
     */
    public static Tier createSwordTier(ResourceUtil.headResource bladeRes, ResourceUtil.bindResource hiltRes, ResourceUtil.rodResource rodRes) {

        if (bladeRes.ingredient() == ResourceUtil.woodHeadResource.ingredient())
            return new SimpleTier(BlockTags.INCORRECT_FOR_WOODEN_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
        else if (bladeRes.ingredient() == ResourceUtil.stoneHeadResource.ingredient())
            return new SimpleTier(BlockTags.INCORRECT_FOR_STONE_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
        else if (bladeRes.ingredient() == ResourceUtil.ironHeadResource.ingredient())
            return new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
        else if (bladeRes.ingredient() == ResourceUtil.goldHeadResource.ingredient())
            return new SimpleTier(BlockTags.INCORRECT_FOR_GOLD_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
        else if (bladeRes.ingredient() == ResourceUtil.diamondHeadResource.ingredient())
            return new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
        else // We are Netherite
            return new SimpleTier(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, hiltRes.durability(), rodRes.attackSpeedBonus(), bladeRes.attackDamageBonus(), bladeRes.enchantability(), () -> bladeRes.ingredient());
    }
}
