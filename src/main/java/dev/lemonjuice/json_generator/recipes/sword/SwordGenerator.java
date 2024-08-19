package dev.lemonjuice.json_generator.recipes.sword;

import java.io.File;
import java.io.FileWriter;

import static dev.lemonjuice.json_generator.util.UtilGenerator.generateMaterialLine;

public class SwordGenerator {

    /**
     * Generates a file for a blade recipe with the given material.
     *
     * @param material The material of the blade.
     */
    public static void generateBladeRecipe(String material) {
        try {
            File file = new File("src/main/resources/data/lemon_tools/recipe/blades/" + material + "_blade.json");
            FileWriter writer = new FileWriter(file);

            // Determine the actual material lines
            String materialLine = generateMaterialLine(material);

            writer.write("{\n");
            writer.write("  \"type\": \"minecraft:crafting_shapeless\",\n");
            writer.write("  \"ingredients\": [\n");
            writer.write("    {\n");
            writer.write("      \"item\": \"lemon_tools:blade_template\"\n");
            writer.write("    },\n");
            writer.write("    {\n");
            writer.write(materialLine);
            writer.write("    },\n");
            writer.write("    {\n");
            writer.write(materialLine);
            writer.write("    }\n");
            writer.write("  ],\n");
            writer.write("  \"result\": {\n");
            writer.write("    \"id\": \"lemon_tools:" + material + "_blade\"\n");
            writer.write("  }\n");
            writer.write("}\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates a file for a hilt recipe with the given material.
     *
     * @param material The material of the blade.
     */
    public static void generateHiltRecipe(String material) {
        try {
            File file = new File("src/main/resources/data/lemon_tools/recipe/hilts/" + material + "_hilt.json");
            FileWriter writer = new FileWriter(file);

            // Determine the actual material lines
            String materialLine = generateMaterialLine(material);

            writer.write("{\n");
            writer.write("  \"type\": \"minecraft:crafting_shapeless\",\n");
            writer.write("  \"ingredients\": [\n");
            writer.write("    {\n");
            writer.write("      \"item\": \"lemon_tools:hilt_template\"\n");
            writer.write("    },\n");
            writer.write("    {\n");
            writer.write(materialLine);
            writer.write("    }\n");
            writer.write("  ],\n");
            writer.write("  \"result\": {\n");
            writer.write("    \"id\": \"lemon_tools:" + material + "_hilt\"\n");
            writer.write("  }\n");
            writer.write("}\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generates a file for a sword recipe with the given materials.
     *
     * @param bladeMaterial   The material of the blade.
     * @param hiltMaterial    The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     */
    public static void generateSwordRecipe(String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        try {
            File file = new File("src/main/resources/data/lemon_tools/recipe/swords/" + bladeMaterial + "_" + hiltMaterial + "_" + toolRodMaterial + "_sword.json");
            FileWriter writer = new FileWriter(file);

            writer.write("{\n");
            writer.write("  \"type\": \"minecraft:crafting_shaped\",\n");
            writer.write("  \"pattern\": [\n");
            writer.write("    \" B \",\n");
            writer.write("    \" H \",\n");
            writer.write("    \" S \"\n");
            writer.write("  ],\n");
            writer.write("  \"key\": {\n");
            writer.write("    \"B\": {\n");
            writer.write("      \"item\": \"lemon_tools:" + bladeMaterial + "_blade\"\n");
            writer.write("    },\n");
            writer.write("    \"H\": {\n");
            writer.write("      \"item\": \"lemon_tools:" + hiltMaterial + "_hilt\"\n");
            writer.write("    },\n");
            writer.write("    \"S\": {\n");
            writer.write("      \"item\": \"lemon_tools:" + toolRodMaterial + "_tool_rod\"\n");
            writer.write("    }\n");
            writer.write("  },\n");
            writer.write("  \"result\": {\n");
            writer.write("    \"id\": \"lemon_tools:" + bladeMaterial + "_" + hiltMaterial + "_" + toolRodMaterial + "_sword\"\n");
            writer.write("  }\n");
            writer.write("}\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
