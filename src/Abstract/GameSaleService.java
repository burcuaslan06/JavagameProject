package Abstract;

import Entities.Campaign;
import Entities.GameSale;
import Entities.User;

public interface GameSaleService {

	void gameSale(User user, Campaign campaign, GameSale gameSale);
}
