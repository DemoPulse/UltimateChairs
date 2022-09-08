package me.DemoPulse.Ultimatechairs.API.Events;

import me.DemoPulse.UltimateChairs.Chair;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public abstract class ChairEvent extends Event {

    private final Chair chair;

    public ChairEvent(Chair chair) {
        this.chair = chair;
    }

    public Player getPlayer() {
        return chair.getPlayer();
    }

    public Chair getChair() {
        return chair;
    }

}