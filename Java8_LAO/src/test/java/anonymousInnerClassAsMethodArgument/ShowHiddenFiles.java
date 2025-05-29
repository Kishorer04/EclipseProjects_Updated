package anonymousInnerClassAsMethodArgument;

import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFiles {
	
	public static void usingAnonymousInnerClass() {
		File[] hiddenFiles = new File("C:/Users/kravikumar/OneDrive - GalaxE. Solutions, Inc/Desktop")
				
				.listFiles(new FileFilter() {

					@Override
					public boolean accept(File file) {
			
						return file.isHidden();
					}
				});
				
				for(File f: hiddenFiles)
					System.out.println(f.getName());
	}
	
	
	public static  void usingLambdaExpression() {
		
		File file = new File("C:/Users/kravikumar/OneDrive - GalaxE. Solutions, Inc/Desktop");
		
		File[] hiddenFiles = file.listFiles(desktopFile -> {
			                                               return desktopFile.isHidden();
		                                                   });
		
		for(File f: hiddenFiles)
			System.out.println(f.getName());
	}
	
	public static  void usingMethodReference() {
		
		
		File file = new File("C:/Users/kravikumar/OneDrive - GalaxE. Solutions, Inc/Desktop");
		File[] hiddenFiles = file.listFiles(File::isHidden);
            
		for(File f: hiddenFiles)
			System.out.println(f.getName());
	}

	
	
	
	
	public static void main(String[] args) {
		
		usingAnonymousInnerClass();
		usingLambdaExpression();
		usingMethodReference();
	}

}





//File file = new File("C:/Users/kravikumar/OneDrive - GalaxE. Solutions, Inc/Desktop");
//
//File[] hiddenFiless =file.listFiles(new FileFilter() {
//
//	@Override
//	public boolean accept(File file) {
//		
//		return file.isHidden();
//	}
//});
//
//for(File ff: hiddenFiless)
//	System.out.println(ff.getName());
//

