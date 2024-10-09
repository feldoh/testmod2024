package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.testmod.init.Testmod2024ModBlocks;

public class MyfaceblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xCur = 0;
		double yCur = 0;
		double zCur = 0;
		xCur = x;
		yCur = y;
		zCur = z;
		while ((world.getBlockState(BlockPos.containing(xCur + (entity.getDirection()).getStepX(), yCur + (entity.getDirection()).getStepY(), zCur + (entity.getDirection()).getStepZ()))).getBlock() == Testmod2024ModBlocks.MYFACEBLOCK.get()) {
			xCur = xCur + (entity.getDirection()).getStepX();
			yCur = yCur + (entity.getDirection()).getStepY();
			zCur = zCur + (entity.getDirection()).getStepZ();
		}
		world.setBlock(BlockPos.containing(xCur + (entity.getDirection()).getStepX(), yCur + (entity.getDirection()).getStepY(), zCur + (entity.getDirection()).getStepZ()), Testmod2024ModBlocks.MYFACEBLOCK.get().defaultBlockState(), 3);
	}
}
