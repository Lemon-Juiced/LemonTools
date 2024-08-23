package dev.lemonjuice.lemon_tools.util;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ResourceUtil {
    public record headResource(String specifier, String name, Ingredient ingredient, float attackDamageBonus, int enchantability){}
    public record bindResource(String specifier, String name, Ingredient ingredient, int durability){}
    public record rodResource(String specifier, String name, Ingredient ingredient, float attackSpeedBonus){}

    // Tool Head Resources
    public static headResource woodHeadResource = new headResource("wooden", "wood", Ingredient.of(ItemTags.PLANKS), 0.0F, 15);
    public static headResource stoneHeadResource = new headResource("stone", "stone", Ingredient.of(ItemTags.STONE_TOOL_MATERIALS), 1.0F, 5);
    public static headResource ironHeadResource = new headResource("iron", "iron", Ingredient.of(Items.IRON_INGOT), 2.0F, 14);
    public static headResource goldHeadResource = new headResource("golden", "gold", Ingredient.of(Items.GOLD_INGOT), 0.0F, 22);
    public static headResource diamondHeadResource = new headResource("diamond", "diamond", Ingredient.of(Items.DIAMOND), 3.0F, 10);
    public static headResource netheriteHeadResource = new headResource("netherite", "netherite", Ingredient.of(Items.NETHERITE_INGOT), 4.0F, 15);

    // Bind Resources
    public static bindResource woodBindResource = new bindResource("wooden", "wood", Ingredient.of(ItemTags.PLANKS), 59);
    public static bindResource stoneBindResource = new bindResource("stone", "stone", Ingredient.of(ItemTags.STONE_TOOL_MATERIALS), 131);
    public static bindResource ironBindResource = new bindResource("iron", "iron", Ingredient.of(Items.IRON_INGOT), 250);
    public static bindResource goldBindResource = new bindResource("golden", "gold", Ingredient.of(Items.GOLD_INGOT), 32);
    public static bindResource diamondBindResource = new bindResource("diamond", "diamond", Ingredient.of(Items.DIAMOND), 1561);
    public static bindResource netheriteBindResource = new bindResource("netherite", "netherite", Ingredient.of(Items.NETHERITE_INGOT), 2031);

    // Tool Rod Resources
    public static rodResource bambooRodResource = new rodResource("bamboo", "bamboo", Ingredient.of(Items.BAMBOO), 0.0F);
    public static rodResource boneRodResource = new rodResource("bone", "bone", Ingredient.of(Items.BONE), 0.0F);
    public static rodResource blazeRodResource = new rodResource("blaze_rod", "blaze_rod", Ingredient.of(Items.BLAZE_ROD), 0.0F);
    public static rodResource endRodResource = new rodResource("end_rod", "end_rod", Ingredient.of(Items.END_ROD), 0.0F);
    public static rodResource woodenRodResource = new rodResource("wooden", "wood", Ingredient.of(Items.STICK), 0.0F);
}