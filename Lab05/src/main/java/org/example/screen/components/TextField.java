package org.example.screen.components;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Insets;

import org.example.screen.Theme;

public final class TextField extends JTextField {
    public TextField(String placeholder) {
        this();
        setText(placeholder);
        selectAll();
    }

    public TextField() {
        setFont(Theme.DISPLAY_FONT);
        setForeground(Theme.TEXT);
        setBackground(Theme.PANEL);
        setCaretColor(Theme.TEXT);
        setHorizontalAlignment(RIGHT);
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Theme.ACCENT, 1),
                BorderFactory.createEmptyBorder(8, 12, 8, 12)));
        setMargin(new Insets(8, 12, 8, 12));
    }
}
