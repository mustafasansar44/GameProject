package Abstract;

import Entity.Game;
import Entity.User;

public interface ICampaign {
	void add(User user, int campaignDiscount, Game game);
	void delete(User user,Game game);
	void update(User user, int campaignDiscount, Game game);
}
