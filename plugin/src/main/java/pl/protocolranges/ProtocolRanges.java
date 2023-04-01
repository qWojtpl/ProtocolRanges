package pl.protocolranges;

import org.bukkit.plugin.java.JavaPlugin;
import pl.protocolranges.data.DataHandler;
import pl.protocolranges.events.Events;

public final class ProtocolRanges extends JavaPlugin {

    private static ProtocolRanges main;
    private DataHandler dataHandler;

    @Override
    public void onEnable() {
        main = this;
        if(getServer().getPluginManager().getPlugin("ViaVersion") == null) {
            getLogger().severe("ViaVersion not found!");
            forceDisable();
            return;
        }
        this.dataHandler = new DataHandler();
        if(!dataHandler.loadConfig()) return;
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye!");
    }

    public void forceDisable() {
        getServer().getPluginManager().disablePlugin(this);
    }

    public static ProtocolRanges getInstance() {
        return main;
    }

    public DataHandler getDataHandler() {
        return this.dataHandler;
    }
}
