//import ij.ImageJ;
import net.imagej.ImageJ;
import net.imglib2.img.Img;
import net.imglib2.img.display.imagej.ImageJFunctions;
import ij.ImagePlus;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String imageFile = args[0];
        ImageJ ij = new ImageJ();
        try {
            Img input = (Img) ij.io().open(imageFile);
            ImageJFunctions.show(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
