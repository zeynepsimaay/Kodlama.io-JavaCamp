
public class UserManager {
	public void LogIn(User user) {
		System.out.println(user.getFirstName()+ " "+user.getLastName()+" olarak sisteme giris yapildi.");
	}
	
	public void LogOut(User user){
		System.out.println("Sistemden cikis yapiliyor.");
	}
}
