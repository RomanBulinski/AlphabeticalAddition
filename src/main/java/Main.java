
public class Main {

    public static String addLetters(String... letters) {

        String alfa = "zabcdefghijklmnopqrstuvwxy";
        int i = 0;
        for (String letter : letters) {
            i += alfa.indexOf(letter);
        }
        return   String.valueOf( alfa.charAt( i % alfa.length()) )   ;
    }
    
}
