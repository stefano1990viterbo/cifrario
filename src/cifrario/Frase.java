package cifrario;

public class Frase  {
	
	private String fraseDaCifrare;
	
	private Cifrario cifrario;

	public Cifrario getCifrario() {
		return cifrario;
	}

	public void setCifrario(Cifrario cifrario) {
		this.cifrario = cifrario;
	}

	@Override
	public String toString() {
		return "Frase [cifrario=" + cifrario + "]";
	}

	public String getFraseDaCifrare() {
		return fraseDaCifrare;
	}

	public void setFraseDaCifrare(String fraseDaCifrare) {
		this.fraseDaCifrare = fraseDaCifrare;
	}

	
	
	
	  
	}
	
	


