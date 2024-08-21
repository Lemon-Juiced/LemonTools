package dev.lemonjuice.lemon_tools.item.factory;

import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtil;
import dev.lemonjuice.lemon_tools.util.ResourceUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

import static dev.lemonjuice.lemon_tools.item.LemonToolsItems.ITEMS;

/**
 * A factory class that generates sword items.
 */
public class SwordItemFactory {

    public SwordItemFactory() {
        createSwordItems();
    }

    /**
     * Creates all sword items and registers them.
     */
    public void createSwordItems() {
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
    public void createSwordItem(ResourceUtil.headResource bladeMaterial, ResourceUtil.bindResource hiltMaterial, ResourceUtil.rodResource toolRodMaterial) {
        Tier tier = TierFactory.createSwordTier(bladeMaterial, hiltMaterial, toolRodMaterial);
        String swordName = swordNameBuilder(bladeMaterial, hiltMaterial, toolRodMaterial);
        ITEMS.register(swordName, () -> new LTSwordItem(tier, (new Item.Properties()).attributes(LTSwordItem.createAttributes(tier, 3, -2.4F)), bladeMaterial.name(), hiltMaterial.name(), toolRodMaterial.name()));
    }

    /**
     * Builds the name of the sword based on the materials.
     *
     * @param bladeMaterial The material of the blade.
     * @param hiltMaterial The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     * @return The name of the sword.
     */
    public String swordNameBuilder(ResourceUtil.headResource bladeMaterial, ResourceUtil.bindResource hiltMaterial, ResourceUtil.rodResource toolRodMaterial){
        return bladeMaterial + "_" + hiltMaterial + "_" + toolRodMaterial + "_sword";
    }
}
