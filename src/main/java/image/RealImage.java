package image;

import lombok.Getter;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Getter
public class RealImage implements ImageInterface {
    String filepath;
    BufferedImage img;

    public RealImage(String filepath) throws IOException {
        this.filepath = filepath;
        this.loadFromDisk();
    }

    void loadFromDisk() throws IOException {
        this.img = ImageIO.read(new File(this.filepath));
        System.out.printf("Image successfully loaded from %s", this.filepath);
    }

    @Override
    public void display() {
        ImageIcon icon = new ImageIcon(this.img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(icon.getIconWidth(),icon.getIconHeight());
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        RealImage image = new RealImage("./images/img.png");
        image.display();
    }
}
