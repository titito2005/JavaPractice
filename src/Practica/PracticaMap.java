package Practica;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PracticaMap {
    private Map<String, Integer> wordCounter = new HashMap<>();

    public PracticaMap(){}

    public void addWords(String texto){
        String[] palabras = texto.split(" ");
        for (String palabra: palabras) {
            palabra = palabra.toLowerCase();
            if(wordCounter.containsKey(palabra)){
                int contador = wordCounter.getOrDefault(palabra, 0);
                wordCounter.put(palabra, contador+1);
            } else {
                wordCounter.put(palabra, 1);
            }

        }
    }

    public void showWords(){
        Iterator<Map.Entry<String, Integer>> iterator = wordCounter.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println("World: " + word + ", Count: " + count);
        }
    }
}
