package property;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JPasswordField;

public class JpasswordroundedCustom extends JPasswordField {
    private Color fillColor;
    private Color lineColor;
    private int strokeWidth;
    private String placeholder;

    public JpasswordroundedCustom() {
        fillColor = new Color(236, 240, 241);
        lineColor = new Color(52, 152, 219);
        strokeWidth = 2;
        placeholder = "";
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(2, 10, 2, 10));
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth() - (2 * s);
            int h = getHeight() - (2 * s);
            g2d.setColor(fillColor);
            g2d.fillRoundRect(s, s, w, h, h, h);
            g2d.setStroke(new BasicStroke(s));
            g2d.setColor(lineColor);
            g2d.drawRoundRect(s, s, w, h, h, h);
            
            if (getPassword().length == 0 && !placeholder.isEmpty()) {
                g2d.setColor(getDisabledTextColor());
                g2d.setFont(getFont().deriveFont(Font.ITALIC));
                int x = getInsets().left;
                int y = (h - g2d.getFontMetrics().getHeight()) / 2 + getInsets().top + g2d.getFontMetrics().getAscent();
                g2d.drawString(placeholder, x, y);
            }
            
            g2d.dispose();
        }
        super.paintComponent(g);
    }
}