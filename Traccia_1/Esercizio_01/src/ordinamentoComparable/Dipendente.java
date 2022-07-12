package ordinamentoComparable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dipendente implements Comparable<Dipendente>{
	
	protected String nome;
	protected Ruolo ruolo;
	protected LocalDate data_assunzione;
	
	public Dipendente(String nome, String ruolo, String data_assunzione) {
		super();
		this.nome = nome;
		this.ruolo = Ruolo.valueOf(ruolo);
		this.data_assunzione = stringToLocalDate(data_assunzione);
	}

	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Ruolo getRuolo() {
		return ruolo;
	}



	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}



	public LocalDate getData_assunzione() {
		return data_assunzione;
	}



	public void setData_assunzione(LocalDate data_assunzione) {
		this.data_assunzione = data_assunzione;
	}



	private LocalDate stringToLocalDate(String data_assunzione2) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormattata = LocalDate.parse(data_assunzione2, dateTimeFormatter);
		return dataFormattata;
	}
	
	public Integer calcolaMesiDiServizio() {
		Integer diffAnni = (data_assunzione.getYear() - LocalDate.now().getYear()) * 12;
		Integer diffMesi = data_assunzione.getMonth().getValue() - LocalDate.now().getMonth().getValue();
		return diffAnni + diffMesi;
	}



	@Override
	public String toString() {
		return nome;
	}



	@Override
	public int compareTo(Dipendente dipendente) {
		Integer risultato = getRuolo().compareTo(dipendente.getRuolo());
		if (risultato == 0) {
			risultato = calcolaMesiDiServizio().compareTo(dipendente.calcolaMesiDiServizio());
		}
		return risultato;
	}

	
}
