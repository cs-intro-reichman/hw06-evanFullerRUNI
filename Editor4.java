import java.awt.Color;

/**
 * Demonstrates the morphing+grayscale operation featured by Runigram.java. 
 * The program recieves 2 command-line arguments: a string representing the name
 * of the PPM file of a source image and the number of morphing steps (an int). 
 * For example, to morph the cake into grayscaled cake in 50 steps, use:
 * java Editor4 cake.ppm 50
 */
public class Editor4 {
    public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] grayImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, grayImage, n);
	}
}
