# UltimateChairs

Spigot plugin. Allow players to sit on stairs, slabs, carpets & heads.

This is the official repository for UltimateChairs provided on SpigotMC (https://www.spigotmc.org/resources/80434/).

## API
Please make sure to add softdepend: [UltimateChairs] to your plugin.yml.

### Events

```diff
PrePlayerChairMountEvent
# Called before player is mounted on the chair

PrePlayerChairDismountEvent
# Called before player is dismounted from the chair

PlayerChairMountEvent
# Called after player is mounted on the chair

PlayerChairDismountEvent
# Called after player is dismounted from the chair
```

Example:
```
public class EventsListener implements Listener {

    @EventHandler
    void onPrePlayerChairMountEvent(PrePlayerChairMountEvent event)
    {
      // Your code here
    }

}
```
