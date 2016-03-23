package menjacnice;

import java.util.GregorianCalendar;

import interfejsi.MenjacnicaInterfejs;
import kursevi.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni) {
		// TODO Auto-generated method stub

	}

	@Override
	public void brisiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
