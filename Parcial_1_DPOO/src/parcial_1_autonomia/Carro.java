package parcial_1_autonomia;

public class Carro extends Vehiculo{
	public double autonomiaC() {
		return 15*(Math.pow(10, 4))/(this.cilindraje+this.peso)*this.tamanioDeTanque;
	}
}
