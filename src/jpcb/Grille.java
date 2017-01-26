/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpcb;

import java.awt.BasicStroke;
import java.awt.Graphics;
/**
 *
 * @author Vincent Breton
 */
public class Grille {
    private int pasX=10;
    private int pasY=10;
    void setPasX(int pasX){
        this.pasX=pasX;
    }
    void setPasY(int pasY){
        this.pasY=pasY;
    }
    int getPasX(){
        return this.pasX;
    }
    int getPasY(){
        return this.pasY;
    }
    Grille(Graphics g, int width, int height){
        for(int n=0; n<width; n+=pasX){
            g.drawLine(n,0, n, height);
        }
        for(int n=0; n<height; n+=pasY){
            g.drawLine(0,n, width, n);
        }
    }
    void afficher(){
        
    }
}
