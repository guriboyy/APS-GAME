package main.pageFirst;

import javax.swing.*;
import java.awt.*;

public class Firstpage extends JFrame {
    public Firstpage(){
        setTitle("GameEcology");
        setResizable(true);
        setMinimumSize(new Dimension(1400, 800));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        add(new Button("Jogar",200, 350, new Color(112, 178, 73), this,1));
        add(new Button("Teclado",200, 450, new Color(112, 178, 73), this,2));
        add(new Button("Regras",200, 550, new Color(112, 178, 73), this, 3));
        add(new Backgroung());
        setVisible(true);
    }

}