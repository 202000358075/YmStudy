package single;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class  MyFrame extends JFrame{
    String str;
    MyFrame(String title){
        setTitle(title);
        Moon moon=Moon.getMoon();     
        str=moon.show();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        repaint();
   } 
    public void paint(Graphics g){
          super.paint(g);
          g.setFont(new Font("ËÎÌו",Font.BOLD,14));
          g.drawString(str,5,100);
    }
}

