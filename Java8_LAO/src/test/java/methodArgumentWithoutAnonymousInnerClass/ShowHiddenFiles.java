package methodArgumentWithoutAnonymousInnerClass;

import java.io.File;

public class ShowHiddenFiles {

	public static void main(String[] args) {
		
		File file = new File("C:/Users/kravikumar/OneDrive - GalaxE. Solutions, Inc/Desktop");
		
		
		File[] hiddenFiles = file.listFiles(new FileFilterImpl());
		
		for(File f : hiddenFiles)
			System.out.println(f.getName());

	}

}
