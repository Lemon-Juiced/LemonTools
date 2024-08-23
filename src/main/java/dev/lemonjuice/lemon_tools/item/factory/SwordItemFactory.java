package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtilConverter;
import dev.lemonjuice.lemon_tools.util.ResourceUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import java.util.List;

import static dev.lemonjuice.lemon_tools.item.LemonToolsItems.ITEMS;

/**
 * A factory class that generates sword items.
 */
public class SwordItemFactory {

    /**
     * Creates all sword items and registers them.
     */
    public static void createSwordItems() {
        List<ResourceUtil.headResource> bladeMaterials = ListUtilConverter.getBladeMaterials();
        List<ResourceUtil.bindResource> hiltMaterials = ListUtilConverter.getHiltMaterials();
        List<ResourceUtil.rodResource> toolRodMaterials = ListUtilConverter.getToolRodMaterials();

        for (int i = 0; i < bladeMaterials.size(); i++) {
            for (int j = 0; j < hiltMaterials.size(); j++) {
                for (int k = 0; k < toolRodMaterials.size(); k++) {
                    createSwordItem(bladeMaterials.get(i), hiltMaterials.get(j), toolRodMaterials.get(k));
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
        ITEMS.register(swordName, () -> new LTSwordItem(tier, (new Item.Properties()).attributes(LTSwordItem.createAttributes(tier, 3, -2.4F)), bladeMaterial.specifier(), hiltMaterial.specifier(), toolRodMaterial.specifier()));
    }

    /**
     * Builds the name of the sword based on the materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     * @return The name of the sword.
     */
    public static String swordNameBuilder(ResourceUtil.headResource bladeMaterial, ResourceUtil.bindResource hiltMaterial, ResourceUtil.rodResource toolRodMaterial) {
        return bladeMaterial.specifier() + "_" + hiltMaterial.specifier() + "_" + toolRodMaterial.specifier() + "_sword";
    }
}