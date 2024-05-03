package main.game.player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class PlayerOne {
    private int x,y,dx,dy, width, height;
    private Image image;
    private int life;
    private int countColector;

    public PlayerOne(){
        this.x             = 100;
        this.y             = 100;
        this.life          = 3;
        this.countColector = 0;
    }

    public void load(){
        ImageIcon ref = new ImageIcon("assets\\player.png");
        this.image    = ref.getImage();
        this.width    = image.getWidth(null);
        this.height   = image.getHeight(null);
    }

    public void update(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e){
        int cod = e.getKeyCode();

        if(cod == KeyEvent.VK_W){
            this.dy = -6;
        }
        if(cod == KeyEvent.VK_S){
            this.dy = 6;
        }
        if(cod == KeyEvent.VK_A){
            this.dx = -6;
        }
        if(cod == KeyEvent.VK_D){
            this.dx = 6;
        }
    }
    public void keyReleased(KeyEvent e){
        int cod = e.getKeyCode();

        if(cod == KeyEvent.VK_W){
            this.dy = 0;
        }
        if(cod == KeyEvent.VK_S){
            this.dy = 0;
        }
        if(cod == KeyEvent.VK_A){
            this.dx = 0;
        }
        if(cod == KeyEvent.VK_D){
            this.dx = 0;
        }
    }

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLife(){return life;}
    public void setLife(){
        this.life -= 1;
    }

    public int getCountColector(){return countColector;}
    public void setCountColector(){
        this.countColector += 1;
    }

}
