package property;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import javax.swing.JPanel;


public class JpanelgradientCustom extends JPanel{
    
    private Color colorStart = Color.BLACK;
    private Color colorEnd = Color.WHITE;

    public Color getColorStart() {
        return colorStart;
    }

    public void setColorStart(Color colorStart) {
        this.colorStart = colorStart;
    }

    public Color getColorEnd() {
        return colorEnd;
    }

    public void setColorEnd(Color colorEnd) {
        this.colorEnd = colorEnd;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent (g);
        
      Graphics2D g2d = (Graphics2D) g;
      GradientPaint gradient = new GradientPaint(0, 0, colorStart, getWidth(), getHeight(), colorEnd);
      g2d.setPaint(gradient);
      g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
