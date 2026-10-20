package org.example.screen.components;

import org.example.screen.Theme;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Insets;

public final class Buttons extends JButton {
    public Buttons(String text, Color background, Color foreground,
                   int horizontalPadding, int verticalPadding, int fontSize) {
        super(text);
        setFont(Theme.sans(java.awt.Font.BOLD, fontSize));
        setForeground(foreground);
        setBackground(background);
        setFocusPainted(false);
        setBorder(BorderFactory.createEmptyBorder(
                verticalPadding, horizontalPadding, verticalPadding, horizontalPadding));
        setMargin(new Insets(verticalPadding, horizontalPadding,
                verticalPadding, horizontalPadding));
    }
}
