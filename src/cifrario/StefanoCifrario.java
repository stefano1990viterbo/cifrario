package cifrario;

public class StefanoCifrario implements Cifrario {
	@Override
	public void cripta(String frase) {
		System.out.println("cifrato da Stefano " + frase);

		String stringaInput = "";
		String[] stringaOutput = new String[100];
		char Output;
		int i, n = 0, num = 2;
		stringaInput = frase;
		n = stringaInput.length();

		for (i = 0; i < n; i++) {

			Output = stringaInput.charAt(i);
			Output = (char) (Output + num);
			stringaOutput[i] = "" + Output;
		}

		System.out.print("Ecco il tuo messaggio: ");
		for (i = 0; i < n; i++) {
			System.out.print(stringaOutput[i]);
		}

	}

}
