package image;

import java.io.IOException;

public class ProxyImage implements ImageInterface{
    RealImage realImage;
    String filename;

    public ProxyImage(String filepath) {
        this.filename = filepath;
    }

    @Override
    public void display() throws IOException {
        if (realImage == null)
            this.realImage = new RealImage(this.filename);
        this.realImage.display();
    }
}
