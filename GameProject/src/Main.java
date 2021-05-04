import Abstract.BaseCheckManager;
import Abstract.BaseUserManager;
import Abstract.CampaignManager;
import Abstract.GameManager;
import Entity.Game;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("deneme1", "deneme2", "12345123451");
		BaseUserManager userManager = new BaseUserManager(new BaseCheckManager());
		userManager.addUser(user1);
		
		Game game1 = new Game(1, "Age Of Empires", 100);
		GameManager gameManager = new GameManager();
		gameManager.buyGame(user1, game1);
		gameManager.sellGame(user1, game1, 100);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(user1, 10, game1);
		campaignManager.delete(user1, game1);
		campaignManager.update(user1, 15, game1);
	}

}
