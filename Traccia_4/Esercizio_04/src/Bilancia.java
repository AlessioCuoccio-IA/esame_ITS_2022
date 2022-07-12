
public class Bilancia {
	public static void main(String[] args) {
		
		Mela mela = new Mela("mela", 1000.0);
		Pera pera = new Pera("pera", 1000.0);
		Mela mela2 = new Mela("mela2", 500.0);
		
		Busta<Frutto> busta = new Busta<Frutto>();
		
		try {
			busta.aggiungi(pera);
		} catch (BustaRottaException e) {
			System.err.println(e.getMessage());
		}

		try {
			busta.aggiungi(mela);
		} catch (BustaRottaException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			busta.aggiungi(mela2);
		} catch (BustaRottaException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
