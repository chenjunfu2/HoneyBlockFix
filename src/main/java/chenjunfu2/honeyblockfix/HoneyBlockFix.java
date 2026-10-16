package chenjunfu2.honeyblockfix;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

public class HoneyBlockFix implements ModInitializer {
	public static final String MOD_ID = "honeyblockfix";
	//public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize()
	{}
}
