package charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class AppTheme {
    public static final Color COLOR_PRIMARY = Color.decode("#2C3E50");
    public static final Color COLOR_ACCENT = Color.decode("#E74C3C");
    public static final Color COLOR_GOLD = Color.decode("#F1C40F");
    public static final Color COLOR_BACKGROUND = Color.decode("#ECF0F1");
    
    public static final Font FONT_TITLE = new Font("SansSerif", Font.BOLD, 16);
    public static final Font FONT_REGULAR = new Font("SansSerif", Font.PLAIN, 12);
    public static final Font FONT_BOLD = new Font("SansSerif", Font.BOLD, 12);
    
    public static final Border BORDER_CARD = BorderFactory.createLineBorder(Color.GRAY, 1);

    public static Color colorFor(String role) {
        if (role == null) return COLOR_PRIMARY;
        switch (role.toUpperCase()) {
            case "WARRIOR": return Color.decode("#3498DB");
            case "MAGE": return Color.decode("#9B59B6");
            case "ARCHER": return Color.decode("#E67E22");
            case "ROGUE": return Color.decode("#1ABC9C");
            default: return COLOR_PRIMARY;
        }
    }
}