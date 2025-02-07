package com.example.mod.features.task.impl;

import com.example.mod.features.task.AbstractTask;
import com.example.mod.features.task.Task;
import com.example.mod.utils.player.ChatUtils;

import static com.example.mod.client.GameAccessor.mc;

public class ChatTask extends AbstractTask {
    private final String message;

    public ChatTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() throws Exception {
        mc.getNetworkHandler().sendChatMessage(this.message);
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onFailure(Exception e) {

    }

    public String getMessage() {
        return message;
    }
}
