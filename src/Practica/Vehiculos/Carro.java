package Practica.Vehiculos;

public class Carro extends AbstractVehiculo{
    private int cilindrada;

    public Carro(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    // Implementación del método abstracto
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del automóvil " + getMarca() + " " + getModelo());
    }

    // Método específico de Automovil
    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del automóvil");
    }
}
