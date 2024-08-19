package dev.lemonjuice.json_generator.recipes.parts;

import dev.lemonjuice.json_generator.util.UtilGenerator;

import java.io.File;
import java.io.FileWriter;

public class ToolPartGenerator {

    /**
     * Generates a file for a tool rod (short) recipe with the given material.
     *
     * @param material The material of the blade.
     */
    public static void generateToolRodShortRecipe(String material) {
        try {
            File file = new File("src/main/resources/data/lemon_tools/recipe/tool_rods/" + material + "_tool_rod_short.json");
            FileWriter writer = new FileWriter(file);

            // Determine the actual material lines
            String materialLine = UtilGenerator.generateToolRodShortMaterialLine(material);

            writer.write("{\n");
            writer.write("  \"type\": \"minecraft:crafting_shapeless\",\n");
            writer.write("  \"ingredients\": [\n");
            writer.write("    {\n");
            writer.write("      \"item\": \"lemon_tools:tool_rod_short_template\"\n");
            writer.write("    },\n");
            writer.write("    {\n");
            writer.write(materialLine);
            writer.write("    }\n");
            writer.write("  ],\n");
            writer.write("  \"result\": {\n");
            writer.write("    \"id\": \"lemon_tools:" + material + "_tool_rod_short\"\n");
            writer.write("  }\n");
            writer.write("}\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
