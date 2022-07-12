import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Dipendente franco = new Dipendente("Franco", "DIRIGENTE", "15/01/2017");
		Dipendente gianna = new Dipendente("Gianna", "DIRIGENTE", "15/02/2016");
		Dipendente fabio = new Dipendente("Fabio", "QUADRO", "15/03/2019");
		Dipendente chiara = new Dipendente("Chiara", "QUADRO", "15/04/2018");
		Dipendente giada = new Dipendente("Giada", "IMPIEGATO", "15/05/2020");
		
		ArrayList<Dipendente> dipendenti = new ArrayList<>();
		dipendenti.addAll(Arrays.asList(franco, gianna, fabio, chiara, giada));
		
		Comparator<Dipendente> comparator = Comparator.comparing(Dipendente::getRuolo).thenComparing(Dipendente::calcolaMesiDiServizio);
		
		Collections.sort(dipendenti, comparator);
		
		
		System.out.println(dipendenti);

		
	}

}
