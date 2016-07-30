/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Boton_Inicio {
    JButton Start;
    JFrame jf = new JFrame("Botones con Java");    
    public Boton_Inicio();
            Dimension d = new Dimension();
            
    Start = new JButton("Start");        
        Start.setMargin(new Insets (3, 4, 3, 2));
        
        Start.addActionListener(this);
}
