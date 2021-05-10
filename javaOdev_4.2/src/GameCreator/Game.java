package GameCreator;

public class Game {
	private String gameName;
	private String gameDeveloper;
	private int fiyat;
	private int indirim;
	
	public Game(String gameName, String gameDeveloper, int fiyat, int indirim) {
		super();
		this.gameName = gameName;
		this.gameDeveloper = gameDeveloper;
		this.fiyat = fiyat;
		this.indirim = indirim;
	}
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameDeveloper() {
		return gameDeveloper;
	}

	public void setGameDeveloper(String gameDeveloper) {
		this.gameDeveloper = gameDeveloper;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getIndirim() {
		return indirim;
	}

	public void setIndirim(int indirim) {
		this.indirim = indirim;
	}

	
}
