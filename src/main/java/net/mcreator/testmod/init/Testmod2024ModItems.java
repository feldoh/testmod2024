
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.testmod.item.SheepWandItem;
import net.mcreator.testmod.item.PlatformWandItem;
import net.mcreator.testmod.item.FacearmoursetItem;
import net.mcreator.testmod.Testmod2024Mod;

public class Testmod2024ModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(Testmod2024Mod.MODID);
	public static final DeferredHolder<Item, Item> MYFACEBLOCK = block(Testmod2024ModBlocks.MYFACEBLOCK);
	public static final DeferredHolder<Item, Item> SHEEP_WAND = REGISTRY.register("sheep_wand", SheepWandItem::new);
	public static final DeferredHolder<Item, Item> FACEARMOURSET_HELMET = REGISTRY.register("facearmourset_helmet", FacearmoursetItem.Helmet::new);
	public static final DeferredHolder<Item, Item> FACEARMOURSET_CHESTPLATE = REGISTRY.register("facearmourset_chestplate", FacearmoursetItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> FACEARMOURSET_LEGGINGS = REGISTRY.register("facearmourset_leggings", FacearmoursetItem.Leggings::new);
	public static final DeferredHolder<Item, Item> FACEARMOURSET_BOOTS = REGISTRY.register("facearmourset_boots", FacearmoursetItem.Boots::new);
	public static final DeferredHolder<Item, Item> PLATFORM_WAND = REGISTRY.register("platform_wand", PlatformWandItem::new);
	public static final DeferredHolder<Item, Item> FACE_FURNACE = block(Testmod2024ModBlocks.FACE_FURNACE);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
