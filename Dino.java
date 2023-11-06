package game.Dino;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Dino {

    /* This is a Jumping Dino Game
     * Let us see what I can code 
     */
    // Game gravity
    private final float GRAVITY = -10; // 10 m / s²
    boolean life = false;
    double moveSpeed = 5;
    int worldX = 800;
    int worldY = 800;

    //Code to get input
    private void getInput(){
        xMove = 0;
        //Gravity
        yMove = 5;
    
        if(handler.getKeyManager().enter)
            xMove = speed;
        if(handler.getKeyManager().jumping)
            //this makes my player fly
            yMove = -speed;
    }
 
    public static void main(String []args) {
       System.out.println("Controls: Jump with Space");  
       System.out.println("Press Enter to start!");

       
    }
 }