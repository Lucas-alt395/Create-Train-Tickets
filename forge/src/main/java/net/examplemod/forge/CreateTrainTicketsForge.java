package net.createtraintickets.forge;

import net.createtraintickets.ExampleBlocks;
import net.createtraintickets.CreateTrainTickets;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateTrainTickets.MOD_ID)
public class CreateTrainTicketsForge {
    public CreateTrainTicketsForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateTrainTickets.init();
    }
}
