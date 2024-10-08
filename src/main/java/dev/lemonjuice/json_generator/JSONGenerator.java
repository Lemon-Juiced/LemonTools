package dev.lemonjuice.json_generator;

import java.util.ArrayList;

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
        ArrayList<String> bladeMaterials = getBladeMaterialNames();
        ArrayList<String> hiltMaterials = getHiltMaterialNames();
        ArrayList<String> toolRodMaterials = getToolRodMaterialNames();

        for (int i = 0; i < bladeMaterials.size(); i++) {
            for (int j = 0; j < hiltMaterials.size(); j++) {
                for (int k = 0; k < toolRodMaterials.size(); k++) {
                    generateSwordModel(bladeMaterials.get(i), hiltMaterials.get(j), toolRodMaterials.get(k));
                    generateSwordRecipe(bladeMaterials.get(i), hiltMaterials.get(j), toolRodMaterials.get(k));
                }
            }
        }

        // Generate Blades
        for (int i = 0; i < bladeMaterials.size(); i++) {
            generateBladeRecipe(bladeMaterials.get(i));
        }

        // Generate Hilts
        for (int i = 0; i < hiltMaterials.size(); i++) {
            generateHiltRecipe(hiltMaterials.get(i));
        }

        // Generate Tool Rod (Short)
        for (int i = 0; i < toolRodMaterials.size(); i++) {
            generateToolRodShortRecipe(toolRodMaterials.get(i));
        }
    }
}