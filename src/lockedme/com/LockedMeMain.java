package lockedme.com;

public class LockedMeMain {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperation.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Thummuri Sai ganesh");
		
		HandleOptions.handleWelcomeScreenInput();
	}
}
