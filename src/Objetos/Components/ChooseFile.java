package Objetos.Components;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ChooseFile extends JFileChooser
{
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG & GIF Images", "jpg", "gif", "png");
    public void ChooseFile()
    {
        this.setFileFilter(filter);
    }
    
    public JFileChooser get()
    {
        return this;
    }
    public File ShowDiag()
    {
        this.showDialog(null, APPROVE_SELECTION);
        return this.getSelectedFile();
    }
    
    public void getFile()
    {
        System.out.print(this.getSelectedFile().getName());
    }
}
