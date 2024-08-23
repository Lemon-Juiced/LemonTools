package dev.lemonjuice.lemon_tools.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A utility class that only contains lists of materials.
 * These can be used both in the mod (with the use of the ListUtilConverter) and in the JSON generator.
 */
public class ListUtil {
    public static List<String> bladeMaterials = Arrays.asList("wooden", "stone", "iron", "golden", "diamond", "netherite");
    public static List<String> hiltMaterials = Arrays.asList("wooden", "stone", "iron", "golden", "diamond", "netherite");
    public static List<String> toolRodMaterials = Arrays.asList("bamboo", "bone", "blaze", "end", "wooden");

    public static ArrayList<String> getBladeMaterialNames() {
        return new ArrayList<>(bladeMaterials);
    }

    public static ArrayList<String> getHiltMaterialNames() {
        return new ArrayList<>(hiltMaterials);
    }

    public static ArrayList<String> getToolRodMaterialNames() {
        return new ArrayList<>(toolRodMaterials);
    }
}