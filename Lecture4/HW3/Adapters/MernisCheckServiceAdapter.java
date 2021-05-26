package Adapters;

import java.rmi.RemoteException;


import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisCheckServiceAdapter implements IGamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer ) {
		
		KPSPublicSoapProxy player = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try {
			
			result= player.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		} 
		
		catch (NumberFormatException e) {
		
			e.printStackTrace();
		} 
		
		catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	
		
		
	}
	

}