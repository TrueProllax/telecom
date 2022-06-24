package telecom.desk.swing;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;


public class LTextField extends JTextField {
    
    // shadow
    protected boolean shadowAdd = false; // off/on shadow
    protected Color shadowColor = Color.black;
    protected int shadowGap = 5; // разрыв
    protected int shadowOffset = 4; // смещение
    protected int shadowOpacity = 150;
    protected boolean shadowHighQuality = true;
    
    // gradient
    protected boolean gradientAdd = false; // off/on gradient
    protected Color gradientStartColor = Color.MAGENTA;
    protected Color gradientEndColor = Color.BLUE;
    protected int gradientFocus = 500;
    
    // round
    protected Dimension roundCorners = new Dimension(0, 0);
    
    // border
    protected int borderSize = 1;
    protected boolean borderAdd = false;
    protected Color borderColor = new Color (0,0,0);
    
    // border line
    
    protected int borderLineSize = 3;
    
    protected boolean borderLineLeftAdd = true;
    protected boolean borderLineUpAdd = false;
    protected boolean borderLineDownAdd = false;
    protected boolean borderLineRightAdd = false;
    
    protected Color borderLineRightColor = Color.BLUE;
    protected Color borderLineUpColor = Color.BLUE;
    protected Color borderLineDownColor = Color.BLUE;
    protected Color borderLineLeftColor = Color.BLUE;
    
    // circle effect
    
    protected int circleEffectSize = 60;
    protected int circleEffectOpacity = 50;
    protected boolean circleEffectAdd = false;
    protected Color circleEffectColor = new Color (255,255,255,circleEffectOpacity);
    protected boolean circleEffectGrad = false;
    
    public LTextField () {
        super();
        setBackground(new Color(255,255,255));
        initMouse();
        setOpaque(false);
        setBorder(null);
    }
    

    @Override
    protected void paintComponent (Graphics g) {
        
        int width = getWidth();
        int height = getHeight();
        int shadowGap = this.shadowGap;
        
        Color shadowColorA = new Color(shadowColor.getRed(), shadowColor.getGreen(), shadowColor.getBlue(), shadowOpacity);
        Graphics2D graphics = (Graphics2D) g;
 
        
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        

           
        if (shadowAdd) {
            graphics.setColor(shadowColorA);
            graphics.fillRoundRect(
                shadowOffset,// X position
                shadowOffset,// Y position
                width - borderSize - shadowOffset, // width
                height - borderSize - shadowOffset, // height
                roundCorners.width, roundCorners.height);// arc Dimension
        } else {
            shadowGap = 1;
        }

        graphics.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        int w = getWidth();
        int h = getHeight();

        GradientPaint gp = new GradientPaint(0, 0, gradientStartColor, gradientFocus, h, gradientEndColor);;

        if (gradientAdd) {
            graphics.setPaint(gp);
        } else {
            graphics.setColor(getBackground());
        }
        
        graphics.fillRoundRect(0, 0, width - shadowGap, height - shadowGap, roundCorners.width, roundCorners.height);
        
        
        
        if (borderAdd) {
            graphics.setColor(borderColor);
            graphics.setStroke(new BasicStroke(borderSize));
        }
        
        graphics.drawRoundRect(0, 0, width - shadowGap, height - shadowGap, roundCorners.width, roundCorners.height);

           
        graphics.setStroke(new BasicStroke());
        
        if (borderLineLeftAdd) {
            graphics.setColor(borderLineLeftColor);
            graphics.fillRect(0, 0, borderLineSize, getHeight());
        }
        
        if (borderLineRightAdd) {
            graphics.setColor(borderLineRightColor);
            graphics.fillRect(getWidth() - borderLineSize, 0, borderLineSize, getHeight());
        }
        
        if (borderLineUpAdd) {
            graphics.setColor(borderLineUpColor);
            graphics.fillRect(0, borderLineSize, getWidth(), getHeight() - borderLineSize);
        }
        
        if (borderLineDownAdd) {
            graphics.setColor(borderLineDownColor);
            graphics.fillRect(0, getHeight() - borderLineSize, getWidth(), borderLineSize);
        }
        
        graphics.setColor(getForeground());
        graphics.drawString(getText(), getFont().getSize(), ((getHeight() - shadowGap) + getFont().getSize()) / 2);
        
        if (circleEffectAdd) {
            if (mouseCircleEffect) {
                
                int red = this.getCircleEffectColor().getRed();
                int green = this.getCircleEffectColor().getGreen();
                int blue = this.getCircleEffectColor().getBlue();
                this.circleEffectColor = new Color(red,green,blue,circleEffectOpacity);
                
                if (circleEffectGrad) {
                    GradientPaint circleEffectGp = new GradientPaint(xCircle, yCircle, circleEffectColor, xCircle - (circleEffectSize / 2), yCircle - (circleEffectSize / 2), new Color(255,255,255,circleEffectOpacity/6), true);
                    graphics.setPaint(circleEffectGp);
                } else {
                    graphics.setColor(circleEffectColor);
                }
                
                graphics.fillOval(xCircle - (circleEffectSize / 2), yCircle - (circleEffectSize / 2), circleEffectSize, circleEffectSize);
            }
        }
        
        
        
        //super.paintComponent(graphics);
        
    }
    
