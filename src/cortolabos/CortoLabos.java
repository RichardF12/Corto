/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortolabos;

import javax.swing.JFrame;
import forms.win;

/**
 *
 * @author LN710Q
 */
public class CortoLabos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame win = new JFrame("Ventana");
        win.setContentPane(new win());
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);
        win.pack();
        win.setVisible(true);
    }
    
}
