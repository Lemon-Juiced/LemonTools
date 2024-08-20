package dev.lemonjuice.lemon_tools.item.factory;

import net.minecraft.world.item.Tier;
import net.neoforged.neoforge.common.SimpleTier;

public class TierFactory {

    /**
     * Creates a sword tier based on the materials.
     *
     * @param bladeMaterial The material of the blade. (Controls damage)
     * @param hiltMaterial The material of the hilt. (Controls durability)
     * @param toolRodMaterial The material of the handle. (Controls attack speed / special abilities)
     * @return The sword tier.
     */
    public static Tier createSwordTier(String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        Tier tier = new SimpleTier();
    }
}
