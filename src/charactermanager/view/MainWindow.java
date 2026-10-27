package charactermanager.view;

import charactermanager.model.Character;
import java.awt.*;
import java.util.List;
import javax.swing.*;

public class MainWindow extends JFrame {
    public static final int MIN_LEVEL_GOLD = 5;

    public MainWindow(List<Character> characters) {
        setTitle("Character Manager v0.4 - TP10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(AppTheme.COLOR_BACKGROUND);

        JPanel cardPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        cardPanel.setBackground(AppTheme.COLOR_BACKGROUND);
        cardPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (Character c : characters) {
            JPanel card = new JPanel();
            card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
            card.setOpaque(true);
            card.setBackground(AppTheme.colorFor(c.getType().name()));
            card.setBorder(AppTheme.BORDER_CARD);

            // Properti Tambahan 1: Tooltip detail
            card.setToolTipText("HP: " + c.getHitPoints() + " | Attack: " + c.getAttack() + " | Mana: " + c.getMana());

            // Properti Tambahan 2: setEnabled untuk level 1
            if (c.getLevel() == 1) {
                card.setEnabled(false);
            }

            JLabel nameLabel = new JLabel("Name: " + c.getName());
            JLabel typeLabel = new JLabel("Type: " + c.getType());
            JLabel levelLabel = new JLabel("Level: " + c.getLevel());

            nameLabel.setFont(AppTheme.FONT_TITLE);
            typeLabel.setFont(AppTheme.FONT_REGULAR);
            levelLabel.setFont(AppTheme.FONT_REGULAR);

            // Mini-Challenge: Level >= 5 teks emas & tebal
            if (c.getLevel() >= MIN_LEVEL_GOLD) {
                levelLabel.setForeground(AppTheme.COLOR_GOLD);
                levelLabel.setFont(AppTheme.FONT_BOLD);
            } else {
                levelLabel.setForeground(Color.WHITE);
            }
            nameLabel.setForeground(Color.WHITE);
            typeLabel.setForeground(Color.WHITE);

            card.add(nameLabel);
            card.add(typeLabel);
            card.add(levelLabel);

            cardPanel.add(card);
        }

        add(new JScrollPane(cardPanel), BorderLayout.CENTER);
        
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}