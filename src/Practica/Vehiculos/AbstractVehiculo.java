package Practica.Vehiculos;

public abstract class AbstractVehiculo implements IVehiculo {
        private String marca;
        private String modelo;

        // Constructor
        public AbstractVehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        // Métodos getters
        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        // Método común implementado
        @Override
        public void acelerar() {
            System.out.println("Acelerando el vehículo " + marca + " " + modelo);
        }

        // Método común implementado
        @Override
        public void frenar() {
            System.out.println("Frenando el vehículo " + marca + " " + modelo);
        }

        // Método abstracto que cada subclase debe implementar
        public abstract void realizarMantenimiento();
}
