
public class Main {

    public static String addLetters(String... letters) {

        String alfa = "zabcdefghijklmnopqrstuvwxy";
        int i = 0;
        for (String letter : letters) {
            i += alfa.indexOf(letter);
        }
        return   String.valueOf( alfa.charAt( i % alfa.length()) )   ;
    }


    public static void main(String[]args){
//        System.out.println( addLetters("a","b","c") );
//        System.out.println( addLetters("a") );
//        System.out.println( addLetters("y","b","c") );
        System.out.println( addLetters() );
    }


}
