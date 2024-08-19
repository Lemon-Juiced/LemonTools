package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.LemonTools;
import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * A factory class that generates sword items.
 */
public class SwordItemFactory {
    public static final DeferredRegister.Items SWORD_ITEMS = DeferredRegister.createItems(LemonTools.MOD_ID);

    /**
     * Creates all sword items and registers them.
     *
     * @return The sword items in a DeferredRegister.
     */
    public static DeferredRegister.Items createSwordItems() {
        for (int i = 0; i < ListUtil.bladeMaterials.size(); i++) {
            for (int j = 0; j < ListUtil.hiltMaterials.size(); j++) {
                for (int k = 0; k < ListUtil.toolRodMaterials.size(); k++) {
                    LTSwordItem swordItem = createSwordItem(ListUtil.bladeMaterials.get(i), ListUtil.hiltMaterials.get(j), ListUtil.toolRodMaterials.get(k));
                    SWORD_ITEMS.register(swordItem.getSwordName(), () -> swordItem);
                    System.out.println("Registered sword item: " + swordItem.getSwordName());
                }
            }
        }

        return SWORD_ITEMS;
    }

    /**
     * Creates sword items based on the materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     * @return The sword items.
     */
    public static LTSwordItem createSwordItem(String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        Tier tier = getTier(bladeMaterial);
        return new LTSwordItem(tier, (new Item.Properties()).attributes(SwordItem.createAttributes(tier, 3, -2.4F)), bladeMaterial, hiltMaterial, toolRodMaterial);
    }

    /**
     * Gets the tier of the sword based on the material.
     *
     * @param material The material of the sword.
     * @return The tier of the sword.
     */
    public static Tier getTier(String material) {
        switch (material) {
            case "wooden":
                return Tiers.WOOD;
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
