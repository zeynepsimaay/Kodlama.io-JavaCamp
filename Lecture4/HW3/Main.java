import java.time.LocalDate;

import Abstract.GamerManager;

import Adapters.MernisCheckServiceAdapter;
import Concrete.CGamerManager;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer("Zeynep Simay", "Kýlýnç", LocalDate.of(1998,11,10), "23185923520");
		
		Game game = new Game(1, "Sims","Life Simulator" , "$230");
		
		Campaign campaign = new Campaign(1, "'Summer Campaign'", "%15");
		
		
		
		GamerManager gamerManager = new CGamerManager(new MernisCheckServiceAdapter());
		gamerManager.register(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		GameManager gameManager =new GameManager(new MernisCheckServiceAdapter());
		gameManager.sell(game, gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		

	}

}
