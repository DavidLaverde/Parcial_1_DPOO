package parcial_1_autonomia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el cilindraje del vehículo (medido en centímetros cúbicos): ");
        double cilindraje = scanner.nextDouble();

        System.out.print("Ingrese el peso del vehículo (medido en kilos): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese el tamaño del tanque de combustible(medido en galones): ");
        double tamanioDeTanque = scanner.nextDouble();

        System.out.print("Ingrese el tipo de vehículo (carro/moto): ");
        String tipoVehiculo = scanner.next();

        if (tipoVehiculo.equalsIgnoreCase("carro")) {
            Carro carro = new Carro();
            carro.cilindraje = cilindraje;
            carro.peso = peso;
            carro.tamanioDeTanque = tamanioDeTanque;

            double autonomia = carro.autonomiaC();
            System.out.println("La autonomía del carro es: " + autonomia);
        } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
            Moto moto = new Moto();
            moto.cilindraje = cilindraje;
            moto.peso = peso;
            moto.tamanioDeTanque = tamanioDeTanque;

            double autonomia = moto.autonomiaM();
            System.out.println("La autonomía de la moto es: " + autonomia);
        } else {
            System.out.println("Tipo de vehículo no reconocido.");
        }

        scanner.close();
    }
}
