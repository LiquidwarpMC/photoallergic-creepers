package net.liquidwarpmc.photoallergiccreepers;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PhotoallergicCreepers implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("PhotoallergicCreepers");

	@Override
	public void onInitialize() {
		LOGGER.info("[Photoallergic Creepers] initialized!");
	}
}
