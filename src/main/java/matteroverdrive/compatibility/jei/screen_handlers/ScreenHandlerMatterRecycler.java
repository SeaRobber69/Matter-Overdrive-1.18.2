package matteroverdrive.compatibility.jei.screen_handlers;

import java.util.ArrayList;
import java.util.List;

import matteroverdrive.client.screen.ScreenMatterRecycler;
import mezz.jei.api.gui.handlers.IGuiContainerHandler;
import net.minecraft.client.renderer.Rect2i;

public class ScreenHandlerMatterRecycler implements IGuiContainerHandler<ScreenMatterRecycler> {

	@Override
	public List<Rect2i> getGuiExtraAreas(ScreenMatterRecycler containerScreen) {
		List<Rect2i> rectangles = new ArrayList<>();
		rectangles.add(new Rect2i(containerScreen.getGuiLeft(), containerScreen.getGuiTop(), 186, 176));
		if (containerScreen.menu.isExtended) {
			rectangles.add(new Rect2i(containerScreen.getGuiLeft(), containerScreen.getGuiTop() + 33, 224, 143));
		}
		return rectangles;
	}
	
}