    private int xCircle = 0;
    private int yCircle = 0;
    private boolean mouseCircleEffect = false;
    
    private void initMouse() {
        
        MouseAdapter mouseEvent = new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseCircleEffect = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseCircleEffect = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                xCircle = e.getX();
                yCircle = e.getY();
                repaint();
            }
        };
        addMouseListener(mouseEvent);
        addMouseMotionListener(mouseEvent);

    }
    
   
    // setters and getters

    public boolean isShadowAdd() {
        return shadowAdd;
    }

    public void setShadowAdd(boolean shadowAdd) {
        this.shadowAdd = shadowAdd;
    }

    public Color getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(Color shadowColor) {
        this.shadowColor = shadowColor;
    }

    public int getShadowGap() {
        return shadowGap;
    }

    public void setShadowGap(int shadowGap) {
        this.shadowGap = shadowGap;
    }

    public int getShadowOffset() {
        return shadowOffset;
    }

    public void setShadowOffset(int shadowOffset) {
        this.shadowOffset = shadowOffset;
    }

    public int getShadowOpacity() {
        return shadowOpacity;
    }

    public void setShadowOpacity(int shadowOpacity) {
        this.shadowOpacity = shadowOpacity;
    }

    public boolean isShadowHighQuality() {
        return shadowHighQuality;
    }

    public void setShadowHighQuality(boolean shadowHighQuality) {
        this.shadowHighQuality = shadowHighQuality;
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

    public Dimension getRoundCorners() {
        return roundCorners;
    }

    public void setRoundCorners(Dimension roundCorners) {
        this.roundCorners = roundCorners;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
        repaint();
    }

    public Color getCircleEffectColor() {
        return circleEffectColor;
    }

    public void setCircleEffectColor(Color circleEffectColor) {
        int red = circleEffectColor.getRed();
        int green = circleEffectColor.getGreen();
        int blue = circleEffectColor.getBlue();
        this.circleEffectColor = new Color(red,green,blue,circleEffectOpacity);
    }

    public int getCircleEffectSize() {
        return circleEffectSize;
    }

    public void setCircleEffectSize(int circleEffectSize) {
        this.circleEffectSize = circleEffectSize;
    }

    public int getCircleEffectOpacity() {
        return circleEffectOpacity;
    }

    public void setCircleEffectOpacity(int circleEffectOpacity) {
        this.circleEffectOpacity = circleEffectOpacity;
    }

    public boolean isCircleEffectAdd() {
        return circleEffectAdd;
    }

    public void setCircleEffectAdd(boolean circleEffectAdd) {
        this.circleEffectAdd = circleEffectAdd;
    }

    public boolean isCircleEffectGrad() {
        return circleEffectGrad;
    }

    public void setCircleEffectGrad(boolean circleEffectGrad) {
        this.circleEffectGrad = circleEffectGrad;
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

    public int getBorderLineSize() {
        return borderLineSize;
    }

    public void setBorderLineSize(int borderLineSize) {
        this.borderLineSize = borderLineSize;
    }

    public boolean isBorderLineLeftAdd() {
        return borderLineLeftAdd;
    }

    public void setBorderLineLeftAdd(boolean borderLineLeftAdd) {
        this.borderLineLeftAdd = borderLineLeftAdd;
    }

    public boolean isBorderLineUpAdd() {
        return borderLineUpAdd;
    }

    public void setBorderLineUpAdd(boolean borderLineUpAdd) {
        this.borderLineUpAdd = borderLineUpAdd;
    }

    public boolean isBorderLineDownAdd() {
        return borderLineDownAdd;
    }

    public void setBorderLineDownAdd(boolean borderLineDownAdd) {
        this.borderLineDownAdd = borderLineDownAdd;
    }

    public boolean isBorderLineRightAdd() {
        return borderLineRightAdd;
    }

    public void setBorderLineRightAdd(boolean borderLineRightAdd) {
        this.borderLineRightAdd = borderLineRightAdd;
    }

    public Color getBorderLineRightColor() {
        return borderLineRightColor;
    }

    public void setBorderLineRightColor(Color borderLineRightColor) {
        this.borderLineRightColor = borderLineRightColor;
    }

    public Color getBorderLineUpColor() {
        return borderLineUpColor;
    }

    public void setBorderLineUpColor(Color borderLineUpColor) {
        this.borderLineUpColor = borderLineUpColor;
    }

    public Color getBorderLineDownColor() {
        return borderLineDownColor;
    }

    public void setBorderLineDownColor(Color borderLineDownColor) {
        this.borderLineDownColor = borderLineDownColor;
    }

    public Color getBorderLineLeftColor() {
        return borderLineLeftColor;
    }

    public void setBorderLineLeftColor(Color borderLineLeftColor) {
        this.borderLineLeftColor = borderLineLeftColor;
    }
    
    
    
}
