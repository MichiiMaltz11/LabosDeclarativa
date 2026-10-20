package org.example.screen.components;

import org.example.screen.Theme;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public final class PanelResult extends JPanel {
    private final JLabel title = new JLabel();
    private final JLabel text = new JLabel();

    public PanelResult() {
        setLayout(new BorderLayout());
        setBackground(Theme.CARD);
        setBorder(BorderFactory.createEmptyBorder(14, 16, 14, 16));
        title.setFont(Theme.sans(java.awt.Font.BOLD, 13));
        title.setForeground(Theme.TEXT);
        text.setFont(Theme.sans(java.awt.Font.PLAIN, 28));
        text.setForeground(Theme.TEXT);
        add(title, BorderLayout.NORTH);
        add(text, BorderLayout.CENTER);
    }

    public void setTitulo(String value) {
        title.setText(value);
    }

    public void setTexto(String value) {
        text.setText(value);
    }

    public String getTexto() {
        return text.getText();
    }
}
