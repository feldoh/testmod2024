
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.mcreator.testmod.block.MyfaceblockBlock;
import net.mcreator.testmod.Testmod2024Mod;

public class Testmod2024ModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(Testmod2024Mod.MODID);
	public static final DeferredHolder<Block, Block> MYFACEBLOCK = REGISTRY.register("myfaceblock", MyfaceblockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
