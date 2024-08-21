package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.LemonTools;
import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtil;
import dev.lemonjuice.lemon_tools.util.ResourceUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.lemonjuice.lemon_tools.item.LemonToolsItems.ITEMS;

/**
 * A factory class that generates sword items.
 */
public class SwordItemFactory {

    /**
     * Creates all sword items and registers them.
     */
    public static void createSwordItems() {
        for (int i = 0; i < ListUtil.bladeMaterials.size(); i++) {
            for (int j = 0; j < ListUtil.hiltMaterials.size(); j++) {
                for (int k = 0; k < ListUtil.toolRodMaterials.size(); k++) {
                    createSwordItem(ListUtil.bladeMaterials.get(i), ListUtil.hiltMaterials.get(j), ListUtil.toolRodMaterials.get(k));
                }
            }
        }
    }

    /**
     * Creates sword items based on the materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     */
    public static void createSwordItem(ResourceUtil.headResource bladeMaterial, ResourceUtil.bindResource hiltMaterial, ResourceUtil.rodResource toolRodMaterial) {
        Tier tier = TierFactory.createSwordTier(bladeMaterial, hiltMaterial, toolRodMaterial);
        String swordName = swordNameBuilder(bladeMaterial, hiltMaterial, toolRodMaterial);
        ITEMS.register(swordName, () -> new LTSwordItem(tier, (new Item.Properties()).attributes(SwordItem.createAttributes(tier, 3, -2.4F)), bladeMaterial.name(), hiltMaterial.name(), toolRodMaterial.name()));
    }

    /**
     * Builds the name of the sword based on the materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     * @return The name of the sword.
     */
    public static String swordNameBuilder(ResourceUtil.headResource bladeMaterial, ResourceUtil.bindResource hiltMaterial, ResourceUtil.rodResource toolRodMaterial){
        return bladeMaterial + "_" + hiltMaterial + "_" + toolRodMaterial + "_sword";
    }

    /**
     * Gets the tier of the sword based on the material.
     *
     * @param material The material of the sword.
     * @return The tier of the sword.
     */
    public static Tier getTier(String material) {
        switch (material) {
            case "stone":
                return Tiers.STONE;
            case "iron":
                return Tiers.IRON;
            case "golden":
                return Tiers.GOLD;
            case "diamond":
                return Tiers.DIAMOND;
            case "netherite":
                return Tiers.NETHERITE;
            default:
                return Tiers.WOOD;
        }
    }
}
