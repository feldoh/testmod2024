package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.testmod.init.Testmod2024ModBlocks;

public class MyfaceblockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		world.setBlock(BlockPos.containing(x + direction.getStepX(), y + direction.getStepY(), z + direction.getStepZ()), Testmod2024ModBlocks.MYFACEBLOCK.get().defaultBlockState(), 3);
	}
}
