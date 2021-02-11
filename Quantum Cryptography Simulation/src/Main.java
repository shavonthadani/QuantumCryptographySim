
//Main class for quantum cryptography simulation
//By:Shavon Thadani
//Last Updated: February 4, 2021
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	// method to save and write a file
	private static void newFile(String message, String prompt) {
		PrintWriter output = Prompt.getPrintWriter(prompt);
		output.print(message);
		output.close();
	}

	public static void main(String[] args) {
		// variables
		ArrayList<Integer> finalKey = new ArrayList<Integer>();
		// initialize sender and receiver
		Sender Sandy = new Sender(Prompt.getString("enter your message that you want to send securely"));
		Receiver Bob = new Receiver(Sandy.getKey().size());

		// compare basis' between sender and receiver
		for (int j = 0; j < Bob.getKey().size(); j++) {
			if (Bob.getKey().get(j).getBasis() == Sandy.getKey().get(j).getBasis()) {
				// Bob using basis to measure photons
				Bob.getKey().get(j).setBit(Sandy.getKey().get(j).getBit());
			}
		}
		// deleting random bits of the key
		for (int i = 0; i < Bob.getKey().size(); i++) {
			if (Bob.getKey().get(i).getBasis() == Sandy.getKey().get(i).getBasis()) {
				finalKey.add(Sandy.getKey().get(i).getBit());
			}
		}

		// Create encrypted message made by Sender by binary addition
		Sandy.setEncryptedMessage(finalKey);
		// Create binary message through Sandy's encrypted message and the key
		Bob.setBinaryMessage(Sandy.getEncryptedMessage(), finalKey);
		// convert to characters from binary for Receiver
		Bob.setOutputMessage(Bob.getBinaryMessage());

		// contents for Sandy's file
		String sandyContent = "Original Message: " + Sandy.getOriginalMessage() + " \n\nMessage in Binary: "
				+ Sandy.getBinMessage() + " \n\nSender's Random Basis: " + Sandy.getAllBasis()
				+ " \n\nReceiver's Random Basis: " + Bob.getAllBasis() + " \n\nRandom bits made for key: "
				+ Sandy.getAllBits() + " \n\nTop Secret key: " + finalKey + " \n\nEncrypted Message: "
				+ Sandy.getEncryptedMessage();
		// contents for Bob's file
		String bobContent = "Encrypted binary message: " + Sandy.getEncryptedMessage()
				+ " \n\nReceiver's Random Basis: " + Bob.getAllBasis() + " \n\nSender's Random Basis: "
				+ Sandy.getAllBasis() + " \n\nBits measured with photons from key before deletion: " + Bob.getAllBits()
				+ " \n\nTop Secret Key after deletion: " + finalKey + " \n\nFinal Binary Message: "
				+ Bob.getBinaryMessage() + " \n\nFinal Secret Message: " + Bob.getOutputMessage();

		// saving files
		newFile(sandyContent, "enter the file name for Sandy's information:");
		newFile(bobContent, "enter the file name for Bob's information:");
		System.out.println("Files saved");
	}

}
