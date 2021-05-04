package Abstract;

import Entity.Game;
import Entity.User;

public class CampaignManager implements ICampaign{

	
	@Override
	public void add(User user, int campaignDiscount, Game game) {
		int discount = (game.getPrice() * (100 - campaignDiscount) / 100);
		System.out.println(user.getUsername() + " nickli oyuncu " + game.getName() + " adlý oyunu " + discount + " liradan kampanyalý olarak sattý." );	
	}

	@Override
	public void delete(User user, Game game) {
		System.out.println(user.getUsername() + " nickli oyuncu kampanyasýný kaldýrdý. Ürünün yeni fiyatý: " + game.getPrice());
		
	}

	@Override
	public void update(User user, int campaignDiscount, Game game) {
		int discount = (game.getPrice() * (100 - campaignDiscount) / 100);
		System.out.println(user.getUsername() + " nickli oyuncu kampanyasýný düzenledi. Ürünün yeni fiyatý: " + discount);
		
	}



}
