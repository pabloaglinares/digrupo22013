/*
 * Clase para poner un fondo en el JDesktopPane del Main
 */

package classes;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author Alex
 */
public class FondoMain implements Border{
    
    public BufferedImage back;

    public FondoMain(String n) {
        try {
            URL imagePath = new URL(getClass().getResource("/images/fondo"+n+".jpg").toString());
            back = ImageIO.read(imagePath);
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        int x0 = x+ (width-back.getWidth())/2;
        int y0 = y+ (height-back.getHeight())/2;
        g.drawImage(back,x0,y0,null);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }   
}
