package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.testmod.init.Testmod2024ModBlocks;

public class AutobridgeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(BlockPos.containing(x + (entity.getDirection()).getStepX(), y + (entity.getDirection()).getStepY(), z + (entity.getDirection()).getStepZ()), Testmod2024ModBlocks.MYFACEBLOCK.get().defaultBlockState(), 3);
	}
}
