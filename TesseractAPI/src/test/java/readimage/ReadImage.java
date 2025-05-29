package readimage;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {

	public static void main(String[] args) throws TesseractException {
		
		ITesseract tes = new Tesseract();
		String result= tes.doOCR(new File("C:\\Users\\kravikumar\\OneDrive - GalaxE. Solutions, Inc\\Documents\\testimage5.png"));
		
          System.out.println(result);
	}

}
	