package dev.lemonjuice.lemon_tools.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static dev.lemonjuice.lemon_tools.util.ResourceUtil.*;

/**
 * A utility class that only contains lists of materials.
 * These can be used both in the mod and in the recipe generator.
 */
public class ListUtil {
    public static List<ResourceUtil.headResource> bladeMaterials = Arrays.asList(woodHeadResource, stoneHeadResource, ironHeadResource, goldHeadResource, diamondHeadResource, netheriteHeadResource);
    public static List<ResourceUtil.bindResource> hiltMaterials = Arrays.asList(woodBindResource, stoneBindResource, ironBindResource, goldBindResource, diamondBindResource, netheriteBindResource);
    public static List<ResourceUtil.rodResource> toolRodMaterials = Arrays.asList(bambooRodResource, boneRodResource, blazeRodResource, endRodResource, woodenRodResource);

    public static ArrayList<String> getBladeMaterials(){
        ArrayList<String> jsonBladeMaterials = new ArrayList<>();
        for (int i = 0; i < bladeMaterials.size(); i++) {
            jsonBladeMaterials.add(bladeMaterials.get(i).name());
        }
        return jsonBladeMaterials;
    }

    public static ArrayList<String> getHiltMaterials(){
        ArrayList<String> jsonHiltMaterials = new ArrayList<>();
        for (int i = 0; i < hiltMaterials.size(); i++) {
            jsonHiltMaterials.add(bladeMaterials.get(i).name());
        }
        return jsonHiltMaterials;
    }

    public static ArrayList<String> getToolRodMaterials(){
        ArrayList<String> jsonToolRodMaterials = new ArrayList<>();
        for (int i = 0; i < toolRodMaterials.size(); i++) {
            jsonToolRodMaterials.add(bladeMaterials.get(i).name());
        }
        return jsonToolRodMaterials;
    }
}
