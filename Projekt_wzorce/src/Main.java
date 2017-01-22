import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Client klient_1;
		Client klient_2;
		Client klient_3;
		Client klient_4;
		
		KlientBuilder nowy_1 = new KlientBuilder();
		KlientBuilder nowy_2 = new KlientBuilder();
		KlientBuilder nowy_3 = new KlientBuilder();
		KlientBuilder nowy_4 = new KlientBuilder();
		
		klient_1 = nowy_1
				.imie_nazwisko("Stefan", "Batory")
				.telefon("123-456-789")
				.email("stefan.batory@gmail.com")
				.get_Klient();
		
		klient_2 = nowy_2
				.imie_nazwisko("Henryk", "Wielki")
				.telefon("123-456-789")
				.PESEL("8542147528")
				.adres("Ogólna 22, 80-375 Wroc³aw")
				.get_Klient();
		
		klient_3 = nowy_3
				.imie_nazwisko("Zygmunt", "Waza")
				.telefon("123-456-789")
				.PESEL("188456552")
				.adres("Kwiatowa 56, 80-375 Cz³uchów")
				.email("zigi@o2.pl")
				.get_Klient();
		
		klient_4 = nowy_4
				.imie_nazwisko("Alojzy", "Kleks")
				.telefon("123-456-789")
				.PESEL("188456552")
				.adres("Lipowa 34, 80-375 Warszawa")
				.email("kleks@o2.pl")
				.get_Klient();
		
		
		Database db = new Database();
		db.new_entry(klient_1);
		db.new_entry(klient_2);
		db.new_entry(klient_3);

		BazaKlientow db_2 = (BazaKlientow) db.clone();
		
		db_2.dodaj_klienta(klient_4);
	
		db.list_clients();
		
		System.out.println();
		
		db_2.wyswietl_klientow();
		
	}
	
}
