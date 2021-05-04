package Abstract;

import Entity.User;

public class BaseCheckManager implements ICheckUser{

	@Override
	public boolean userCheckService(User user) {
		if(!user.getUsername().isEmpty() && !user.getPassword().isEmpty() && user.getNationalNumber().length() == 11) 
		{
			return true;
		}else {
			return false;
		}
		
	}



}
