package main.game;

import main.game.player.PlayerOne;
import main.game.player.PlayerTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BackgroundGame extends JPanel implements ActionListener {
    private Image image;
    private PlayerOne player1;
    private PlayerTwo player2;
    private Timer timer;

    public BackgroundGame(){
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon referencia = new ImageIcon("assets\\cenarioPixel.png");
        image = referencia.getImage();

        this.player1 = new PlayerOne();
        this.player1.load();

        this.player2 = new PlayerTwo();
        this.player2.load();

        addKeyListener(new KeyboardListener());

        timer = new Timer(5, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        int widthWindow = getWidth();
        int heightWindow = getHeight();
        graficos.drawImage(image, 0, 0, widthWindow, heightWindow, null);
        graficos.drawImage(player1.getImage(), player1.getX(), player1.getY(), this);
        graficos.drawImage(player2.getImage(), player2.getX(), player2.getY(), this);
        graficos.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player1.update();
        player2.update();
        repaint();
    }

    private class KeyboardListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            player1.keyPressed(e);
            player2.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            player1.keyReleased(e);
            player2.keyReleased(e);
        }
    }

}
