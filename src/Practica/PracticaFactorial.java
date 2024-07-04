package Practica;

public class PracticaFactorial {
    public int calcularFactorialRecursivo (int n) {
        if(n > 0){
            return n * calcularFactorialRecursivo(n-1);
        } else {
            return 1;
        }
    }

    public int calcularFactorialIterativo (int n){
        int result = 1;
        while (n > 0){
            result *= n;
            n--;
        }
        return result;
    }
}
