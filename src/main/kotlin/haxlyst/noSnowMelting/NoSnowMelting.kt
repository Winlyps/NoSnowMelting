package haxlyst.noSnowMelting

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockFadeEvent
import org.bukkit.plugin.java.JavaPlugin

class NoSnowMelting : JavaPlugin(), Listener {

    override fun onEnable() {
        server.pluginManager.registerEvents(this, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    fun onBlockFade(event: BlockFadeEvent) {
        if (event.block.type == Material.SNOW) {
            event.isCancelled = true
        }
    }
}