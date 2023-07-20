package net.lesuisse.tutorialmod.menu;

import net.lesuisse.tutorialmod.TutorialMod;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;


public class ShopGUI {
    public class ShopContainer extends AbstractContainerMenu {
        public ShopContainer() {
            super(null, 0);
        }

        @Override
        public ItemStack quickMoveStack(Player pPlayer, int pIndex) {
            return null;
        }

        @Override
        public boolean stillValid(Player pPlayer) {
            return false;
        }


    }

    public class ShopScreen extends AbstractContainerScreen<ShopContainer> {
        private final ResourceLocation GUI = new ResourceLocation(TutorialMod.MOD_ID, "textures/gui/screen.png");

        public ShopScreen(ShopContainer container, Inventory inventory, Component title) {
            super(container, inventory, title);
            this.inventoryLabelY = this.imageHeight - 110;
        }

        @Override
        protected void renderBg(GuiGraphics graphics, float partialTicks, int MouseX, int MouseY) {
            int relX = (this.width - this.imageWidth) / 2;
            int relY = (this.height - this.imageHeight) / 2;
            graphics.blit(GUI, relX, relY, 0,0, this.imageWidth, this.imageHeight);
        }


    }

    public static void register(IEventBus eventBus) {
        ShopGUI.register(eventBus);
    }
}
