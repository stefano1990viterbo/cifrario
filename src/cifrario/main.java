package cifrario;



public class main {

	public static void main(String[] args) {
		//-------------------------------------------
		Frase f = new Frase();

		f.setCifrario(new CesareCifrario());

		f.getCifrario().cripta("bravo");

		
		//-------------------------------------------
		f.setFraseDaCifrare("ok");
		
		Cifrario c = new CesareCifrario();
		c.cripta(f.getFraseDaCifrare());
		// -------------------------------------------

		Cifrario s = new StefanoCifrario();
		s.cripta("prova");

	}

}
