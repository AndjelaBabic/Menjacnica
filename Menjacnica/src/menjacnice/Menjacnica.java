package menjacnice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import kursevi.Kurs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	private LinkedList<Valuta> valute;

	@Override
	public void dodajKurs(Valuta valuta, GregorianCalendar datum, double prodajni, double srednji, double kupovni) {
		// TODO Auto-generated method stub
		Kurs k = new Kurs();
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.getSrednji();
		k.setDatum(datum);
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)!=null){
				if(valute.get(i).equals(valuta)){
					valute.get(i).getKursevi().add(k);
					break;
				}
			}
		}

	}

	@Override
	public void brisiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)!=null){
					if(valute.get(i).equals(valuta)){
						for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
							Kurs k = valute.get(i).getKursevi().get(j);
							if(k.getDatum().equals(datum)){
								valute.get(i).getKursevi().remove(j);
							}
						}
					}
				}
		}
	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i)!=null){
					if(valute.get(i).equals(valuta)){
						for (int j = 0; j < valute.get(i).getKursevi().size(); j++) {
							Kurs k = valute.get(i).getKursevi().get(j);
							if(k.getDatum().equals(datum)){
								return k;
							}
						}
					}
				}
		}
		return null;
	}

}
