
//Photon class for quantum cryptography simulation
//By:Shavon Thadani
//Last Updated: February 4, 2021
import java.util.concurrent.ThreadLocalRandom;

public class Photon {
	// Variables
	private String basis;
	private int bit;

	// Constructor
	public Photon() {
		// randomly generates a bit 0 or 1
		this.bit = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		// randomly generates a basis + (HV) or x + (45-45)
		if (ThreadLocalRandom.current().nextInt(1, 2 + 1) == 1) {
			this.basis = "+";
		} else {
			this.basis = "x";
		}

	}// end of constructor

	// getters

	// returns the bit
	public int getBit() {
		return bit;
	}

	// returns the basis
	public String getBasis() {
		return basis;
	}

	// setter
	public void setBit(int bit) {
		this.bit = bit;
	}

}
