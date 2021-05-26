package Abstract;

import Entities.Gamer;

public abstract class GamerManager implements IGamerService {
	
	public void register(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+" olarak sisteme kay�t olundu.");
	}
	
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" olarak bilgiler g�ncellendi.");
	}
	
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() +" hesab�n�n sistemden kayd� silindi.");
	}

}
