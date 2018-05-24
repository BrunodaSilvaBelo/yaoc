package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import morphology.BaseMorphology;
import morphology.ConvolutionKernel;
import morphology.Erode;
import morphology.Grayscale;
import morphology.Identity;
import morphology.Sobel;
import morphology.Threshold;

public class Portrait extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 300, 300);
        frame.getContentPane().add(new Portrait());
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        BufferedImage img;
        try {
            img = ImageIO.read(ClassLoader.getSystemResource("hamster.jpg"));
            g.drawImage(BaseMorphology.reduce()
                                      .apply(img),
                        0, 0, this);
        } catch (IOException e) {
            Logger.getLogger(Portrait.class.getName()).severe(e.getMessage());
        }
    }
}
