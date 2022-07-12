import java.util.ArrayList;

public class Busta<T extends Frutto> {

	ArrayList<T> busta;

	public Busta() {
		this.busta = new ArrayList<T>();
	}
	
	
	public Double getPesoBusta() {
		Double pesoBusta = 0.0;
		
		for (Frutto f : busta) {
			pesoBusta += f.getPeso();
		}
		
		return pesoBusta;
	}
	
	public void aggiungi(T frutto) throws BustaRottaException {
		Double pesoMax = 2000.0;
		
		if ((getPesoBusta() + frutto.getPeso()) > pesoMax) {
			throw new BustaRottaException ("Attenzione! La busta si è rotta dopo aver inserito: " + frutto.getNome());
		} else {
			this.busta.add(frutto);
			System.out.println("La busta di frutta pesa: " + getPesoBusta() + "g");

		}
	}
	
	
}
