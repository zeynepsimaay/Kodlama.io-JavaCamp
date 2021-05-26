package Concrete;

import Abstract.IGameService;
import Abstract.IGamerCheckService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements IGameService {

	private IGamerCheckService gamerCheckService;
	
	public GameManager(IGamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void sell(Game game, Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		
			System.out.println(game.getName()+ " isimli, "+ game.getPrice()+ " ücretli oyun "+ gamer.getFirstName()+ " " + gamer.getLastName() + " isimli kullanýcý tarafýndan satýn alýndý.");
		}else {
			System.out.println("Not a valid person.");
		}
	}

	
	

}
