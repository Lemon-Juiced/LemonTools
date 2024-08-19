package dev.lemonjuice.json_generator.util;

public class UtilGenerator {

    /**
     * Generates a string for a material line in a recipe.
     *
     * @param material The material of the part.
     */
    public static String generateMaterialLine(String material) {
        String materialLine = "";
        if (material.equals("wooden")) {
            materialLine = "      \"tag\": \"minecraft:planks\"";
        } else if (material.equals("stone")) {
            materialLine = "      \"tag\": \"minecraft:stone_tool_materials\"";
        } else if (material.equals("iron")) {
            materialLine = "      \"item\": \"minecraft:iron_ingot\"";
        } else if (material.equals("golden")) {
            materialLine = "      \"item\": \"minecraft:gold_ingot\"";
        } else if (material.equals("diamond")) {
            materialLine = "      \"item\": \"minecraft:diamond\"";
        } else if (material.equals("netherite")) {
            materialLine = "      \"item\": \"minecraft:netherite_ingot\"";
        }

        materialLine += "\n";

        return materialLine;
    }

    /**
     * Generates a string for a material line in a recipe.
     *
     * @param material The material of the part.
     */
    public static String generateToolRodShortMaterialLine(String material) {
        String materialLine = "";
        if (material.equals("bamboo")) {
            materialLine = "      \"item\": \"minecraft:bamboo\"";
        } else if (material.equals("blaze")) {
            materialLine = "      \"item\": \"minecraft:blaze_rod\"";
        } else if (material.equals("bone")) {
            materialLine = "      \"item\": \"minecraft:bone\"";
        } else if (material.equals("end")) {
            materialLine = "      \"item\": \"minecraft:end_rod\"";
        } else if (material.equals("wooden")) {
            materialLine = "      \"item\": \"minecraft:stick\"";
        }

        materialLine += "\n";

        return materialLine;
    }
}
