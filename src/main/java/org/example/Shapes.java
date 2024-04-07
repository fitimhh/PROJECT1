package org.example;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Shapes extends JPanel {
    private int choise;

    public Shapes(int userChoise){

        choise = userChoise;

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i = 0; i < 10; i++){
            switch (choise){
                case 1: // draw rectangles
                    g.drawRect(10 + i *10, 10 + i *10,
                            50 + i * 10, 50 + i * 10);
                    break;
                case 2: // draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10,
                            50 + i * 10, 50 + i * 10);
                    break;


            } // end switch
        } // end for
    } // end method paintComponent

} // end class Shapes
