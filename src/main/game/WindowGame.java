package main.game;

import javax.swing.*;
import java.awt.*;

public class WindowGame extends JFrame {
    public WindowGame(){
        setTitle("Recycle Rush");
        setVisible(true);
        setMinimumSize(new Dimension(1400, 800));
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new BackgroundGame());
    }
}
