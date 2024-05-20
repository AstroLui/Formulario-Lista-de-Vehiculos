package Objetos.Joy;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomFont 
{
    private Font font = null;
    public CustomFont(String nameFont)
    {
        try
        {
            InputStream is = new BufferedInputStream(new FileInputStream("src/Fonts/" + nameFont));
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        }
        catch(FontFormatException | IOException e)
        {
            System.out.println(e.getMessage() + e.getLocalizedMessage());
            font = new Font("Monospace", Font.PLAIN, 40);
        }
    }
    
    public Font myFont(int style, float Size)
    {
        Font rFont = font.deriveFont(style, Size);
        return rFont;
    }
}
