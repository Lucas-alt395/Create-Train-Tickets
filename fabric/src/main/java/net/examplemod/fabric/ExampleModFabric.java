package net.createtraintickets.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.createtraintickets.ExampleBlocks;
import net.createtraintickets.createtraintickets;
import net.fabricmc.api.ModInitializer;

public class CreateTrainTicketsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateTrainTickets.init();
        CreateTrainTickets.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateTrainTickets.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
