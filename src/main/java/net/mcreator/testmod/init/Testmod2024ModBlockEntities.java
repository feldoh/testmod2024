
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.testmod.block.entity.FaceFurnaceBlockEntity;
import net.mcreator.testmod.Testmod2024Mod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class Testmod2024ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Testmod2024Mod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FACE_FURNACE = register("face_furnace", Testmod2024ModBlocks.FACE_FURNACE, FaceFurnaceBlockEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FACE_FURNACE.get(), (blockEntity, side) -> ((FaceFurnaceBlockEntity) blockEntity).getItemHandler());
	}
}
