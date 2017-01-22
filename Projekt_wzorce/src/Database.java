import java.util.ArrayList;

public class Database implements DatabaseOperations{

	private BazaKlientow base;
	
	public Database(){
		base = new BazaKlientow();
	}
	
	@Override
	public Client first_record(){
		return base.zwroc_liste().get(0);
	}
	
	@Override
	public Client last_record(){
		return base.zwroc_liste().get(base.zwroc_liste().size() - 1);
	}
	
	@Override
	public ArrayList<Client> get_list(){
		return base.zwroc_liste();
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException{
		return base.clone();
	}
	
	@Override
	public void list_clients(){
		base.wyswietl_klientow();
	}
	
	public void new_entry(Client client){
		base.dodaj_klienta(client);
	}
	
}
