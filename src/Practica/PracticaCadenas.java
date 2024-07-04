package Practica;

public class PracticaCadenas {
    public char[] invertirCadena (char[] array) {
        int length = array.length;
        char[] arrayInvertido = new char[length];

        for (int i = 0; i < length; i++) {
            arrayInvertido[i] = array[length - 1 - i];
        }
        return arrayInvertido;
    }
}
