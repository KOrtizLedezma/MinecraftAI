package com.example.examplemod;
import net.minecraft.world.entity.npc.Villager;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "tuidmodid", bus = Mod.EventBusSubscriber.Bus.FORGE)

public class VillagerSpawnHandler{

    @SubscribeEvent
    public void onEntityJoin(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof Villager villager) {
            villager.goalSelector.getAvailableGoals().clear();
            villager.targetSelector.getAvailableGoals().clear();
        }
    }

}
