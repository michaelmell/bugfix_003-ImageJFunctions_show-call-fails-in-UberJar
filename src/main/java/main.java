//import ij.ImageJ;
import net.imagej.ImageJ;
import net.imglib2.img.Img;
import net.imglib2.img.display.imagej.ImageJFunctions;
import ij.ImagePlus;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        String imageFile = new File("").getAbsolutePath() + "/src/main/resources/probabilities_watershedding_000.tif";

        ImageJ ij = new ImageJ();
        try {
            Img input = (Img) ij.io().open(imageFile);
            ImagePlus imp = ImageJFunctions.show(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
