package Concrete;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.GameSale;
import Entities.User;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSale(User user, Campaign campaign, GameSale gameSale) {
		
		double priceWithDiscount = campaign.getDiscount()*(gameSale.getGamePrice()/100);
		
		System.out.println("Kullanici Adi - Soyadi: "+user.getFirstName() + " "+  user.getLastName());
		System.out.println("Kampanya Adý : " + campaign.getCampaignName());
		System.out.println("Kampanya indirim orani : " +" % " + campaign.getDiscount());
		System.out.println("Oyun adi : " + gameSale.getGameName());
		System.out.println("Stoktaki oyun sayisi : " +gameSale.getStockAmount());
		System.out.println("Oyun Fiyati : " + gameSale.getGamePrice() + " TL");
		System.out.println("Oyunun indirimli fiyati : " + priceWithDiscount + " TL ");
		
	}

}
