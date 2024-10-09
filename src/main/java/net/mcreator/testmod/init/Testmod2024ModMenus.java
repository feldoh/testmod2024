
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.testmod.world.inventory.FaceFurnaceGUIMenu;
import net.mcreator.testmod.Testmod2024Mod;

public class Testmod2024ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, Testmod2024Mod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<FaceFurnaceGUIMenu>> FACE_FURNACE_GUI = REGISTRY.register("face_furnace_gui", () -> IMenuTypeExtension.create(FaceFurnaceGUIMenu::new));
}
