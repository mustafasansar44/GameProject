package Abstract;

import Entity.Game;
import Entity.User;

public class GameManager implements IGame{
	
	
	public GameManager() {

	}

	@Override
	public void buyGame(User user, Game game) {
		System.out.println(user.getUsername() + " nickli oyuncu " + game.getName() + " adl� oyunu "+ game.getPrice() +" liradan sat�n ald�.");
	}


	@Override
	public void sellGame(User user, Game game, int price) {
		System.out.println(user.getUsername() + " nickli oyuncu " + game.getName() + " adl� oyunu "+ price +" liraya satt�.");
	}

}
