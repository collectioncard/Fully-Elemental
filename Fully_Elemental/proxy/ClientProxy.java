package com.Thomas.Fully_Elemental.proxy;

import com.Thomas.Fully_Elemental.init.Blocks;
import com.Thomas.Fully_Elemental.init.HeldItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders() {
		HeldItems.registerRenders();
		Blocks.registerRenders();
	}
}
