package dev.lemonjuice.lemon_tools.util;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ResourceUtil {
    public record headResource(String specifier, String name, Ingredient ingredient, float attackDamageBonus){}
    public record bindResource(String specifier, String name, Ingredient ingredient, int durability){}
    public record rodResource(String specifier, String name, Ingredient ingredient, float attackSpeedBonus){}

    // Tool Head Resources
    headResource woodHeadResource = new headResource("wood", "wooden", Ingredient.of(ItemTags.PLANKS), 0.0F);
    headResource stoneHeadResource = new headResource("stone", "stone", Ingredient.of(ItemTags.STONE_TOOL_MATERIALS), 0.0F);
    headResource ironHeadResource = new headResource("iron", "iron", Ingredient.of(Items.IRON_INGOT), 0.0F);
    headResource goldHeadResource = new headResource("gold", "golden", Ingredient.of(Items.GOLD_INGOT), 0.0F);
    headResource diamondHeadResource = new headResource("diamond", "diamond", Ingredient.of(Items.DIAMOND), 0.0F);
    headResource netheriteHeadResource = new headResource("netherite", "netherite", Ingredient.of(Items.NETHERITE_INGOT), 0.0F);

    // Bind Resources
    bindResource woodBindResource = new bindResource("wood", "wooden", Ingredient.of(ItemTags.PLANKS), 59);
    bindResource stoneBindResource = new bindResource("stone", "stone", Ingredient.of(ItemTags.STONE_TOOL_MATERIALS), 131);
    bindResource ironBindResource = new bindResource("iron", "iron", Ingredient.of(Items.IRON_INGOT), 250);
    bindResource goldBindResource = new bindResource("gold", "golden", Ingredient.of(Items.GOLD_INGOT), 32);
    bindResource diamondBindResource = new bindResource("diamond", "diamond", Ingredient.of(Items.DIAMOND), 1561);
    bindResource netheriteBindResource = new bindResource("netherite", "netherite", Ingredient.of(Items.NETHERITE_INGOT), 2031);

    // Tool Rod Resources
    rodResource bambooRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.BAMBOO), 0.0F);
    rodResource boneRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.BONE), 0.0F);
    rodResource blazeRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.BLAZE_ROD), 0.0F);
    rodResource endRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.END_ROD), 0.0F);
    rodResource woodenRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.STICK), 0.0F);
}
