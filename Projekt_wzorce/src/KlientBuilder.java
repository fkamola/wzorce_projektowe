
public class KlientBuilder {
	protected Klient klient;
	
	public KlientBuilder(){
		klient = new Klient();
	}
	
	public KlientBuilder imie_nazwisko(String imie, String nazwisko){
		klient.imie = imie;
		klient.nazwisko = nazwisko;
		return this;
	}
	
	public KlientBuilder telefon(String telefon){
		klient.telefon = telefon;
		return this;
	}
	
	public KlientBuilder email(String email){
		klient.email = email;
		return this;
	}
	
	public KlientBuilder adres(String adres){
		klient.adres = adres;
		return this;
	}
	
	public KlientBuilder PESEL(int pesel){
		klient.PESEL = pesel;
		return this;
	}
	
	public Klient get_Klient(){
		return klient;
	}
	
}
