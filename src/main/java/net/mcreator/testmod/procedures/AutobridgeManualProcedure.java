package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.testmod.init.Testmod2024ModBlocks;

public class AutobridgeManualProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, BlockPos pos) {
		if (entity == null || entity.moveDist <= 0)
			return;
		world.setBlock(pos.relative(entity.getMotionDirection(), 1), Testmod2024ModBlocks.MYFACEBLOCK.get().defaultBlockState(), 3);
	}
}
