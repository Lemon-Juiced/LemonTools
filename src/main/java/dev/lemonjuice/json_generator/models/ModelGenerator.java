package dev.lemonjuice.json_generator.models;

import java.io.File;
import java.io.FileWriter;

public class ModelGenerator {

    /**
     * Generates a file for a sword model with the given materials.
     *
     * @param bladeMaterial   The material of the blade.
     * @param hiltMaterial    The material of the hilt.
     * @param toolRodMaterial The material of the handle.
     */
    public static void generateSwordModel(String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        try {
            File file = new File("src/main/resources/assets/lemon_tools/models/item/" + bladeMaterial + "_" + hiltMaterial + "_" + toolRodMaterial + "_sword.json");
            FileWriter writer = new FileWriter(file);

            writer.write("{\n");
            writer.write("  \"parent\": \"item/handheld\",\n");
            writer.write("  \"textures\": {\n");
            writer.write("    \"layer0\": \"lemon_tools:item/" + bladeMaterial + "_blade\",\n");
            writer.write("    \"layer1\": \"lemon_tools:item/" + hiltMaterial + "_hilt\",\n");
            writer.write("    \"layer2\": \"lemon_tools:item/" + toolRodMaterial + "_tool_rod_short\"\n");
            writer.write("  }\n");
            writer.write("}\n");

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
