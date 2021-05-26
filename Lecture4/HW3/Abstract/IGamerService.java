package Abstract;

import Entities.Gamer;

public interface IGamerService {
	
	public void register(Gamer gamer);
	
	public void update(Gamer gamer);
	
	public void delete(Gamer gamer);
}
