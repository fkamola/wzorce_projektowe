import java.util.ArrayList;

public interface DatabaseOperations {
	
	public Client last_record();
	public Client first_record();
	public void new_entry(Client client);
	public ArrayList<Client> get_list();
	public void list_clients();
	public Object clone() throws CloneNotSupportedException;
	
}
