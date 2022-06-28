package matteroverdrive.core.render;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public abstract class AbstractTooltipEventHandler {

	public AbstractTooltipEventHandler() {
		
	}
	
	public abstract void handleTooltips(List<Component> tooltips, ItemStack stack, Player player);
	
}
