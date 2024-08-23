package dev.lemonjuice.lemon_tools.util;

import java.util.List;
import java.util.stream.Collectors;

import static dev.lemonjuice.lemon_tools.util.ListUtil.*;
import static dev.lemonjuice.lemon_tools.util.ResourceUtil.*;

public class ListUtilConverter {

    public static List<headResource> getBladeMaterials() {
        return bladeMaterials.stream().map(name -> {
            switch (name) {
                case "wooden": return woodHeadResource;
                case "stone": return stoneHeadResource;
                case "iron": return ironHeadResource;
                case "golden": return goldHeadResource;
                case "diamond": return diamondHeadResource;
                case "netherite": return netheriteHeadResource;
                default: throw new IllegalArgumentException("Unknown material: " + name);
            }
        }).collect(Collectors.toList());
    }

    public static List<bindResource> getHiltMaterials() {
        return hiltMaterials.stream().map(name -> {
            switch (name) {
                case "wooden": return woodBindResource;
                case "stone": return stoneBindResource;
                case "iron": return ironBindResource;
                case "golden": return goldBindResource;
                case "diamond": return diamondBindResource;
                case "netherite": return netheriteBindResource;
                default: throw new IllegalArgumentException("Unknown material: " + name);
            }
        }).collect(Collectors.toList());
    }

    public static List<rodResource> getToolRodMaterials() {
        return toolRodMaterials.stream().map(name -> {
            switch (name) {
                case "bamboo": return bambooRodResource;
                case "bone": return boneRodResource;
                case "blaze": return blazeRodResource;
                case "end": return endRodResource;
                case "wooden": return woodenRodResource;
                default: throw new IllegalArgumentException("Unknown material: " + name);
            }
        }).collect(Collectors.toList());
    }
}