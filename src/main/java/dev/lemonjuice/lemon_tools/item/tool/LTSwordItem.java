package dev.lemonjuice.lemon_tools.item.tool;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class LTSwordItem extends SwordItem {
    String bladeMaterial;
    String hiltMaterial;
    String toolRodMaterial;

    public LTSwordItem(Tier tier, Properties properties, String bladeMaterial, String hiltMaterial, String toolRodMaterial) {
        super(tier, properties);
        this.bladeMaterial = bladeMaterial;
        this.hiltMaterial = hiltMaterial;
        this.toolRodMaterial = toolRodMaterial;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable("tooltip.lemon_tools.blade_type").append(Component.translatable("tooltip.lemon_tools." + bladeMaterial)));
        tooltipComponents.add(Component.translatable("tooltip.lemon_tools.hilt_type").append(Component.translatable("tooltip.lemon_tools." + hiltMaterial)));
        tooltipComponents.add(Component.translatable("tooltip.lemon_tools.tool_rod_type").append(Component.translatable("tooltip.lemon_tools." + toolRodMaterial)));
    }

    public String getBladeMaterial() {
        return bladeMaterial;
    }

    public String getHiltMaterial() {
        return hiltMaterial;
    }

    public String getToolRodMaterial() {
        return toolRodMaterial;
    }

}
