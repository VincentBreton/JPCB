/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpcb;

/**
 *
 * @author Vincent Breton
 */
public class Grille {
    private int pasX=0;
    private int pasY=0;
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
}
