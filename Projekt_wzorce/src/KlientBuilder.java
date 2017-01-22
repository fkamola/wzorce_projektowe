
public class KlientBuilder {
	protected Client klient;
	
	public KlientBuilder(){
		klient = new Client();
	}
	
	public KlientBuilder imie_nazwisko(String imie, String nazwisko){
		klient.setImie(imie);
		klient.setNazwisko(nazwisko);
		return this;
	}
	
	public KlientBuilder telefon(String telefon){
		klient.setTelefon(telefon);
		return this;
	}
	
	public KlientBuilder email(String email){
		klient.setEmail(email);
		return this;
	}
	
	public KlientBuilder adres(String adres){
		klient.setAdres(adres);
		return this;
	}
	
	public KlientBuilder PESEL(String string){
		klient.setPESEL(string);
		return this;
	}
	
	public Client get_Klient(){
		return klient;
	}
	
}
