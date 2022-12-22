import javax.swing.*;
public class TestAnimation extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("C:\\Users\\ddkuz\\Documents\\2GU.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\ddkuz\\Documents\\c0M.gif").getImage());
        framlist.add(new ImageIcon("C:\\Users\\ddkuz\\Documents\\4T2o.gif").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 3; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}