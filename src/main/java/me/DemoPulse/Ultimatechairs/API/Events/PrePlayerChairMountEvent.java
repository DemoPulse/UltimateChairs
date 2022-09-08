package me.DemoPulse.Ultimatechairs.API.Events;

import me.DemoPulse.UltimateChairs.API.Reason;
import me.DemoPulse.UltimateChairs.Chair;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PrePlayerChairMountEvent extends ChairEvent implements Cancellable {

    private final Reason reason;
    private boolean cancelled;
    private final static HandlerList handlers = new HandlerList();

    public PrePlayerChairMountEvent(Chair chair)
    {
        super(chair);
        this.reason = Reason.PLAYER;
    }

    public PrePlayerChairMountEvent(Chair chair, Reason reason)
    {
        super(chair);
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}