package Practica;

public class PracticaArrays {
    public int calcularNumeroMayor(int[] array){
        int numeroMayor = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > numeroMayor){
                numeroMayor = array[i];
            }
        }
        return numeroMayor;
    }

    public int calcularNumeroMayorWhile(int[] array){
        int length = array.length - 1;
        int numeroMayor = 0;
        while(length > 0){
            if(array[length] > numeroMayor){
                numeroMayor = array[length];
            }
            length--;
        }
        return numeroMayor;
    }
}
