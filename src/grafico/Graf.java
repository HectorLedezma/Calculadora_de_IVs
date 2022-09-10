/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author hectorledez el gamer
 */
public class Graf extends JPanel{
    Random rand = new Random();
    public int X[] = {277/2, 554/2, 554/2, 277/2,   0/2, 0/2};//+277
        
    public int Y[] = {0/2  , 160/2, 480/2, 640/2, 480/2, 160/2};//-320

    public Graf() {
    }

    public int[] getPX() {
        return X;
    }

    public int[] getPY() {
        return Y;
    }

    
    public void setX(int[] X) {
        this.X = X;
    }

    public void setY(int[] Y) {
        this.Y = Y;
    }

    private int a = rand.nextInt(5);
    public void pa(){
        System.out.println(a);
        
    }
    
    
    public void paint(Graphics g){
        
        int[] Px = {(277/2), (554/2), (554/2), (277/2),   (0/2), (0/2)};
        int[] Py = {(0/2)  , (160/2), (480/2), (640/2), (480/2), (160/2)};
        super.paint(g);
        g.drawPolygon(Px, Py, 6);
        g.setColor(Color.white);
        g.fillPolygon(Px, Py, 6);
        g.setColor(Color.BLACK);
    }
    
    
    
    public static void main(String[]args){
        String h = "hola "+4+"K";
        String b = h.replace(""+4+"", ""+8+"");
        System.out.println(b);
    }
}
