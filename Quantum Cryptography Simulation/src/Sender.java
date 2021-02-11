
//Sender class for quantum cryptography simulation
//By:Shavon Thadani
//Last Updated: February 4, 2021
import java.util.ArrayList;

public class Sender {
	// variables
	private ArrayList<Integer> binaryMessage = new ArrayList<Integer>();;
	private ArrayList<Photon> key = new ArrayList<Photon>();
	private String message;
	private String originalMessage;
	private ArrayList<Integer> encryptedMessage = new ArrayList<Integer>();

	// Constructor
	public Sender(String message) {
		// initialize variables
		originalMessage = message;
		this.message = convertStringToBinary((message));
		binaryMessage.add(Integer.parseInt(Character.toString(this.message.charAt(0))));

		// making key
		for (int i = 0; i < 3 * convertStringToBinary(message).length(); i++) {
			Photon photon = new Photon();
			key.add(photon);
		}
	}// end of constructor

	// helper method to convert string to binary (from stack overflow)
	public static String convertStringToBinary(String input) {

		StringBuilder result = new StringBuilder();
		char[] chars = input.toCharArray();
		for (char aChar : chars) {
			result.append(String.format("%8s", Integer.toBinaryString(aChar)) // char -> int, auto-cast
					.replaceAll(" ", "0") // zero pads
			);
		}
		return result.toString();

	}

	// getters
	public ArrayList<Photon> getKey() {
		return key;
	}

	public String getBinMessage() {
		return message;
	}

	public ArrayList<Integer> getEncryptedMessage() {
		return encryptedMessage;
	}

	public String getOriginalMessage() {
		return originalMessage;
	}

	public String getAllBasis() {
		String basis = "";
		for (int i = 0; i < key.size(); i++) {
			basis = basis + " " + key.get(i).getBasis();
		}
		return basis;
	}

	public String getAllBits() {
		String bits = "";
		for (int i = 0; i < key.size(); i++) {
			bits = bits + " " + key.get(i).getBit();
		}
		return bits;
	}

	// Setter
	// Create encrypted message made by Sender by binary addition
	public void setEncryptedMessage(ArrayList<Integer> finalKey) {

		for (int k = 0; k < message.length(); k++) {
			if (finalKey.get(k) == 0 && Character.toString(this.message.charAt(k)).equals("0")) {
				encryptedMessage.add(0);
			} else if (finalKey.get(k) == 0 && Character.toString(this.message.charAt(k)).equals("1")) {
				encryptedMessage.add(1);
			} else if (finalKey.get(k) == 1 && Character.toString(this.message.charAt(k)).equals("0")) {
				encryptedMessage.add(1);
			} else if (finalKey.get(k) == 1 && Character.toString(this.message.charAt(k)).equals("1")) {
				encryptedMessage.add(0);
			}

		}
	}
}