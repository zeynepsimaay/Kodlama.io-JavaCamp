package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GameCheckManager implements IGamerCheckService {
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
	}

}
