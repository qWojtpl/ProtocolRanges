package pl.protocolranges.data;

import org.bukkit.configuration.file.YamlConfiguration;
import pl.protocolranges.ProtocolRanges;

import java.io.File;

public class DataHandler {

    private int minProtocol;
    private int maxProtocol;
    private String tooLowMessage;
    private String tooHighMessage;

    public boolean loadConfig() {
        ProtocolRanges plugin = ProtocolRanges.getInstance();
        File configFile = new File(plugin.getDataFolder(), "config.yml");
        if(!configFile.exists()) {
            plugin.saveResource("config.yml", false);
        }
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(configFile);
        minProtocol = yml.getInt("config.minProtocol");
        maxProtocol = yml.getInt("config.maxProtocol");
        if(minProtocol > maxProtocol) {
            plugin.getLogger().severe("Min protocol is higher than max protocol!");
            plugin.forceDisable();
            return false;
        }
        tooLowMessage = yml.getString("config.tooLowMessage");
        tooHighMessage = yml.getString("config.tooHighMessage");
        return true;
    }

    public int getMinProtocol() {
        return this.minProtocol;
    }

    public int getMaxProtocol() {
        return this.maxProtocol;
    }

    public String getTooLowMessage() {
        return this.tooLowMessage;
    }

    public String getTooHighMessage() {
        return this.tooHighMessage;
    }

}
