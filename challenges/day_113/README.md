# Day 113

## Desafio:

Escreva um programa Java que leia uma lista de palavras e imprima apenas as palavras únicas.	

**Resultado:**

```java

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day113 {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("casa", "carro", "casa", "carro", "moto", "casa", "moto", "casa", "carro", "moto");
        palavrasUnicas(palavras);
    }
    
    public static void palavrasUnicas(List<String> palavras){
        Set<String> palavrasUnicas = new HashSet<>(palavras);
        System.out.println(palavrasUnicas);
    }
}
