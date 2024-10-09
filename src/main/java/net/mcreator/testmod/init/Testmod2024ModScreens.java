
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmod.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.testmod.client.gui.FaceFurnaceGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Testmod2024ModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(Testmod2024ModMenus.FACE_FURNACE_GUI.get(), FaceFurnaceGUIScreen::new);
	}
}
