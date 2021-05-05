package Entities;

public class GameSale {
	
	private int id;
	private String gameName;
	private double gamePrice;
	private int stockAmount;
	
	private GameSale() {
		
	}
	
	public GameSale(int id, String gameName, double gamePrice, int stockAmount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getGamePrice() {
		return gamePrice;
	}
	
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	

}
