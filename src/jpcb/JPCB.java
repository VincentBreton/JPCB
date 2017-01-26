/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpcb;

import java.awt.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.*;

import java.awt.Graphics2D;
import javax.swing.*;

/**
 *
 * @author Vincent Breton
 */

public class JPCB {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int largeur=800;
        int hauteur=600;
        
        JFrame frame = new JFrame("JPCB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(largeur, hauteur);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        
        MyPanel MonPaneau = new MyPanel(); 
        MonPaneau.setPreferredSize(new Dimension(100,100));
        frame.add(MonPaneau);

        frame.setVisible(true);
        
        //Grille padGrid = new Grille();
        //padGrid.setPasX(10);
        //padGrid.setPasY(15);
            
        //System.out.println(padGrid.getPasX());
        //System.out.println(padGrid.getPasY());
    }     
}
 
class MyPanel extends JPanel {
       @Override
       public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawLine(10, 10, 200, 200);
            g.drawOval(400,100,50,50);
            
            Graphics2D g2d = (Graphics2D)g;
            g2d.fillOval(100, 100, 50, 50);
            g2d.setStroke(new BasicStroke(5));
            g2d.drawLine(50,50,200,200); 
            
            g2d.setStroke(new BasicStroke(1)); 
            Grille maGrille = new Grille(g,this.getWidth(),this.getHeight());         
        }     
    } 


  
    

    
