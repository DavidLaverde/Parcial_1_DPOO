package parcial_1_autonomia;

public class Moto extends Vehiculo{
	public double autonomiaM() {
		return 8*(Math.pow(10, 4))/(this.cilindraje+2*this.peso)*this.tamanioDeTanque;
	}
}
