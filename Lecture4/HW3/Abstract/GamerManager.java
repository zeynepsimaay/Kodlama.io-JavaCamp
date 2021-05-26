package Abstract;

import Entities.Gamer;

public abstract class GamerManager implements IGamerService {
	
	public void register(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+" olarak sisteme kayýt olundu.");
	}
	
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" olarak bilgiler güncellendi.");
	}
	
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" "+ gamer.getLastName() +" hesabýnýn sistemden kaydý silindi.");
	}

}
