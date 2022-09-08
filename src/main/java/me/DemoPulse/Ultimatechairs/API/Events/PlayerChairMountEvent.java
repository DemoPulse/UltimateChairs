package me.DemoPulse.Ultimatechairs.API.Events;

import me.DemoPulse.UltimateChairs.Chair;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerChairMountEvent extends ChairEvent {

    private final static HandlerList handlers = new HandlerList();

    public PlayerChairMountEvent(Chair chair) {
       super(chair);
    }

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}