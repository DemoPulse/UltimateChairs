package me.DemoPulse.Ultimatechairs.API;

import me.DemoPulse.UltimateChairs.Chair;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.Collection;

@SuppressWarnings("unused")
public class UltimateChairsAPI {

    private UltimateChairsAPI() {}

    /**
     * Creates a new Chair on a Block for a Player.
     * @author DemoPulse
     * @since 1.4.8
     * @param block Block on which chair should be created.
     * @param player Player to sit on this Chair.
     * @return Chair object or <code>null</code> if the creation was unsuccessful.
     */
    public static Chair createChair(Player player, Block block) {
        return new Chair(player, block);
    }

    /**
     * Removes chair and dismounts sitting player.
     * @author DemoPulse
     * @since 1.4.8
     * @param chair Chair object to remove.
     */
    public static void removeChair(Chair chair) {
        chair.dismount();
    }

    /**
     * Find chair player is sitting on.
     * @author DemoPulse
     * @since 1.5.5
     * @param player Player.
     * @return Chair object or <code>null</code> if player chair does not exist.
     */
    public static Chair getChair(Player player) {
       return Chair.getPlayerChair(player);
    }

    /**
     * List all chairs.
     * @author DemoPulse
     * @since 1.5.5
     * @return List of all Chair objects.
     */
    public static Collection<Chair> getChairs() {
        return Chair.getChairs().values();
    }

}