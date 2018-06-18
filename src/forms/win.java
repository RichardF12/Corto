/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class win {
    //FactoryFactory Factory = new FactoryFactory();
    

    public int WIDTH = 1000, widthTF=120, widthB=50;
    public int HEIGHT = 600, heightTF=30, heightB=30;
    public JTextField textF1,textF2,textF3,textF4,textF5;
    public JButton button,button2,button3,button4,button5;
    public JLabel Label1,Label2,Label3,Label4,Label5,Label6;
    public JComboBox Type;

    public win() {}
   
    public void win(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(15,30,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(150,30,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(300,30,widthTF,heightTF));
        
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(500,30,widthTF,heightTF));
        
        textF5 = new JTextField();
        textF5.setBounds(new Rectangle(650,30,widthTF,heightTF));
               
        button = new JButton("Actualizar");
        button.setBounds(new Rectangle(10,75,85,heightB));
        
        button2 = new JButton("Eliminar");
        button2.setBounds(new Rectangle(80,75,85,heightB));
        
        button3 = new JButton("Limpiar");
        button3.setBounds(new Rectangle(155,75,85,heightB));
        
        button4 = new JButton("Insertar");
        button4.setBounds(new Rectangle(225,75,85,heightB));
        
        button5 = new JButton("Buscar");
        button5.setBounds(new Rectangle(590,75,80,heightB));
        
        Label1 = new JLabel("Nombre:");
        Label1.setBounds(new Rectangle(10,5,400,heightB));
        
        Label2 = new JLabel("Código:");
        Label2.setBounds(new Rectangle(500,5,400,heightB));
        
        Label3 = new JLabel("Precio:");
        Label3.setBounds(new Rectangle(150,20,widthTF,heightB));
        
        Label4 = new JLabel("Cantidad:");
        Label4.setBounds(new Rectangle(280,30,widthTF,heightB));
        
        Label5 = new JLabel("Disponibilidad:");
        Label5.setBounds(new Rectangle(630,30,widthTF,heightB));
        
        Label6 = new JLabel("Tipo:");
        Label6.setBounds(new Rectangle(340,30,widthTF,heightB));
        
        Type = new JComboBox();
        Type.setBounds(new Rectangle(840, 30, widthTF, heightB));
        
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(true);
        textF4.setEditable(true);
        textF5.setEditable(true);
      

      
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Label3.setText("Actualizar");
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Label3.setText("Eliminar");
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Label3.setText("Limpiar");
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Label3.setText("Insertar");
            }
        });
        
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Label3.setText("Buscar");
            }
        });

        
        add(textF1);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(textF2);
        add(textF3);
        add(textF4);
        add(Label1);
        add(Label2);
        add(Label3);
        add(Label4);
        add(Label5);
        add(Label6);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        

        
    }

}
