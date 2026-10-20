package org.example.screen;

import java.awt.Color;
import java.awt.Font;

public final class Theme {
    public static final Color BG = new Color(35, 39, 47);
    public static final Color CARD = new Color(48, 54, 65);
    public static final Color BLUE = new Color(82, 141, 255);
    public static final Color GREEN = new Color(72, 190, 120);
    public static final Color AMBER = new Color(240, 181, 72);
    public static final Color RED = new Color(235, 92, 92);
    public static final Color MUTED = new Color(180, 188, 201);

    public static final Color BACKGROUND = new Color(35, 39, 47);
    public static final Color PANEL = new Color(48, 54, 65);
    public static final Color ACCENT = new Color(82, 141, 255);
    public static final Color TEXT = new Color(245, 247, 250);
    public static final Color MUTED_TEXT = new Color(180, 188, 201);
    public static final Font DISPLAY_FONT = new Font("SansSerif", Font.PLAIN, 30);
    public static final Font BUTTON_FONT = new Font("SansSerif", Font.BOLD, 18);

    public static Font sans(int style, int size) {
        return new Font("SansSerif", style, size);
    }

    private Theme() {
    }
}
