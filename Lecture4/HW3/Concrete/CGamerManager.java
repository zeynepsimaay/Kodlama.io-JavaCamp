package Concrete;

import Abstract.GamerManager;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class CGamerManager extends GamerManager{
	
	private IGamerCheckService gamerCheckService;
	
	public CGamerManager(IGamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}
	
	public void register(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.register(gamer);
		}else {
			System.out.println("Not a valid person.");
		}
	}
	
	public void update(Gamer gamer) {
		
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.update(gamer);
		}else {
			System.out.println("Not a valid person.");
		}
	}
	
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			super.delete(gamer);
		}else {
			System.out.println("Not a valid person.");
		}
	}

	

}
