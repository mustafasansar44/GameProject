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
			System.out.println(user.getUsername() +" nickli kullanýcý eklendi.");
		}else {
			System.out.println("Lütfen bilgilerinizi doðru girdiðinizden emin olun.");
		}
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println(user.getUsername() +" nickli kullanýcý silindi.");
		
	}

	@Override
	public void setUser(User user) {
		System.out.println(user.getUsername() +" nickli kullanýcýnýn bilgileri deðiþtirildi.");
		
	}

}
