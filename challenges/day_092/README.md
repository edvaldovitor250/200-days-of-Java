# Day 92

## Desafio:

Escreva um programa Java que leia um texto e imprima a frequência de cada caractere.

**Resultado:**

```java

public class Day091 {

    public static void main(String[] args) {
        String str = "teste";
        caractereMaisFrequente(str);
    }

    public static void caractereMaisFrequente(String str) {
        int[] freq = new int[256];
        int max = 0;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("Caractere mais frequente: " + result);
    }

}

