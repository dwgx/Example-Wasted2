package com.example.mod.utils;

import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.text.Text;
import net.minecraft.client.gui.widget.ButtonWidget.NarrationSupplier;

public class CustomButtonWidget extends ButtonWidget {

    public CustomButtonWidget(int x, int y, int width, int height, Text message, PressAction onPress, NarrationSupplier narrationSupplier) {
        super(x, y, width, height, message, onPress, narrationSupplier);
    }
}
