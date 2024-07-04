package Practica;

public class PracticaContarVocales {
    public int ContarVocales (char[] array){
        int vocales = 0;
        for(int i = 0; i < array.length; i++){
            char letra = Character.toUpperCase(array[i]);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' ){
                vocales++;
            }
        }
        return vocales;
    }
}
