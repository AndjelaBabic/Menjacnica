package interfejsi;

import java.util.GregorianCalendar;

import kursevi.Kurs;
import valute.Valuta;

public interface MenjacnicaInterfejs {
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, double prodajni,double srednji, double kupovni);
	public void brisiKurs(Valuta valuta, GregorianCalendar datum);
	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum);
}
