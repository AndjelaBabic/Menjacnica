package valute;

import java.util.LinkedList;

import kursevi.Kurs;

public class Valuta {
	private String naziv, skraceniNaziv;
	private LinkedList<Kurs> kursevi;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valuta){
			Valuta v=(Valuta) obj;
			return v.getNaziv().equals(naziv);
			}
		return false;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kursevi=" + kursevi + "]";
	}
	
	
	
	
}
