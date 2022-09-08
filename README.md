# UltimateChairs

Spigot plugin. Allow players to sit on stairs, slabs, carpets & heads.

This is the official repository for UltimateChairs provided on SpigotMC (https://www.spigotmc.org/resources/80434/).

## API
Please make sure to add softdepend: [UltimateChairs] to your plugin.yml.

```diff
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.DemoPulse</groupId>
        <artifactId>UltimateChairs</artifactId>
        <version>VERSION HERE</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```
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
