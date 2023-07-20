package net.lesuisse.tutorialmod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.lesuisse.tutorialmod.menu.ShopGUI;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class commands {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext, Commands.CommandSelection selection){
        dispatcher.register(Commands.literal("shop").executes();
    }
}
