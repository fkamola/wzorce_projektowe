import java.util.ArrayList;
import java.util.Arrays;


public class BazaKlientow implements Cloneable {
	
	private ArrayList<Client> lista_klientow;
	
	public BazaKlientow(){
		lista_klientow = new ArrayList<Client>();
	}
	
	public BazaKlientow(ArrayList<Client> lista){
		this.lista_klientow = lista;
	}
	
	public void dodaj_klienta(Client klient){
		lista_klientow.add(klient);
	}
	
	public ArrayList<Client> zwroc_liste(){
		return lista_klientow;
	}
	
	public void wyswietl_klientow(){
		for(int i =0;i<lista_klientow.size();i++){
			System.out.println("Klient"+i+": " + lista_klientow.get(i).getImie() +" "+ lista_klientow.get(i).getNazwisko());
		}
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
			ArrayList<Client> temp = new ArrayList<Client>();
			
			for(Client c : this.zwroc_liste()){
				temp.add(c);
			}
			
			return new BazaKlientow(temp);
	}	

}
