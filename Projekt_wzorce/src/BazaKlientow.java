import java.util.ArrayList;


public class BazaKlientow {
	
	private ArrayList<Klient> lista_klientow;
	
	public BazaKlientow(){
		lista_klientow = new ArrayList<Klient>();
	}
	
	
	public void dodaj_klienta(Klient klient){
		lista_klientow.add(klient);
	}
	
	public ArrayList<Klient> zwroc_liste(){
		return lista_klientow;
	}
	
	
}
