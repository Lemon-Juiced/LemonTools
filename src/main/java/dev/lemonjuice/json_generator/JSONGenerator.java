package dev.lemonjuice.json_generator;

import static dev.lemonjuice.json_generator.models.ModelGenerator.generateSwordModel;
import static dev.lemonjuice.json_generator.recipes.parts.ToolPartGenerator.generateToolRodShortRecipe;
import static dev.lemonjuice.json_generator.recipes.sword.SwordGenerator.*;
import static dev.lemonjuice.lemon_tools.util.ListUtil.*;

/**
 * This is not part of the main LemonTools mod, but this is a separate project that will be used to generate recipes for the mod.
 */
public class JSONGenerator {

    public static void main(String[] args) {
        // Generate Swords
        for (int i = 0; i < bladeMaterials.size(); i++) {
            for (int j = 0; j < hiltMaterials.size(); j++) {
                for (int k = 0; k < toolRodMaterials.size(); k++) {
                    generateSwordModel(bladeMaterials.get(i).name(), hiltMaterials.get(j).name(), toolRodMaterials.get(k).name());
                    generateSwordRecipe(bladeMaterials.get(i).name(), hiltMaterials.get(j).name(), toolRodMaterials.get(k).name());
                }
            }
        }

        // Generate Blades
        for (int i = 0; i < bladeMaterials.size(); i++) {
            generateBladeRecipe(bladeMaterials.get(i).name());
        }

        // Generate Hilts
        for (int i = 0; i < hiltMaterials.size(); i++) {
            generateHiltRecipe(hiltMaterials.get(i).name());
        }

        // Generate Tool Rod (Short)
        for (int i = 0; i < toolRodMaterials.size(); i++) {
            generateToolRodShortRecipe(toolRodMaterials.get(i).name());
        }
    }
}
