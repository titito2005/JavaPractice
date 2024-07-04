import Practica.*;
import Practica.Tienda.ProductModel;
import Practica.Tienda.UserModel;
import Practica.Vehiculos.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        PracticaFactorial factorial = new PracticaFactorial();
        System.out.println(factorial.calcularFactorialRecursivo(5));
        System.out.println(factorial.calcularFactorialIterativo(5));

        PracticaArrays practicaArrays = new PracticaArrays();
        int[] array = {1,2,10,4,5,6};
        System.out.println(practicaArrays.calcularNumeroMayor(array));
        System.out.println(practicaArrays.calcularNumeroMayorWhile(array));

        PracticaCadenas practicaCadenas = new PracticaCadenas();
        char[] array = {'H', 'O', 'L', 'A'};
        System.out.println(practicaCadenas.invertirCadena(array));

        ProductModel productModel = new ProductModel(1, 100, "Carro");
        System.out.println(productModel.getId() + " " + productModel.getPrecio() + " " + productModel.getNombre());
        List<ProductModel> userProducts = new ArrayList<>();
        userProducts.add(productModel);
        UserModel userModel = new UserModel("Luis", userProducts);

        userModel.showProducts();
        userModel.removeProduct(1);
        userModel.showProducts();
        PracticaContarVocales practicaContarVocales = new PracticaContarVocales();
        char[] array = {'h', 'O', 'l', 'a'};
        int result = practicaContarVocales.ContarVocales(array);
        System.out.println(result);

        PracticaMatrices practicaMatrices = new PracticaMatrices();
        int[][] matrizA= {{2,2,2}, {3,3,3}};
        int[][] matrizB= {{2,2,2}, {2,2,2}};
        int[][] matrizC = practicaMatrices.calcularSumaMatrices(matrizA, matrizB);
        for (int i = 0; i< matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.print(matrizC[i][j] + "\t");
            }
            System.out.println();
        }

        PracticaMap practicaMap = new PracticaMap();
        practicaMap.addWords("Utilizar un iterador iterador iterador iterador iterador es una opción flexible y robusta para recorrer y trabajar con las entradas de un mapa en Java, especialmente cuando necesitas control adicional sobre la iteración o necesitas manipular la estructura del mapa mientras lo recorres");
        practicaMap.showWords();
         */

        Carro carro = new Carro("BMW", "Modelo", 5);
        carro.abrirMaletero();
        carro.realizarMantenimiento();
        carro.acelerar();
        carro.frenar();
    }
}