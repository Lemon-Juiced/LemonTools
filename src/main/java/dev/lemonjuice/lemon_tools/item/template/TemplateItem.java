package dev.lemonjuice.lemon_tools.item.template;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class TemplateItem extends Item {
    public TemplateItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(this);
    }
}
