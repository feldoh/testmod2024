
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.testmod.Testmod2024Mod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class Testmod2024ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Testmod2024Mod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOD_TAB = REGISTRY.register("mod_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.testmod2024.mod_tab")).icon(() -> new ItemStack(Testmod2024ModBlocks.MYFACEBLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(Testmod2024ModBlocks.MYFACEBLOCK.get().asItem());
				tabData.accept(Testmod2024ModItems.SHEEP_WAND.get());
				tabData.accept(Testmod2024ModItems.FACEARMOURSET_HELMET.get());
				tabData.accept(Testmod2024ModItems.FACEARMOURSET_CHESTPLATE.get());
				tabData.accept(Testmod2024ModItems.FACEARMOURSET_LEGGINGS.get());
				tabData.accept(Testmod2024ModItems.FACEARMOURSET_BOOTS.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(Testmod2024ModBlocks.MYFACEBLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(Testmod2024ModItems.FACEARMOURSET_HELMET.get());
			tabData.accept(Testmod2024ModItems.FACEARMOURSET_CHESTPLATE.get());
			tabData.accept(Testmod2024ModItems.FACEARMOURSET_LEGGINGS.get());
			tabData.accept(Testmod2024ModItems.FACEARMOURSET_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(Testmod2024ModItems.SHEEP_WAND.get());
		}
	}
}
