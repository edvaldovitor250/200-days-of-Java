public class Day120 {

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        tamnhoDasPalavras(text);
    }

    public static void tamnhoDasPalavras(String text){
        String[] words = text.split(" ");
        int maxWordLength = 0;
        for (String word : words) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }
        System.out.println("Tamanho máximo das palavras: " + maxWordLength);
    }
    
}
