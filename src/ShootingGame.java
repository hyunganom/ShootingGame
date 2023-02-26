
import javax.swing.*;
import java.awt.*;

public class ShootingGame  extends JFrame {
    private Image bufferImage;
    private Graphics screenGraphics;

    private Image mainScreen = new ImageIcon("src/images/main_screen.png").getImage();

    public ShootingGame(){
        setTitle("shooting Game");
        setUndecorated(true);
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
    }

    public void paint(Graphics g){
        bufferImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphics = bufferImage.getGraphics();
        screenDraw(screenGraphics);
        g.drawImage(bufferImage,0,0,null);
    }

    public void screenDraw(Graphics g){
        g.drawImage(mainScreen,0,0,null);
        this.repaint();
    }
}
