public class SpecialCharacter {
    public static void main(String[] args) {
        // Initial string with potential multiple spaces
        String str = "san ika";
        
        // Replace multiple spaces with a single space and trim leading/trailing spaces
        str = str.replaceAll("\\s+", " ").trim();
        
        // Split the string into words based on spaces
        String[] words = str.split("\\s");
        
        // Print the number of words
        System.out.println(words.length);
    }
}
