
//Receiver class for quantum cryptography simulation
//By:Shavon Thadani
//Last Updated: February 4, 2021
import java.util.ArrayList;
import java.util.Arrays;

public class Receiver {
	// variables
	private ArrayList<Photon> key = new ArrayList<Photon>();
	private String outputMessage = "";
	private ArrayList<Integer> binaryMessage = new ArrayList<Integer>();

	// constructor
	public Receiver(int binaryMessageLength) {
		for (int i = 0; i < binaryMessageLength; i++) {
			key.add(new Photon());
		}
	}// end of constructor

	// getters
	public ArrayList<Photon> getKey() {
		return key;

	}

	public ArrayList<Integer> getBinaryMessage() {
		return binaryMessage;
	}

	public String getOutputMessage() {
		return outputMessage;
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
	// Setters

	// deciphers message (binary)
	public void setBinaryMessage(ArrayList<Integer> encryptedMessage, ArrayList<Integer> finalKey) {
		for (int h = 0; h < encryptedMessage.size(); h++) {
			if (finalKey.get(h) == 0 && encryptedMessage.get(h) == 0) {
				binaryMessage.add(0);
			} else if (finalKey.get(h) == 0 && encryptedMessage.get(h) == 1) {
				binaryMessage.add(1);
			} else if (finalKey.get(h) == 1 && encryptedMessage.get(h) == 0) {
				binaryMessage.add(1);
			} else if (finalKey.get(h) == 1 && encryptedMessage.get(h) == 1) {
				binaryMessage.add(0);
			}
		}
	}

	// converts binary message to characters (from stack overflow)
	public void setOutputMessage(ArrayList<Integer> binaryMessage) {
		String binary = "";
		for (int j = 0; j < binaryMessage.size(); j++) {
			binary += binaryMessage.get(j);
		}
		outputMessage = "";
		for (int i = 0; i < binary.length(); i += 8) {
			String input = binary.substring(i, i + 8); // Binary input as String
			StringBuilder sb = new StringBuilder(); // Some place to store the chars

			Arrays.stream( // Create a Stream
					input.split("(?<=\\G.{8})") // Splits the input string into 8-char-sections (Since a char has 8 bits
												// = 1 byte)
			).forEach(s -> // Go through each 8-char-section...
			sb.append((char) Integer.parseInt(s, 2)) // ...and turn it into an int and then to a char
			);

			outputMessage = outputMessage + sb.toString(); // Output text (t)
		}
	}

}
