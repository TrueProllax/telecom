
package telecom.desk.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LPanelTriangle extends JPanel {
    
    protected int backgroundOpacity = 250;
    
    // shadow
    protected boolean shadowAdd = false; // off/on shadow
    protected Color shadowColor = Color.black;
    protected int shadowOffsetX = 5; // разрыв
    protected int shadowOffsetY = 0; // смещение
    protected int shadowOpacity = 200;
    protected boolean shadowHighQuality = true;
    
    // gradient
    protected boolean gradientAdd = false; // off/on gradient
    protected Color gradientStartColor = Color.MAGENTA;
    protected Color gradientEndColor = Color.BLUE;
    protected int gradientFocus = 500;
    
    // round
    protected Dimension roundCorners = new Dimension(0, 0);
    
    // border
    protected int borderSize = 5;
    protected boolean borderAdd = true;
    protected Color borderColor = new Color (0, 0 , 0);
    protected int borderOpacity = 250;
    
    // cuscom coordianate
    
    protected boolean customCoordinateOn = false;
    
    protected int customCoordinateX1 = 0;
    protected int customCoordinateY1 = 0;
    
    protected int customCoordinateX2 = 0;
    protected int customCoordinateY2 = 0;
    
    protected int customCoordinateX3 = 0;
    protected int customCoordinateY3 = 0;
    
    
    public LPanelTriangle () {
        super();
        setOpaque(false);
        setBackground(new Color(255,255,255));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        Color colorPaintMain = new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), backgroundOpacity);
        Color colorPaintShadow = new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), shadowOpacity);

        if (customCoordinateOn) { /////////////////////////////////////////////
            
            int xC[] = {customCoordinateX1, customCoordinateX2, customCoordinateX3};
            int yC[] = {customCoordinateY1, customCoordinateY2, customCoordinateY3};
            
            if (shadowAdd) {
                int xNew[] = {xC[0], xC[1], xC[2]};
                int yNew[] = {yC[0], yC[1], yC[2] - shadowOffsetY};
                
                if (borderAdd) {
                    xNew[0] = xNew[0] + borderSize;
                    xNew[1] = xNew[1] - borderSize;
                    xNew[2] = xNew[2] + borderSize;
                    
                    yNew[0] = yNew[0] + (borderSize * 2);
                    yNew[1] = yNew[1] + 0;
                    yNew[2] = yNew[2] - (borderSize * 2);
                }

                // shadow

                int xS[] = {xC[0] + shadowOffsetX, xC[1] + shadowOffsetX, xC[2] + shadowOffsetX};
                int yS[] = {yC[0] + shadowOffsetY, yC[1] + shadowOffsetY, yC[2] + shadowOffsetY};
                
                g2.setColor(colorPaintShadow);
                g2.fillPolygon(xS, yS, 3);
                
                // border 
                if (borderAdd) {
                    methodBorderAdd(g2, xNew, yNew);
                } else{
                    
                }

                // main 
                
                GradientPaint gp = new GradientPaint(0, 0, gradientStartColor, gradientFocus, getHeight(), gradientEndColor);;

                if (gradientAdd) {
                    g2.setPaint(gp);
                } else {
                    g2.setColor(colorPaintMain);
                }
                
                g2.fillPolygon(xNew,yNew,3);

            } else {
                // border 
                if (borderAdd) {
                    methodBorderAdd(g2, xC, yC);
                }
                
                if (borderAdd) {
                    xC[0] = xC[0] + borderSize;
                    xC[1] = xC[1] - borderSize;
                    xC[2] = xC[2] + borderSize;
                    
                    yC[0] = yC[0] + (borderSize * 2);
                    yC[1] = yC[1] + 0;
                    yC[2] = yC[2] - (borderSize * 2);
                }
                
                GradientPaint gp = new GradientPaint(0, 0, gradientStartColor, gradientFocus, getHeight(), gradientEndColor);;

                if (gradientAdd) {
                    g2.setPaint(gp);
                } else {
                    g2.setColor(colorPaintMain);
                }
                
                g2.fillPolygon(xC, yC, 3);
            }
            
        } else { //////////////////////////////////////////////////////////////
            
            int xC[] = {0, getWidth() / 2, 0};
            int yC[] = {0, getHeight()/ 2, getHeight()};
            
            
            if (shadowAdd) {
                int xNew[] = {0, getWidth() / 2, 0};
                int yNew[] = {0, getHeight()/ 2, getHeight() - shadowOffsetY};
                
                if (borderAdd) {
                    xNew[0] = xNew[0] + borderSize;
                    xNew[1] = xNew[1] - borderSize;
                    xNew[2] = xNew[2] + borderSize;
                    
                    yNew[0] = yNew[0] + (borderSize * 2);
                    yNew[1] = yNew[1] + 0;
                    yNew[2] = yNew[2] - (borderSize * 2);
                }

                // shadow

                int xS[] = {xC[0] + shadowOffsetX, xC[1] + shadowOffsetX, xC[2] + shadowOffsetX};
                int yS[] = {yC[0] + shadowOffsetY, yC[1] + shadowOffsetY, yC[2] + shadowOffsetY};
                
                g2.setColor(colorPaintShadow);
                g2.fillPolygon(xS, yS, 3);
                
                // border 
                if (borderAdd) {
                    methodBorderAdd(g2, xNew, yNew);
                }

                // main 

                GradientPaint gp = new GradientPaint(0, 0, gradientStartColor, gradientFocus, getHeight(), gradientEndColor);;

                if (gradientAdd) {
                    g2.setPaint(gp);
                } else {
                    g2.setColor(colorPaintMain);
                }
                
                g2.fillPolygon(xNew,yNew,3);

            } else {
                
                if (borderAdd) {
                    xC[0] = xC[0] + borderSize;
                    xC[1] = xC[1] - borderSize;
                    xC[2] = xC[2] + borderSize;
                    
                    yC[0] = yC[0] + (borderSize * 2);
                    yC[1] = yC[1] + 0;
                    yC[2] = yC[2] - (borderSize * 2);
                }
                
                // border 
                if (borderAdd) {
                    methodBorderAdd(g2, xC, yC);
                }
                
                
                GradientPaint gp = new GradientPaint(0, 0, gradientStartColor, gradientFocus, getHeight(), gradientEndColor);;

                if (gradientAdd) {
                    g2.setPaint(gp);
                } else {
                    g2.setColor(colorPaintMain);
                }
                
                g2.fillPolygon(xC, yC, 3);
            }
        }
        

        super.paintComponent(g2);
        
    }

    public int getShadowOffsetX() {
        return shadowOffsetX;
    }

    public void setShadowOffsetX(int shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
    }

    public int getShadowOffsetY() {
        return shadowOffsetY;
    }

    public void setShadowOffsetY(int shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public boolean isShadowAdd() {
        return shadowAdd;
    }

    public void setShadowAdd(boolean shadowAdd) {
        this.shadowAdd = shadowAdd;
    }

    public boolean isCustomCoordinateOn() {
        return customCoordinateOn;
    }

    public void setCustomCoordinateOn(boolean customCoordinateOn) {
        this.customCoordinateOn = customCoordinateOn;
    }

    public int getCustomCoordinateX1() {
        return customCoordinateX1;
    }

    public void setCustomCoordinateX1(int customCoordinateX1) {
        this.customCoordinateX1 = customCoordinateX1;
    }

    public int getCustomCoordinateY1() {
        return customCoordinateY1;
    }

    public void setCustomCoordinateY1(int customCoordinateY1) {
        this.customCoordinateY1 = customCoordinateY1;
    }

    public int getCustomCoordinateX2() {
        return customCoordinateX2;
    }

    public void setCustomCoordinateX2(int customCoordinateX2) {
        this.customCoordinateX2 = customCoordinateX2;
    }

    public int getCustomCoordinateY2() {
        return customCoordinateY2;
    }

    public void setCustomCoordinateY2(int customCoordinateY2) {
        this.customCoordinateY2 = customCoordinateY2;
    }

    public int getCustomCoordinateX3() {
        return customCoordinateX3;
    }

    public void setCustomCoordinateX3(int customCoordinateX3) {
        this.customCoordinateX3 = customCoordinateX3;
    }

    public int getCustomCoordinateY3() {
        return customCoordinateY3;
    }

    public void setCustomCoordinateY3(int customCoordinateY3) {
        this.customCoordinateY3 = customCoordinateY3;
    }

    public int getBackgroundOpacity() {
        return backgroundOpacity;
    }

    public void setBackgroundOpacity(int backgroundOpacity) {
        this.backgroundOpacity = backgroundOpacity;
    }

    public int getShadowOpacity() {
        return shadowOpacity;
    }

    public void setShadowOpacity(int shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    public boolean isBorderAdd() {
        return borderAdd;
    }

    public void setBorderAdd(boolean borderAdd) {
        this.borderAdd = borderAdd;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getBorderOpacity() {
        return borderOpacity;
    }

    public void setBorderOpacity(int borderOpacity) {
        this.borderOpacity = borderOpacity;
    }

    public boolean isGradientAdd() {
        return gradientAdd;
    }

    public void setGradientAdd(boolean gradientAdd) {
        this.gradientAdd = gradientAdd;
    }

    public Color getGradientStartColor() {
        return gradientStartColor;
    }

    public void setGradientStartColor(Color gradientStartColor) {
        this.gradientStartColor = gradientStartColor;
    }

    public Color getGradientEndColor() {
        return gradientEndColor;
    }

    public void setGradientEndColor(Color gradientEndColor) {
        this.gradientEndColor = gradientEndColor;
    }

    public int getGradientFocus() {
        return gradientFocus;
    }

    public void setGradientFocus(int gradientFocus) {
        this.gradientFocus = gradientFocus;
    }
    

    
    public void methodBorderAdd(Graphics g, int xC[], int yC[]) {
        Color newBorderColor = new Color(borderColor.getRed(), borderColor.getGreen(), borderColor.getBlue(), borderOpacity);
        
        g.setColor(newBorderColor);
        
        int xB[] = {xC[0] - borderSize, xC[1] + borderSize, xC[2] - borderSize};
        int yB[] = {yC[0] - (borderSize * 2), yC[1], yC[2] + (borderSize * 2)};
        
        g.fillPolygon(xB, yB, 3);
    }

}
