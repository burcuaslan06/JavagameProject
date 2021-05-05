import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameSaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.GameSale;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("******* User ********");
		User user = new User(1, "Burcu Fatma","Aslan", LocalDate.of(1992,7,11), "11");
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.save(user);
		userManager.update(user);
		userManager.delete(user);

		System.out.println("-------------------");
		
		System.out.println("******* Campaign ********");
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Kampanya 1");
		campaign.setDiscount(50);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		System.out.println("-------------------");

		System.out.println("******* Sale ********");
		
		GameSale gameSale = new GameSale(1, "Super Mario", 500 , 10);
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.gameSale(user, campaign, gameSale);
	}

}
