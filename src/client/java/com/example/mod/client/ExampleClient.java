package com.example.mod.client;

import com.example.Global;
import com.example.mod.events.client.GameActionEvent;
import com.example.mod.handlers.ClientHandler;
import com.example.mod.server.ModuleServer;  // 导入 ModuleServer
import net.engio.mbassy.listener.Handler;
import net.fabricmc.api.ClientModInitializer;

import java.io.IOException;

public class ExampleClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        try {
            ModuleServer.startServer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Global.getEventBus().subscribe(this);
    }

    @Handler
    public void onGameAction(GameActionEvent event) {
        if (event.getAction().equals(GameActionEvent.Action.INIT)) {
            ClientHandler.getInstance().init();
        } else {
            ClientHandler.getInstance().shutdown();
        }
    }
}
