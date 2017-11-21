package me.FatCrab;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import me.FatCrab.commands.RBBReload;
import me.FatCrab.listeners.RBBListener;
public class RBB extends JavaPlugin implements Listener {
	// jaw enable listeners and commands
	@Override
    public void onEnable() {
        getCommand("RBB").setExecutor(new RBBReload(this));
        getServer().getPluginManager()
        .registerEvents(new RBBListener(this), this);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }
}
	
    

	  


