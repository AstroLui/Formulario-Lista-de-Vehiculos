package Objetos.Components;

import Objetos.Joy.JoyComponents;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;

public class Label extends JLabel implements JoyComponents{
    
    private URL iconUrl;
    public Label(){}
    
    public Label(int x, int y, int width, int height, URL url) throws IOException
    {
        this.iconUrl = url;
        BufferedImage img = ImageIO.read(url);
        var icon = new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
        this.setIcon(icon);
        this.setBounds(x,y,width,height);
    }
    
    public Label(String lblName, int x, int y, int width, int height)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, String font)
    {
        this.setText(lblName);
        this.setFont(fontSansThin.myFont(0, 14f));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, int style, float size)
    {
        this.setText(lblName);
        this.setFont(fontSans.myFont(style, size));
        this.setBounds(x, y, width, height);
    }
    
    public Label(String lblName, int x, int y, int width, int height, int style, float size, String font)
    {
        this.setText(lblName);
        this.setFont(fontSansThin.myFont(style, size));
        this.setBounds(x, y, width, height);
    }
    @Override
    public JComponent get() 
    {
        return this;
    }
    public URL getIconImage()
    {
        return this.iconUrl;
    }
}
