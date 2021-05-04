package Abstract;

import Entity.Game;
import Entity.User;

public class CampaignManager implements ICampaign{

	
	@Override
	public void add(User user, int campaignDiscount, Game game) {
		int discount = (game.getPrice() * (100 - campaignDiscount) / 100);
		System.out.println(user.getUsername() + " nickli oyuncu " + game.getName() + " adl� oyunu " + discount + " liradan kampanyal� olarak satt�." );	
	}

	@Override
	public void delete(User user, Game game) {
		System.out.println(user.getUsername() + " nickli oyuncu kampanyas�n� kald�rd�. �r�n�n yeni fiyat�: " + game.getPrice());
		
	}

	@Override
	public void update(User user, int campaignDiscount, Game game) {
		int discount = (game.getPrice() * (100 - campaignDiscount) / 100);
		System.out.println(user.getUsername() + " nickli oyuncu kampanyas�n� d�zenledi. �r�n�n yeni fiyat�: " + discount);
		
	}



}
