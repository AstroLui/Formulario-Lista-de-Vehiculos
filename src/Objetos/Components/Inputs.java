/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos.Components;

import java.awt.Cursor;
import javax.swing.JTextField;

/**
 *
 * @author ACUS
 */
public class Inputs extends JTextField {
    
    public Inputs(String placeholder, int x, int y, int width, int height){
        
        this.setText(placeholder);
        this.setBounds(x, y, width, height);
        
    }
    
    public JTextField get(){
        return this;
    }
    
}
