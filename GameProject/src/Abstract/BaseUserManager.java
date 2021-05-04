package Abstract;

import Entity.User;

public class BaseUserManager implements IUser{
	
	BaseCheckManager checkManager;
	
	public BaseUserManager(BaseCheckManager checkManager) {
		this.checkManager = checkManager;
	}
	
	@Override
	public void addUser(User user) {
		if(checkManager.userCheckService(user)) {
			System.out.println(user.getUsername() +" nickli kullan�c� eklendi.");
		}else {
			System.out.println("L�tfen bilgilerinizi do�ru girdi�inizden emin olun.");
		}
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getUsername() +" nickli kullan�c� silindi.");
		
	}

	@Override
	public void setUser(User user) {
		System.out.println(user.getUsername() +" nickli kullan�c�n�n bilgileri de�i�tirildi.");
		
	}

}
