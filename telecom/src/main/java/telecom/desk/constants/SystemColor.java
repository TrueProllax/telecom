
package telecom.desk.constants;

import java.awt.Color;

public final class SystemColor {
    
    // light
    
    private final static Color LIGHT_PANEL = new Color(236,238,248);
    private final static Color LIGHT_ACCENT = new Color (67, 98, 217);
    
    // dark
    
    private final static Color DARK_PANEL = new Color(45, 45, 69);
    private final static Color DARK_ACCENT = new Color (67, 98, 217);
    
    public static Color PANEL = LIGHT_PANEL; 
    public static Color ACCENT = LIGHT_ACCENT; 
    public static Color TEXT = Color.BLACK; 
    
    public SystemColor () {
        switchTheme(Theme.DARK);
    }
    
    public void switchTheme(Theme theme) {
        switch (theme) {
            case DARK:
                PANEL = DARK_PANEL;
                ACCENT = DARK_ACCENT;
            case LIGHT:
                PANEL = LIGHT_PANEL;
                ACCENT = LIGHT_ACCENT;
        }
    }
    
    public static enum Theme {
        DARK, LIGHT;
    }
}
