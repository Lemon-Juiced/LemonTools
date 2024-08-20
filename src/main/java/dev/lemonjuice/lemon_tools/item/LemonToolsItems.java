package dev.lemonjuice.lemon_tools.item;

import dev.lemonjuice.lemon_tools.LemonTools;
import dev.lemonjuice.lemon_tools.item.factory.SwordItemFactory;
import dev.lemonjuice.lemon_tools.item.template.TemplateItem;
import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import dev.lemonjuice.lemon_tools.util.ListUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;

public class LemonToolsItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LemonTools.MOD_ID);
    public static final DeferredRegister.Items SWORD_ITEMS = DeferredRegister.createItems(LemonTools.MOD_ID);

    // Templates
    public static final DeferredItem<Item> BLUEPRINT = ITEMS.register("blueprint", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLADE_TEMPLATE = ITEMS.register("blade_template", () -> new TemplateItem(new Item.Properties()));
    public static final DeferredItem<Item> HILT_TEMPLATE = ITEMS.register("hilt_template", () -> new TemplateItem(new Item.Properties()));
    public static final DeferredItem<Item> TOOL_ROD_LONG_TEMPLATE = ITEMS.register("tool_rod_long_template", () -> new TemplateItem(new Item.Properties()));
    public static final DeferredItem<Item> TOOL_ROD_SHORT_TEMPLATE = ITEMS.register("tool_rod_short_template", () -> new TemplateItem(new Item.Properties()));

    // Blades
    public static final DeferredItem<Item> WOODEN_BLADE = ITEMS.register("wooden_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_BLADE = ITEMS.register("stone_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_BLADE = ITEMS.register("iron_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_BLADE = ITEMS.register("golden_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_BLADE = ITEMS.register("diamond_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_BLADE = ITEMS.register("netherite_blade", () -> new Item(new Item.Properties()));

    // Hilts
    public static final DeferredItem<Item> WOODEN_HILT = ITEMS.register("wooden_hilt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_HILT = ITEMS.register("stone_hilt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HILT = ITEMS.register("iron_hilt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_HILT = ITEMS.register("golden_hilt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_HILT = ITEMS.register("diamond_hilt", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_HILT = ITEMS.register("netherite_hilt", () -> new Item(new Item.Properties()));

    // Tool Rods (Long)

    // Tool Rods (Short)
    public static final DeferredItem<Item> BAMBOO_TOOL_ROD_SHORT = ITEMS.register("bamboo_tool_rod_short", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLAZE_TOOL_ROD_SHORT = ITEMS.register("blaze_tool_rod_short", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BONE_TOOL_ROD_SHORT = ITEMS.register("bone_tool_rod_short", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> END_TOOL_ROD_SHORT = ITEMS.register("end_tool_rod_short", () -> new Item(new Item.Properties()));
    // Maybe we can add Lightning Rods?
    public static final DeferredItem<Item> WOODEN_TOOL_ROD_SHORT = ITEMS.register("wooden_tool_rod_short", () -> new Item(new Item.Properties()));

    // Swords
    public static final DeferredItem<Item> NETHERITE_NETHERITE_WOODEN_SWORD = ITEMS.register("netherite_netherite_wooden_sword", () -> new LTSwordItem(Tiers.NETHERITE, (new Item.Properties()).attributes(SwordItem.createAttributes(Tiers.NETHERITE, 3, -2.4F)), "netherite", "netherite", "wooden"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        SWORD_ITEMS.register(eventBus);
    }

    // ^ NICE CODE ENDS HERE ^
    // v BAD CODE STARTS HERE v

    /**
     * Creates all sword items and registers them.
     *
     * @return The sword items in a DeferredRegister.
     */
    public static void createSwordItems() {
        for (int i = 0; i < ListUtil.bladeMaterials.size(); i++) {
            for (int j = 0; j < ListUtil.hiltMaterials.size(); j++) {
                for (int k = 0; k < ListUtil.toolRodMaterials.size(); k++) {
                    LTSwordItem swordItem = createSwordItem(ListUtil.bladeMaterials.get(i), ListUtil.hiltMaterials.get(j), ListUtil.toolRodMaterials.get(k));
                    SWORD_ITEMS.register(swordItem.getSwordName(), () -> swordItem);
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
