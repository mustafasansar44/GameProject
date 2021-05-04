package Abstract;

import Entity.Game;
import Entity.User;

public interface IGame {
	void buyGame(User user, Game game);
	void sellGame(User user, Game game, int price);
}
