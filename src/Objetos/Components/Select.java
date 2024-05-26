/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Components;

import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author ACUS
 */
public class Select extends JComboBox{
    
    public Select(ArrayList<String> options, int x, int y, int width, int height){
        
        super(options.toArray(new String[options.size()]));
        this.setBounds(x, y, width, height);
        
    }
}
