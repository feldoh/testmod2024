package net.mcreator.testmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.testmod.init.Testmod2024ModBlocks;

public class PlatformWandRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xOffset = 0;
		double zOffset = 0;
		xOffset = -1;
		zOffset = -1;
		for (int index0 = 0; index0 < 3; index0++) {
			for (int index1 = 0; index1 < 3; index1++) {
				world.setBlock(BlockPos.containing(x + xOffset, y - 1, z + zOffset), Testmod2024ModBlocks.MYFACEBLOCK.get().defaultBlockState(), 3);
				zOffset = zOffset + 1;
			}
			zOffset = -1;
			xOffset = xOffset + 1;
		}
	}
}
