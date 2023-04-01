package pl.protocolranges.events;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.ViaAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.protocolranges.ProtocolRanges;
import pl.protocolranges.data.DataHandler;

public class Events implements Listener {

    private final DataHandler dataHandler = ProtocolRanges.getInstance().getDataHandler();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        ViaAPI via = Via.getAPI();
        int version = via.getPlayerVersion(event.getPlayer());
        if(version < dataHandler.getMinProtocol()) {
            event.getPlayer().kickPlayer(dataHandler.getTooLowMessage());
        } else if(version > dataHandler.getMaxProtocol()) {
            event.getPlayer().kickPlayer(dataHandler.getTooHighMessage());
        }
    }


}
