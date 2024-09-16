// This file is optional to edit and can be used for manual testing.

public class Main {
    
    /**
     * The entry point of the application.
     * 
     * This method creates a SimpleStringMethods object and manually tests its methods by calling them and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        SimpleStringMethods ssm = new SimpleStringMethods();
        String str = "Revature";

        System.out.println("Given that the string value is '" + str  + "'...");
        System.out.println("The length of the string is " + ssm.getStringLength(str));
        System.out.println("The character at index 2 is " + ssm.getCharacterAtIndex(str, 2));
        System.out.println("Character 'a' is at the index " + ssm.getIndexGivenCharacter(str, 'a'));
    }
}
