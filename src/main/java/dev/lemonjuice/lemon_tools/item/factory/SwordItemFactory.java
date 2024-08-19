package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

import java.util.ArrayList;

public class SwordItemFactory {

    /**
     * Creates all possible sword items.
     *
     * @return The list of sword items.
     */
    public static ArrayList<LTSwordItem> createSwordItems() {
        ArrayList<LTSwordItem> swordItems = new ArrayList<>();
        for (String bladeMaterial : ListUtil.bladeMaterials) {
            for (String hiltMaterial : ListUtil.hiltMaterials) {
                for (String toolRodMaterial : ListUtil.toolRodMaterials) {
                    LTSwordItem swordItem = createSwordItem(bladeMaterial, hiltMaterial, toolRodMaterial);
                    swordItems.add(swordItem);
                }
            }
        }
        return swordItems;
    }

    /**
     * Creates a sword item with the given materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the tool rod.
     * @return The sword item.
     */
    public static LTSwordItem createSwordItem(String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        Tier tier = getTierFromBladeMaterial(bladeMaterial);
        Item.Properties properties = new Item.Properties().attributes(SwordItem.createAttributes(tier, 3, -2.4F));

        return new LTSwordItem(tier, properties, bladeMaterial, hiltMaterial, toolRodMaterial);
    }


    /**
     * Returns the tier of the sword based on the blade material.
     *
     * @param bladeMaterial The material of the blade.
     * @return The tier of the sword.
     */
    public static Tier getTierFromBladeMaterial(String bladeMaterial) {
        switch (bladeMaterial) {
            case "stone":
                return Tiers.STONE;
            case "iron":
                return Tiers.IRON;
            case "gold":
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
