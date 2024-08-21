package dev.lemonjuice.lemon_tools.creativetab;

import dev.lemonjuice.lemon_tools.item.LemonToolsItems;
import dev.lemonjuice.lemon_tools.item.tool.LTSwordItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.lemonjuice.lemon_tools.LemonTools.MOD_ID;
import static dev.lemonjuice.lemon_tools.item.LemonToolsItems.ITEMS;

public class LemonToolsCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_TOOLS_TEMPLATES_TAB = CREATIVE_MODE_TABS.register("lemon_tools_templates_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_tools_templates"))
            .icon(() -> LemonToolsItems.BLUEPRINT.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Templates
                output.accept(LemonToolsItems.BLUEPRINT.get());
                output.accept(LemonToolsItems.BLADE_TEMPLATE.get());
                output.accept(LemonToolsItems.HILT_TEMPLATE.get());
                output.accept(LemonToolsItems.TOOL_ROD_LONG_TEMPLATE.get());
                output.accept(LemonToolsItems.TOOL_ROD_SHORT_TEMPLATE.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_TOOLS_PARTS_TAB = CREATIVE_MODE_TABS.register("lemon_tools_parts_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_tools_parts"))
            .icon(() -> LemonToolsItems.NETHERITE_BLADE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Blades
                output.accept(LemonToolsItems.WOODEN_BLADE.get());
                output.accept(LemonToolsItems.STONE_BLADE.get());
                output.accept(LemonToolsItems.IRON_BLADE.get());
                output.accept(LemonToolsItems.GOLDEN_BLADE.get());
                output.accept(LemonToolsItems.DIAMOND_BLADE.get());
                output.accept(LemonToolsItems.NETHERITE_BLADE.get());

                // Hilts
                output.accept(LemonToolsItems.WOODEN_HILT.get());
                output.accept(LemonToolsItems.STONE_HILT.get());
                output.accept(LemonToolsItems.IRON_HILT.get());
                output.accept(LemonToolsItems.GOLDEN_HILT.get());
                output.accept(LemonToolsItems.DIAMOND_HILT.get());
                output.accept(LemonToolsItems.NETHERITE_HILT.get());

                // Tool Rods (Short)
                output.accept(LemonToolsItems.BAMBOO_TOOL_ROD_SHORT.get());
                output.accept(LemonToolsItems.BLAZE_TOOL_ROD_SHORT.get());
                output.accept(LemonToolsItems.BONE_TOOL_ROD_SHORT.get());
                output.accept(LemonToolsItems.END_TOOL_ROD_SHORT.get());
                output.accept(LemonToolsItems.WOODEN_TOOL_ROD_SHORT.get());
            }).build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LEMON_TOOLS_SWORDS_TAB = CREATIVE_MODE_TABS.register("lemon_tools_swords_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.lemon_tools_swords"))
            .icon(() -> Items.NETHERITE_SWORD.getDefaultInstance())
            .displayItems((parameters, output) -> {
                // Sword Items
                ITEMS.getEntries().stream()
                        .map(item -> item.get())
                        .filter(item -> item instanceof LTSwordItem)
                        .forEach(item -> output.accept(item));
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
