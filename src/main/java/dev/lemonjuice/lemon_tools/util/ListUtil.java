package dev.lemonjuice.lemon_tools.util;

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
}
