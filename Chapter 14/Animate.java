// Your job is to take code snippets from the pool and place them into the blank
// lines in the code. You may use the same snippet more than once,
// and you won’t need to use all the snippets. Your goal is to make a
// class that will compile and run and produce the output listed.
//Page(508)


import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Animate {
    int x = 1;
    int y = 1;
    public static void main(String[] args) {
        Animate gui = new Animate ();
        gui.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++,y++,x++ ) {
            x++;
            drawP.repaint();
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch(Exception ex) { }
    }
}
class MyDrawP extends JPanel {
    public void paintComponent(Graphics g ) {
            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.blue);
            g.fillRect(x, y, 500-x*2, 250-y*2);
        }
    }
}